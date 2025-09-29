package ex.ex001;

import ex.ex001.models.Jogador;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ex.ex001.service.JogadorService;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public ResponseEntity<Jogador> postJogador(@RequestBody Jogador jogador) {
        Jogador novojogador = jogadorService.addJogador(jogador);
        return ResponseEntity.ok(novojogador);
    }
    @GetMapping
    public ResponseEntity<List<Jogador>> getJogador() {
        List<Jogador> jogadores = jogadorService.getAllJogadores();
        return ResponseEntity.ok(jogadores);
    }
}
