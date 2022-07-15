package com.sofka.SofkaNivelation.repositories;

import com.sofka.SofkaNivelation.models.EquipoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyclistTeamRepository extends MongoRepository<EquipoModel,String> {
}
