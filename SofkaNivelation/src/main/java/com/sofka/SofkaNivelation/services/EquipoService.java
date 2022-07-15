package com.sofka.SofkaNivelation.services;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.models.EquipoModel;
import com.sofka.SofkaNivelation.repositories.CyclistTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EquipoService {
    public Object delete;
    @Autowired
    CyclistTeamRepository cyclistTeamRepository;
    
    public EquipoModel save (EquipoModel equipoModel){
        String codigo = UUID.randomUUID().toString().substring(0,3);
        
        equipoModel.setTeamId(codigo);
        return cyclistTeamRepository.save(equipoModel);
    }
    
    public Optional<EquipoModel> findById (String id){
        return cyclistTeamRepository.findById(id);
    }
    
    public CiclistaInterface delete (String id){
        CiclistaInterface ciclistaInterface = new CiclistaInterface();
        
        if(!cyclistTeamRepository.findById(id).isEmpty()) {
            cyclistTeamRepository.deleteById(id);
            ciclistaInterface.setRespuesta("Equipo eliminado");
            return ciclistaInterface;
        }
        ciclistaInterface.setRespuesta("Equipo Inexistente");
        return ciclistaInterface;
        
    }
}
