package org.example.ex001;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@RestController
public class Ex001Controller {
    Vector<Estudante> estudantes = new Vector<>();
    Vector<Playlist> playlists = new Vector<>();

    @GetMapping("/")
    public String OlaMundo(){
        return "Hello World!";
    }

    @GetMapping("/recomendar")
    public String Recomendar(@RequestParam String clima, @RequestParam String estilo){
        System.out.println(clima + " " + estilo);
        if (clima.equals("calor") && estilo.equals("natureza")) {
            return "Rio de Janeiro";
        }
        if (clima.equals("frio") && estilo.equals("natureza")) {
            return "Serra do Rio do Rastro";
        }
        if (clima.equals("calor") && estilo.equals("urbano")) {
            return "São Paulo";
        }
        if (clima.equals("frio") && estilo.equals("urbano")) {
            return "Três Cachoeiras";
        } else {
            return "404 - Não encontrado";
        }
    }

    @GetMapping("/jogador/{time}/{posicao}")
    public Jogador Jogador(@PathVariable String time, @PathVariable String posicao){
        return new Jogador("Caio", "Lopes", 23, posicao, time);
    }

    @GetMapping("/estudantes")
    public Vector<Estudante> getEstudantes() {
        return estudantes;
    }
    @GetMapping("/estudantes/{id}")
    public Estudante getEstudantes(@PathVariable int id) {
        for(Estudante estudante : estudantes){
            if(estudante.codigo == id){
                return estudante;
            }
        }
        return null;
    }
    @PostMapping("/estudantes")
    public String postEstudantes(@RequestBody Estudante estudante) {
        estudantes.add(estudante);
        return "Estudante cadastrado com sucesso!";
    }

    @GetMapping("/playlists")
    public Vector<Playlist> getPlaylists() {
        return playlists;
    }
    @GetMapping("/playlists/{id}")
    public Playlist getPlaylists(@PathVariable int id) {
        for(Playlist playlist : playlists){
            if(playlist.id == id){
                return playlist;
            }
        }
        return null;
    }

    @PostMapping("/playlists")
    public String postPlaylists(@RequestBody Playlist playlist) {
        playlists.add(playlist);
        return String.valueOf(playlist.id);
    }

    @PostMapping("/playlist/{id}/adicionarMusica")
    public String postPlaylistAdicionarMusica(@PathVariable int id, @RequestBody Musica musica) {
        playlists.get(id).addMusica(musica);
        return "Musica adicionada com sucesso!";
    }
}
