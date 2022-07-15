package com.sofka.SofkaNivelation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cyclist")
public class CiclistaModel {
    @Id
    private String id;

    @Indexed(unique = true)
    private String cyclistId;

    private String teamCode;
    private String name;
    private String country;


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
