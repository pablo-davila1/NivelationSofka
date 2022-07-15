package com.sofka.SofkaNivelation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collation = "teams")
public class EquipoModel {
    @Id
    private String id;

    @Indexed(unique = true)
    private String teamId;

    private String name;
    private String country;
    private ArrayList<CiclistaModel> cyclists;

    public EquipoModel(){}

    public EquipoModel(String id, String teamId, String name, String country, ArrayList<CiclistaModel> cyclists) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.country = country;
        this.cyclists = cyclists;
    }

    public EquipoModel(String teamId, String name, String country, ArrayList<CiclistaModel> cyclists) {
        this.teamId = teamId;
        this.name = name;
        this.country = country;
        this.cyclists = cyclists;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<CiclistaModel> getCyclists() {
        return cyclists;
    }

    public void setCyclists(ArrayList<CiclistaModel> cyclists) {
        this.cyclists = cyclists;
    }
}
