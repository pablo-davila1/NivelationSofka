package com.sofka.SofkaNivelation.services;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.interfaces.CiclistasInterfaz;
import com.sofka.SofkaNivelation.models.CiclistaModel;
import com.sofka.SofkaNivelation.models.EquipoModel;
import com.sofka.SofkaNivelation.repositories.CyclistRepository;
import com.sofka.SofkaNivelation.repositories.CyclistTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class CiclistaService {
    @Autowired
    private CyclistRepository cyclistRepository;

    @Autowired
    private CyclistTeamRepository cyclistTeamRepository;

    public CiclistaInterface saveCiclista (CiclistaModel ciclistaModel){
        CiclistaInterface ciclistaInterface = new CiclistaInterface();

        String codeCiclista = UUID.randomUUID().toString().substring(0,3);

        ciclistaModel.setCyclistId(codeCiclista);

        ArrayList<CiclistaModel> ciclistaModels = (ArrayList<CiclistaModel>) this.cyclistRepository.findAll();
        ArrayList<EquipoModel> equipoModels = (ArrayList<EquipoModel>) this.cyclistTeamRepository.findAll();

        Integer cantidad= 0;

        for (Integer i = 0; i<ciclistaModels.size(); i++ ){
            if(ciclistaModels.get(i).getTeamCode().equalsIgnoreCase(ciclistaModel.getTeamCode()))
                cantidad++;
        }

        if(cantidad < 8){
            for(Integer i= 0; i < equipoModels.size(); i++){
                if(equipoModels.get(i).getTeamId().equalsIgnoreCase(ciclistaModel.getTeamCode())){
                    CiclistaModel nuevo = cyclistRepository.save(ciclistaModel);
                    ciclistaInterface.setCiclistaModels(Optional.of(nuevo));
                    ciclistaInterface.setRespuesta("Ciclista Registrado");
                    return ciclistaInterface;
                }
            }

            ciclistaInterface.setRespuesta("Equipo incorrecto");
            return ciclistaInterface;
        }

        ciclistaInterface.setRespuesta("Proceso abortado");
        return ciclistaInterface;

    }

    public CiclistasInterfaz getAllById(){
        CiclistasInterfaz ciclistasInterfaz = new CiclistasInterfaz();

        ArrayList<CiclistaModel> ciclistaModels = (ArrayList<CiclistaModel>) cyclistRepository.findAll();
        ciclistasInterfaz.setCiclistaModels(ciclistaModels);
        ciclistasInterfaz.setRespuesta("Operacion exitosa");
        return ciclistasInterfaz;


    }


    
}
