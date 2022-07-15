package com.sofka.SofkaNivelation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "cyclist")
public class CiclistaModel {
    @Id
    private String id;

    @Indexed(unique = true)
    private String cyclistId;

    private String teamCode;
    private String name;
    private String country;

    public CiclistaModel(){}

    public CiclistaModel(String id, String cyclistId, String teamCode, String name, String country) {
        this.id = id;
        this.cyclistId = cyclistId;
        this.teamCode = teamCode;
        this.name = name;
        this.country = country;
    }

    public CiclistaModel(String cyclistId, String teamCode, String name, String country) {
        this.cyclistId = cyclistId;
        this.teamCode = teamCode;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCyclistId() {
        return cyclistId;
    }

    public void setCyclistId(String cyclistId) {
        this.cyclistId = cyclistId;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
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
}