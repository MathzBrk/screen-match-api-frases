package br.com.alura.desafio.controller;

import br.com.alura.desafio.dto.FraseDTO;
import br.com.alura.desafio.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFrases(){
        return service.obterFrase();
    }


}
