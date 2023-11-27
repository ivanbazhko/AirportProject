package com.example.LabsM.entity;

public class Flight {
    private Airport origin;
    private Airport destination;
    private Airline airline;
    private Airplane airplane;
    private Boolean[] days;
    private Integer[] time;
    private Integer number;

    public Flight(Airport origin, Airport destination, Airline airline, Airplane airplane, Boolean[] days, Integer[] time, Integer number) {
        this.origin = origin;
        this.destination = destination;
        this.airline = airline;
        this.airplane = airplane;
        this.days = days;
        this.time = time;
        this.number = number;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Boolean[] getDays() {
        return days;
    }

    public void setDays(Boolean[] days) {
        this.days = days;
    }

    public Integer[] getTime() {
        return time;
    }

    public void setTime(Integer[] time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
