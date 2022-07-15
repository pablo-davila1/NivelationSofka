package com.sofka.SofkaNivelation.interfaces;

import com.sofka.SofkaNivelation.models.CiclistaModel;
import com.sofka.SofkaNivelation.models.EquipoModel;

import java.util.Optional;

public class EquipoInterface {
    private Optional<EquipoModel> equipoModel;
    private String respuesta;

    public EquipoInterface (){}

    public EquipoInterface(Optional<EquipoModel> equipoModel, String respuesta) {
        this.equipoModel = equipoModel;
        this.respuesta = respuesta;
    }

    public Optional<EquipoModel> getEquipoModel() {
        return equipoModel;
    }

    public void setEquipoModel(Optional<EquipoModel> equipoModel) {
        this.equipoModel = equipoModel;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
