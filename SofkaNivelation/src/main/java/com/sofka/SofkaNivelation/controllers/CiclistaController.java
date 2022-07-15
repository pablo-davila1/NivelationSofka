package com.sofka.SofkaNivelation.controllers;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.interfaces.CiclistasInterfaz;
import com.sofka.SofkaNivelation.models.CiclistaModel;
import com.sofka.SofkaNivelation.services.CiclistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ciclistas")
public class CiclistaController {
    @Autowired
    CiclistaService ciclistaService;

    @PostMapping
    public CiclistaInterface save(@RequestBody CiclistaModel ciclistaModel){
        return this.ciclistaService.saveCiclista(ciclistaModel);
    }

    @GetMapping
    public CiclistasInterfaz getAll(){
        return this.ciclistaService.getAll();
    }

    @DeleteMapping("/{id}")
    public CiclistaInterface delete(@PathVariable String id){
        return this.ciclistaService.deleteById(id);
    }


}
