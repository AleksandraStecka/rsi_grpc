package pl.edu.pwr.rsi.grpc.client;

import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import pl.edu.pwr.rsi.grpc.interfaces.lib.*;
import pl.edu.pwr.rsi.grpc.interfaces.lib.MyServiceGrpc.MyServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Base64;
import java.util.Iterator;

// klient
// na podstawie pliku proto nie jest generowana klasa dla klienta
@Service
public class FoobarService {

    // namiastka do metod synchronicznych za pomoca ktorej klient komunikuje sie z serwerem
    @GrpcClient("myService")
    private MyServiceBlockingStub stub;

    // implementacja metody testowej - klient "wita sie z" serwerem, a serwer odpowiada
    public String sayHello(String name) {
        SimpleRequest request = SimpleRequest.newBuilder().setName(name).build();
        return stub.sayHello(request).getMessage();
    }

    // implementacja metody wgrania danych na serwer - klient podaje dane, a klient odpowiada
    public String upload(int pokemonId, String pokemonName, float pokemonWeight, int pokemonGeneration) {
        UploadRequest request = UploadRequest.newBuilder().setPokemonId(pokemonId).setPokemonName(pokemonName)
                .setPokemonWeight(pokemonWeight).setPokemonGeneration(pokemonGeneration).build();
        return stub.upload(request).getMessage();
    }

    // implementacja metody czytania z serwera
    public String read(String pokemonName) {
        SimpleRequest request = SimpleRequest.newBuilder().setName(pokemonName).build();
        return stub.read(request).getMessage();
    }

    // implementacja metody asynchronicznego czytania z serwera
    public String readAsync() {
        return stub.readAsync(EmptyRequest.newBuilder().build()).getMessage();
    }

    // implementacja metody strumieniowego czytania z serwera
    public String streamRead() {
        EmptyRequest request = EmptyRequest.newBuilder().build();
        int recordsCount = stub.recordsCount(request).getCount();
        Iterator<SimpleReply> readRecords;
        StringBuilder data = new StringBuilder("");
        try {
            int readRecordsCount = 0, readRecordsChunk = 0, printed = 0;
            readRecords = stub.streamRead(request);
            while (readRecords.hasNext()) {
                readRecordsCount++;
                readRecordsChunk++;
                for (int i = 1; readRecordsCount <= recordsCount && (double) i / 10.0 <= (double) readRecordsChunk / (double) recordsCount; i++) {
                    System.out.print("*");
                    printed++;
                    readRecordsChunk = 1;
                }
                SimpleReply reply = readRecords.next();
                data.append(reply.getMessage()).append("\n");
            }
            for (int i = printed; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    // implementacja metody wgrania obrazu na serwer
    public String uploadImage(String path) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            byte[] chunk = new byte[4096];
            int bytesRead;
            InputStream stream = new FileInputStream(new File(path));
            while ((bytesRead = stream.read(chunk)) > 0) {
                outputStream.write(chunk, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        UploadImageRequest request = UploadImageRequest.newBuilder().setImage(ByteString.copyFrom(outputStream.toByteArray())).build();
        return stub.uploadImage(request).getMessage();
    }

    // implementacja metody pobrania obrazu z serwera
    public String readImage() {
        EmptyRequest request = EmptyRequest.newBuilder().build();
        ReadImageReply reply = stub.readImage(request);
        String result = reply.getMessage();
        if (!result.equals("No image")) {
            JFrame frame = new JFrame();
            frame.setSize(500, 500);
            JLabel label = new JLabel(new ImageIcon(reply.getImage().toByteArray()));
            frame.add(label);
            frame.setVisible(true);
        }
        return result;
    }

}
