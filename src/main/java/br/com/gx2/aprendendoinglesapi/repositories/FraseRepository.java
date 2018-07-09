package br.com.gx2.aprendendoinglesapi.repositories;

// import java.util.List;

// import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.gx2.aprendendoinglesapi.entities.Frase;

public interface FraseRepository extends MongoRepository<Frase, String> {
    // List<Frase> findAll(PageRequest pageRequest);
}