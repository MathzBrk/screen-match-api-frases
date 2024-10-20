package br.com.alura.desafio.service;

import br.com.alura.desafio.dto.FraseDTO;
import br.com.alura.desafio.model.Frase;
import br.com.alura.desafio.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;
    public FraseService() {}


    public FraseDTO obterFrase() {
        Frase frase = fraseRepository.obterFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonagem(),frase.getPoster());
    }
}
