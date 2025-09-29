package ex.ex001.service;

import ex.ex001.models.Jogador;
import org.springframework.stereotype.Service;
import ex.ex001.repository.JogadorRepository;

import java.util.List;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }
    public Jogador addJogador(Jogador jogador){
        jogadorRepository.save(jogador);
        return jogador;
    }
    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();
    }
}
