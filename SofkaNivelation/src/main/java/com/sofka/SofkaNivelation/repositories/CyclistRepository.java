package com.sofka.SofkaNivelation.repositories;

import com.sofka.SofkaNivelation.models.CiclistaModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyclistRepository extends MongoRepository<CiclistaModel,String> {
}
