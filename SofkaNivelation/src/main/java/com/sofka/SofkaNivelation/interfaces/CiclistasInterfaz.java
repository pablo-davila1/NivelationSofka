package com.sofka.SofkaNivelation.interfaces;

import com.sofka.SofkaNivelation.models.CiclistaModel;

import java.util.ArrayList;

public class CiclistasInterfaz {
    private ArrayList<CiclistaModel> ciclistaModels;
    private String respuesta;

    public CiclistasInterfaz(){}

    public CiclistasInterfaz(ArrayList<CiclistaModel> ciclistaModels, String respuesta) {
        this.ciclistaModels = ciclistaModels;
        this.respuesta = respuesta;
    }

    public ArrayList<CiclistaModel> getCiclistaModels() {
        return ciclistaModels;
    }

    public void setCiclistaModels(ArrayList<CiclistaModel> ciclistaModels) {
        this.ciclistaModels = ciclistaModels;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
