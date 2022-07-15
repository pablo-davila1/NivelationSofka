package com.sofka.SofkaNivelation.services;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.models.CiclistaModel;
import com.sofka.SofkaNivelation.repositories.CyclistRepository;
import com.sofka.SofkaNivelation.repositories.CyclistTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CiclistaService {
    @Autowired
    private CyclistRepository cyclistRepository;

    @Autowired
    private CyclistTeamRepository cyclistTeamRepository;

//    public CiclistaInterface saveCiclista (CiclistaModel ciclistaModel){
//        CiclistaInterface ciclistaInterface = new CiclistaInterface();
//
//        String codeCiclista = UUID.randomUUID().toString().substring(0,3);
//
//        ciclistaModel.setCyclistId(codeCiclista);
//
//
//    }


    
}
