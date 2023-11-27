package com.example.LabsM.entity;

public class Airplane {
    private String name;
    private Integer speed;
    private Integer capeco;
    private Integer capbus;
    private Integer capfir;

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

    public Airplane(String name, Integer speed, Integer capeco, Integer capbus, Integer capfir) {
        this.name = name;
        this.speed = speed;
        this.capeco = capeco;
        this.capbus = capbus;
        this.capfir = capfir;
    }
}
