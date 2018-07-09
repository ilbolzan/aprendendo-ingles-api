package br.com.gx2.aprendendoinglesapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Frase {
    @Id
    private String id;

    private String fraseEng;
    private String frasePtBr;

    public Frase(String fraseEng, String frasePtBr){
        this.fraseEng = fraseEng;
        this.frasePtBr = frasePtBr;
    }
}

