package com.sofka.SofkaNivelation.interfaces;

import com.sofka.SofkaNivelation.models.EquipoModel;

import java.util.ArrayList;

public class EquiposInterfaz {
    private ArrayList<EquipoModel> equipoModels;
    private String respuesta;

    public EquiposInterfaz(){}

    public EquiposInterfaz(ArrayList<EquipoModel> equipoModels, String respuesta) {
        this.equipoModels = equipoModels;
        this.respuesta = respuesta;
    }

    public ArrayList<EquipoModel> getEquipoModels() {
        return equipoModels;
    }

    public void setEquipoModels(ArrayList<EquipoModel> equipoModels) {
        this.equipoModels = equipoModels;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
