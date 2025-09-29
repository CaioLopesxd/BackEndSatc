package ex.ex001;

import ex.ex001.models.Jogador;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> get() {
        Jogador jogador = new Jogador();
        return ResponseEntity.ok("Hello World!");
    }
}
