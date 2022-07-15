package com.sofka.SofkaNivelation.controllers;

import com.sofka.SofkaNivelation.interfaces.CiclistaInterface;
import com.sofka.SofkaNivelation.models.CiclistaModel;
import com.sofka.SofkaNivelation.services.CiclistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciclistas")
public class CiclistaController {
    @Autowired
    CiclistaService ciclistaService;

    @PostMapping
    public CiclistaInterface save(@RequestBody CiclistaModel ciclistaModel){
        return this.ciclistaService.saveCiclista(ciclistaModel);
    }
}
