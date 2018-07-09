package br.com.gx2.aprendendoinglesapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx2.aprendendoinglesapi.entities.Frase;
import br.com.gx2.aprendendoinglesapi.repositories.FraseRepository;

@RestController
@RequestMapping("v1/frase")
public class FraseController {

    @Autowired
    private FraseRepository fraseRepository;

    @GetMapping
    public Page<Frase> list(@RequestParam int quantidade) {
        return fraseRepository.findAll(PageRequest.of(0, quantidade));
    }

    @PostMapping(path="/all")
    List<Frase> saveAll(@RequestBody List<Frase> movie){
        List<Frase> frasesSaved = fraseRepository.saveAll(movie);
        return frasesSaved;
    }
}