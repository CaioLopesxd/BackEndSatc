package org.example.ex001;

import java.util.Date;
import java.util.UUID;

public class Emprestimo {
    private UUID uid;
    private String livroId;
    private String usuarioId;
    private Date dataEmprestimo;

    Emprestimo(String livroId, String usuarioId){
        this.uid = UUID.randomUUID();
        this.livroId = livroId;
        this.usuarioId = usuarioId;
        this.dataEmprestimo = new Date();
    }
}
