package com.example.LabsM.entity;

public class Booking {
    private User user;
    private Flight flight;
    private Integer[] date;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer[] getDate() {
        return date;
    }

    public void setDate(Integer[] date) {
        this.date = date;
    }

    public Booking(User user, Flight flight, Integer[] date) {
        this.user = user;
        this.flight = flight;
        this.date = date;
    }
}
