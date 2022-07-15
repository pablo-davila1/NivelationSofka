package com.sofka.SofkaNivelation.interfaces;

import com.sofka.SofkaNivelation.models.CiclistaModel;

import java.util.Optional;

public class CiclistaInterface {
    private Optional<CiclistaModel> ciclistaModels;
    private String respuesta;

    public CiclistaInterface (){}

    public CiclistaInterface(Optional<CiclistaModel> ciclistaModels, String respuesta) {
        this.ciclistaModels = ciclistaModels;
        this.respuesta = respuesta;
    }

    public Optional<CiclistaModel> getCiclistaModels() {
        return ciclistaModels;
    }

    public void setCiclistaModels(Optional<CiclistaModel> ciclistaModels) {
        this.ciclistaModels = ciclistaModels;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
