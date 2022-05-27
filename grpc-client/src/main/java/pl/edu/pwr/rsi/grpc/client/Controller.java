package pl.edu.pwr.rsi.grpc.client;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// umozliwia przyjmowanie zapytan HTTP GET na adresy postaci http://localhost/...
@RestController
@AllArgsConstructor
class Controller {
    FoobarService client;

    // mapowanie dla metody testowej
    // curl http://localhost:8080/sayHello/test
    @GetMapping("/sayHello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return client.sayHello(name);
    }

    // mapowanie dla metody wgrania danych na serwer
    // curl http://localhost:8080/upload/1,Bulbasaur,6.9,1
    // curl http://localhost:8080/upload/25,Pikachu,6.0,1
    // curl http://localhost:8080/upload/131,Vaporeon,29.0,1
    // curl http://localhost:8080/upload/133,Eevee,6.5,1
    // curl http://localhost:8080/upload/700,Sylveon,23.5,6
    @GetMapping("/upload/{id},{name},{weight},{generation}")
    @ResponseBody
    public String upload(@PathVariable int id, @PathVariable String name, @PathVariable float weight, @PathVariable int generation) {
        return client.upload(id, name, weight, generation);
    }

    // mapowanie dla metody czytania danych z serwera
    // curl http://localhost:8080/read/Bulbasaur
    @GetMapping("/read/{name}")
    @ResponseBody
    public String read(@PathVariable String name) {
        return client.read(name);
    }

    // mapowanie dla metody asynchronicznego czytania danych z serwera
    // curl http://localhost:8080/readAsync
    @GetMapping("/readAsync")
    @ResponseBody
    public String readAsync() {
        return client.readAsync();
    }

    // mapowanie dla metody strumieniowego czytania danych z serwera
    // curl http://localhost:8080/streamRead
    @GetMapping("/streamRead")
    @ResponseBody
    public String streamRead() {
        return client.streamRead();
    }

    // mapowanie dla metody wgrywania obrazu na serwer
    // curl http://localhost:8080/uploadImage/Audino.jpg
    @GetMapping("/uploadImage/{path}")
    @ResponseBody
    public String uploadImage(@PathVariable String path) {
        return client.uploadImage(path);
    }

    // mapowanie dla metody wgrywania obrazu na serwer
    // curl http://localhost:8080/readImage
    @GetMapping("/readImage")
    @ResponseBody
    public String readImage() {
        return client.readImage();
    }

}
