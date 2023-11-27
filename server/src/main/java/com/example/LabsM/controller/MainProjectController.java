package com.example.LabsM.controller;

import com.example.LabsM.annotation.CustomExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/airport")
@CustomExceptionHandler
public class MainProjectController {

    @GetMapping("/airlines")
    @ResponseStatus(HttpStatus.OK)
    public void getAirlines() {

    }
    @GetMapping("/addairline")
    @ResponseStatus(HttpStatus.OK)
    public void addAirline(@RequestParam String name, @RequestParam byte[] logo, @RequestParam String code) {

    }
    @GetMapping("/airplanes")
    @ResponseStatus(HttpStatus.OK)
    public void getAirplanes() {

    }
    @GetMapping("/addairplane")
    @ResponseStatus(HttpStatus.OK)
    public void addAirplane(@RequestParam String name, @RequestParam Integer speed, @RequestParam Integer capeco,
                            @RequestParam Integer capbus, @RequestParam Integer capfir) {

    }
    @GetMapping("/airports")
    @ResponseStatus(HttpStatus.OK)
    public void getAirports() {

    }
    @GetMapping("addairport")
    @ResponseStatus(HttpStatus.OK)
    public void addAirport(@RequestParam String name, @RequestParam String country, @RequestParam Float coord1,
                           @RequestParam Float coord2) {

    }
    @GetMapping("/bookings")
    @ResponseStatus(HttpStatus.OK)
    public void getBookings() {

    }
    @GetMapping("/addbooking")
    @ResponseStatus(HttpStatus.OK)
    public void addBooking(@RequestParam String user, @RequestParam Integer flightid, @RequestParam Integer[] date) {

    }
    @GetMapping("/flights")
    @ResponseStatus(HttpStatus.OK)
    public void getFlights() {

    }
    @GetMapping("/addflight")
    @ResponseStatus(HttpStatus.OK)
    public void addFlight(@RequestParam String origin, @RequestParam String destination, @RequestParam String airline,
                          @RequestParam String airplane) {

    }
    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public void getUsers() {

    }
    @GetMapping("/adduser")
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestParam String name, @RequestParam String password) {

    }


}
