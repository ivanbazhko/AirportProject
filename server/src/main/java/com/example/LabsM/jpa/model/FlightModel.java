package com.example.LabsM.jpa.model;

import com.example.LabsM.entity.Airline;
import com.example.LabsM.entity.Airplane;
import com.example.LabsM.entity.Airport;
import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class FlightModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "originid")
    private Integer originid;
    @Column(name = "destinationid")
    private Integer destinationid;
    @Column(name = "airlineid")
    private Integer airlineid;
    @Column(name = "airplaneid")
    private Integer airplaneid;
    @Column(name = "days")
    private String days;
    @Column(name = "time")
    private String time;
    @Column(name = "number")
    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOriginid() {
        return originid;
    }

    public void setOriginid(Integer originid) {
        this.originid = originid;
    }

    public Integer getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(Integer destinationid) {
        this.destinationid = destinationid;
    }

    public Integer getAirlineid() {
        return airlineid;
    }

    public void setAirlineid(Integer airlineid) {
        this.airlineid = airlineid;
    }

    public Integer getAirplaneid() {
        return airplaneid;
    }

    public void setAirplaneid(Integer airplaneid) {
        this.airplaneid = airplaneid;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public FlightModel(Integer id, Integer originid, Integer destinationid, Integer airlineid, Integer airplaneid, String days, String time, Integer number) {
        this.id = id;
        this.originid = originid;
        this.destinationid = destinationid;
        this.airlineid = airlineid;
        this.airplaneid = airplaneid;
        this.days = days;
        this.time = time;
        this.number = number;
    }

    public FlightModel(Integer originid, Integer destinationid, Integer airlineid, Integer airplaneid, String days, String time, Integer number) {
        this.originid = originid;
        this.destinationid = destinationid;
        this.airlineid = airlineid;
        this.airplaneid = airplaneid;
        this.days = days;
        this.time = time;
        this.number = number;
    }
}
