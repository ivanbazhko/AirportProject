package com.example.LabsM.jpa.model;

import com.example.LabsM.entity.Flight;
import com.example.LabsM.entity.User;
import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class BookingModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "userid")
    private Integer userid;
    @Column(name = "flightid")
    private Integer flightid;
    @Column(name = "date")
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BookingModel(Integer id, Integer userid, Integer flightid, String date) {
        this.id = id;
        this.userid = userid;
        this.flightid = flightid;
        this.date = date;
    }

    public BookingModel(Integer userid, Integer flightid, String date) {
        this.userid = userid;
        this.flightid = flightid;
        this.date = date;
    }
}
