package br.com.alura.desafio.repository;

import br.com.alura.desafio.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    List<Frase> findByTituloContaining(String titulo);

    @Query("SELECT f from Frase f ORDER BY function('RANDOM') LIMIT 1 ")
    Frase obterFraseAleatoria();
}
