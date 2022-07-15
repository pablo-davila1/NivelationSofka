package com.sofka.SofkaNivelation.controllers;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.models.EquipoModel;
import com.sofka.SofkaNivelation.repositories.CyclistTeamRepository;
import com.sofka.SofkaNivelation.services.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/team")
public class EquipoController {

    @Autowired
    private CyclistTeamRepository cyclistTeamRepository;

    @Autowired
    private EquipoService equipoService;

    @PostMapping
    public EquipoModel save(@RequestBody EquipoModel equipoModel){
        return  this.equipoService.save(equipoModel);
    }

    @GetMapping("/{id}")
    public Optional<EquipoModel> findById(@PathVariable String id){
        return this.equipoService.findById(id);
    }

    @DeleteMapping("/{id}")
    public CiclistaInterface delete (@PathVariable String id){
        return this.equipoService.delete(id);
    }
}
