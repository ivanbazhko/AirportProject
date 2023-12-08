package com.example.LabsM.controller;

import com.example.LabsM.annotation.CustomExceptionHandler;
import com.example.LabsM.entity.Airport;
import com.example.LabsM.entity.User;
import com.example.LabsM.jpa.model.UserModel;
import com.example.LabsM.service.DBService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/airport")
@CustomExceptionHandler
@CrossOrigin(origins = "http://localhost:3000")
public class MainProjectController {
    private DBService airportService;
    public MainProjectController(DBService airportService) {
        this.airportService = airportService;
    }
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
    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getHome() {
        List<Airport> list = airportService.getAllAirports();
        List<Airport> response = new ArrayList<>();
        response.add(list.get(0));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/airports")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getAirports() {
        List<Airport> response = airportService.getAllAirports();
        response.remove(0);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("addairport")
    @ResponseStatus(HttpStatus.OK)
    public void addAirport(@RequestParam String name, @RequestParam String country, @RequestParam Float coord1,
                           @RequestParam Float coord2) {
        airportService.saveOneAirport(name, country, coord1, coord2);
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
    public ResponseEntity<Object> addUser(@RequestParam String email, @RequestParam String password) {
        Integer userStatus = airportService.getUserId(email);
        if(userStatus < 0) {
            airportService.saveOneUser(email, password);
            Integer userid = airportService.getUserId(email);
            Boolean isAdmin = airportService.getUserWithId(userid).getIsadmin();
            List<Object> resNew = new ArrayList<>();
            resNew.add(Boolean.TRUE);
            resNew.add(isAdmin);
            resNew.add(userid);
            return new ResponseEntity<>(resNew, HttpStatus.CREATED);
        }
        List<Object> resOld = new ArrayList<>();
        Boolean isOldAdmin = airportService.getUserWithId(userStatus).getIsadmin();
        String oldPassword = airportService.getUserWithId(userStatus).getPassword();
        resOld.add(Boolean.FALSE);
        resOld.add(oldPassword);
        resOld.add(isOldAdmin);
        resOld.add("User Already Exists");
        resOld.add(userStatus);
        return new ResponseEntity<>(resOld, HttpStatus.OK);
    }


}
