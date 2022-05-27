package pl.edu.pwr.rsi.grpc.service;

import com.google.protobuf.ByteString;
import pl.edu.pwr.rsi.grpc.interfaces.lib.*;

import io.grpc.stub.StreamObserver;

import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.Base64;
import java.util.stream.Stream;

// serwer
// serwer rozszerza klase bazowa wygenerowana na podstawie pliku proto
@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    ArrayList<Integer> pokemonIds = new ArrayList<>();
    ArrayList<String> pokemonNames = new ArrayList<>();
    ArrayList<Float> pokemonWeights = new ArrayList<>();
    ArrayList<Integer> pokemonGenerations = new ArrayList<>();
    byte[] image;

    // implementacja metody testowej - serwer "wita sie z" klientem
    // grpcurl --plaintext -d "{\"name\": \"test\"}" localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/SayHello
    @Override
    public void sayHello(SimpleRequest request, StreamObserver<SimpleReply> responseObserver) {
        SimpleReply reply = SimpleReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody pomocniczej - serwer informuje klienta, ile rekordow jest zapisane
    @Override
    public void recordsCount(EmptyRequest request, StreamObserver<CountReply> responseObserver) {
        CountReply reply = CountReply.newBuilder().setCount(pokemonNames.size()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody wgrania danych na serwer - serwer zapisuje dane klienta
    // grpcurl --plaintext -d "{\"pokemonId\": 1, \"pokemonName\": \"Bulbasaur\", \"pokemonWeight\": 6.9, \"pokemonGeneration\": 1}" localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/Upload
    // grpcurl --plaintext -d "{\"pokemonId\": 25, \"pokemonName\": \"Pikachu\", \"pokemonWeight\": 6.0, \"pokemonGeneration\": 1}" localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/Upload
    @Override
    public void upload(UploadRequest request, StreamObserver<SimpleReply> responseObserver) {
        pokemonIds.add(request.getPokemonId());
        pokemonNames.add(request.getPokemonName());
        pokemonWeights.add(request.getPokemonWeight());
        pokemonGenerations.add(request.getPokemonGeneration());
        String data = "pokedex id " + request.getPokemonId() + ", name " + request.getPokemonName() + ", weight " + request.getPokemonWeight() + ", generation " + request.getPokemonGeneration();
        SimpleReply reply = SimpleReply.newBuilder().setMessage("Data uploaded to server: " + data).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody czytania danych z serwera - serwer znajduje dane, o ktore prosil klient
    // grpcurl --plaintext -d "{\"name\": \"Bulbasaur\"}" localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/Read
    // grpcurl --plaintext -d "{\"name\": \"Pikachu\"}" localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/Read
    @Override
    public void read(SimpleRequest request, StreamObserver<SimpleReply> responseObserver) {
        SimpleReply reply;
        if (!pokemonNames.contains(request.getName()))
            reply = SimpleReply.newBuilder().setMessage("No data found").build();
        else {
            int id = pokemonNames.indexOf(request.getName());
            String data = "pokedex id " + pokemonIds.get(id) + ", name " + request.getName() + ", weight " + pokemonWeights.get(id) + ", generation " + pokemonGenerations.get(id);
            reply = SimpleReply.newBuilder().setMessage("Fetched data: " + data).build();
        }
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody asynchronicznego czytania danych z serwera
    // grpcurl --plaintext localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/ReadAsync
    @Override
    public void readAsync(EmptyRequest request, StreamObserver<SimpleReply> responseObserver) {
        System.out.println("Async method called. Sending data to client.");
        Thread other = new Thread(() -> {
            StringBuilder data = new StringBuilder("Fetched data:\n");
            for (int i = 0; i < pokemonNames.size(); i++)
                data.append("pokedex id ").append(pokemonIds.get(i)).append(", name ").append(pokemonNames.get(i)).append(", weight ").append(pokemonWeights.get(i)).append(", generation ").append(pokemonGenerations.get(i)).append("\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SimpleReply reply = SimpleReply.newBuilder().setMessage(data.toString()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        });
        other.start();
        System.out.println("Finished sending data to client.");
    }

    // implementacja metody strumieniowego wgrywania danych na serwer
    // grpcurl --plaintext -d @ localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/StreamUpload
    // {"pokemonId": 1, "pokemonName": "Bulbasaur", "pokemonWeight": 6.9, "pokemonGeneration": 1}
    // {"pokemonId": 25, "pokemonName": "Pikachu", "pokemonWeight": 6.0, "pokemonGeneration": 1}
    @Override
    public StreamObserver<UploadRequest> streamUpload(StreamObserver<SimpleReply> responseObserver) {
        return new StreamObserver<UploadRequest>() {
            @Override
            public void onNext(UploadRequest uploadRequest) {
                pokemonIds.add(uploadRequest.getPokemonId());
                pokemonNames.add(uploadRequest.getPokemonName());
                pokemonWeights.add(uploadRequest.getPokemonWeight());
                pokemonGenerations.add(uploadRequest.getPokemonGeneration());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onNext(SimpleReply.newBuilder().setMessage("Data upload failed: " + throwable.getCause()).build());
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(SimpleReply.newBuilder().setMessage("Data upload completed").build());
                responseObserver.onCompleted();
            }
        };
    }

    // implementacja metody strumieniowego czytania danych z serwera
    // grpcurl --plaintext localhost:9000 pl.edu.pwr.rsi.grpc.interface.MyService/StreamRead
    @Override
    public void streamRead(EmptyRequest request, StreamObserver<SimpleReply> responseObserver) {
        for (int i = 0; i < pokemonNames.size(); i++) {
            String data = "pokedex id " + pokemonIds.get(i) + ", name " + pokemonNames.get(i) + ", weight " + pokemonWeights.get(i) + ", generation " + pokemonGenerations.get(i);
            SimpleReply reply = SimpleReply.newBuilder().setMessage("Fetched data: " + data).build();
            responseObserver.onNext(reply);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        SimpleReply reply = SimpleReply.newBuilder().setMessage("All data fetched").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody wgrywania obrazu na serwer - serwer zapisuje obraz
    @Override
    public void uploadImage(UploadImageRequest request, StreamObserver<SimpleReply> responseObserver) {
        image = request.getImage().toByteArray();
        SimpleReply reply = SimpleReply.newBuilder().setMessage("Image added to server").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // implementacja metody pobierania obrazu z serwera - serwer przesyla bajty do klienta
    @Override
    public void readImage(EmptyRequest request, StreamObserver<ReadImageReply> responseObserver) {
        ReadImageReply reply;
        if (image == null)
            reply = ReadImageReply.newBuilder().setMessage("No image").build();
        else
            reply = ReadImageReply.newBuilder().setMessage("Image downloaded").setImage(ByteString.copyFrom(image)).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
