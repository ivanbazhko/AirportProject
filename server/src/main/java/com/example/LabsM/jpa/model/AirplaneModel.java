package com.example.LabsM.jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "airplanes")
public class AirplaneModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "speed")
    private Integer speed;
    @Column(name = "capeco")
    private Integer capeco;
    @Column(name = "capbus")
    private Integer capbus;
    @Column(name = "capfir")
    private Integer capfir;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getCapeco() {
        return capeco;
    }

    public void setCapeco(Integer capeco) {
        this.capeco = capeco;
    }

    public Integer getCapbus() {
        return capbus;
    }

    public void setCapbus(Integer capbus) {
        this.capbus = capbus;
    }

    public Integer getCapfir() {
        return capfir;
    }

    public void setCapfir(Integer capfir) {
        this.capfir = capfir;
    }

    public AirplaneModel(Integer id, String name, Integer speed, Integer capeco, Integer capbus, Integer capfir) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.capeco = capeco;
        this.capbus = capbus;
        this.capfir = capfir;
    }

    public AirplaneModel(String name, Integer speed, Integer capeco, Integer capbus, Integer capfir) {
        this.name = name;
        this.speed = speed;
        this.capeco = capeco;
        this.capbus = capbus;
        this.capfir = capfir;
    }
}
