package org.example.ex002;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex002Controller {

    @GetMapping("")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello World!");
    }
}
