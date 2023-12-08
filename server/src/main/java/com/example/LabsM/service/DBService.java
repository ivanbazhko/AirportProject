package com.example.LabsM.service;

import com.example.LabsM.entity.*;
import com.example.LabsM.jpa.*;
import com.example.LabsM.jpa.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBService {
    private AirlineJpaRepository airlineRepository;
    private AirplaneJpaRepository airplaneRepository;
    private AirportJpaRepository airportRepository;
    private BookingJpaRepository bookingRepository;
    private FlightJpaRepository flightRepository;
    private UserJpaRepository userRepository;
    public DBService(AirlineJpaRepository airlineRepository,
                     AirplaneJpaRepository airplaneRepository,
                     AirportJpaRepository airportRepository,
                     BookingJpaRepository bookingRepository,
                     FlightJpaRepository flightRepository,
                     UserJpaRepository userRepository) {
        this.airlineRepository = airlineRepository;
        this.airplaneRepository = airplaneRepository;
        this.airportRepository = airportRepository;
        this.bookingRepository = bookingRepository;
        this.flightRepository = flightRepository;
        this.userRepository = userRepository;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneAirline(String name, String code, byte[] logo) {
        AirlineModel model = new AirlineModel(name, code, logo);
        airlineRepository.save(model);
    }
    public List<AirlineModel> getAllAirlinesWithId() {
        List<AirlineModel> result = new ArrayList<>();
        airlineRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public AirlineModel getAirlineWithId(Integer id) {
        AirlineModel result = airlineRepository.findById(id).get();
        return result;
    }
    public List<Airline> getAllAirlines() {
        List<Airline> result = new ArrayList<>();
        airlineRepository.findAll().forEach(a -> {
            result.add(new Airline(a.getName(), a.getCode(), a.getLogo()));
        });
        return result;
    }
    public Integer getAirlineId(String name) {
        List<AirlineModel> allAirlines = getAllAirlinesWithId();
        Integer result = -1;
        for(int i = 0; i < allAirlines.size(); i++) {
            if(allAirlines.get(i).getName().equals(name)) {
                result = allAirlines.get(i).getId();
            }
        };
        return result;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneAirplane(String name, Integer speed, Integer capeco, Integer capbus, Integer capfir) {
        AirplaneModel model = new AirplaneModel(name, speed, capeco, capbus, capfir);
        airplaneRepository.save(model);
    }
    public List<AirplaneModel> getAllAirplanesWithId() {
        List<AirplaneModel> result = new ArrayList<>();
        airplaneRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public AirplaneModel getAirplaneWithId(Integer id) {
        AirplaneModel result = airplaneRepository.findById(id).get();
        return result;
    }
    public List<Airplane> getAllAirplanes() {
        List<Airplane> result = new ArrayList<>();
        airplaneRepository.findAll().forEach(a -> {
            result.add(new Airplane(a.getName(), a.getSpeed(), a.getCapeco(), a.getCapbus(), a.getCapfir()));
        });
        return result;
    }
    public Integer getAirplaneId(String name) {
        List<AirplaneModel> allAirplanes = getAllAirplanesWithId();
        Integer result = -1;
        for(int i = 0; i < allAirplanes.size(); i++) {
            if(allAirplanes.get(i).getName().equals(name)) {
                result = allAirplanes.get(i).getId();
            }
        };
        return result;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneAirport(String name, String country, Float coord1, Float coord2) {
        AirportModel model = new AirportModel(name, country, coord1, coord2);
        airportRepository.save(model);
    }
        public List<AirportModel> getAllAirportsWithId() {
        List<AirportModel> result = new ArrayList<>();
        airportRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public AirportModel getAirportWithId(Integer id) {
        AirportModel result = airportRepository.findById(id).get();
        return result;
    }
    public List<Airport> getAllAirports() {
        List<Airport> result = new ArrayList<>();
        airportRepository.findAll().forEach(a -> {
            result.add(new Airport(a.getName(), a.getCountry(), a.getCoord1(), a.getCoord2()));
        });
        return result;
    }
    public Integer getAirportId(String country) {
        List<AirportModel> allAirports = getAllAirportsWithId();
        Integer result = -1;
        for(int i = 0; i < allAirports.size(); i++) {
            if(allAirports.get(i).getCountry().equals(country)) {
                result = allAirports.get(i).getId();
            }
        };
        return result;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneUser(String name, String password) {
        UserModel model = new UserModel(name, password);
        userRepository.save(model);
    }
    public List<UserModel> getAllUsersWithId() {
        List<UserModel> result = new ArrayList<>();
        userRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public UserModel getUserWithId(Integer id) {
        UserModel result = userRepository.findById(id).get();
        return result;
    }
    public List<User> getAllUsers() {
        List<User> result = new ArrayList<>();
        userRepository.findAll().forEach(a -> {
            result.add(new User(a.getName(), a.getPassword()));
        });
        return result;
    }
    public Integer getUserId(String name) {
        List<UserModel> allUsers = getAllUsersWithId();
        Integer result = -1;
        for(int i = 0; i < allUsers.size(); i++) {
            if(allUsers.get(i).getName().equals(name)) {
                result = allUsers.get(i).getId();
            }
        };
        return result;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneBooking(Integer userid, Integer flightid, String date) {
        BookingModel model = new BookingModel(userid, flightid, date);
        bookingRepository.save(model);
    }
    public List<BookingModel> getAllBookingsWithId() {
        List<BookingModel> result = new ArrayList<>();
        bookingRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public BookingModel getBookingWithId(Integer id) {
        BookingModel result = bookingRepository.findById(id).get();
        return result;
    }
    public List<Booking> getAllBooking() {
        List<Booking> result = new ArrayList<>();
        bookingRepository.findAll().forEach(a -> {
            result.add(new Booking(getAllUsers().get(a.getUserid()), getAllFlights().get(a.getFlightid()), a.getDate()));
        });
        return result;
    }
    ////////////////////////////////////////////////////////////////////////////
    public void saveOneFlight(String origin, String destination, String airline,
                              String airplane, String days, String time, Integer number) {
        FlightModel model = new FlightModel(getAirportId(origin), getAirportId(destination),
                getAirlineId(airline), getAirplaneId(airplane), days, time, number);
        flightRepository.save(model);
    }
    public List<FlightModel> getAllFlightsWithId() {
        List<FlightModel> result = new ArrayList<>();
        flightRepository.findAll().forEach(a -> {
            result.add(a);
        });
        return result;
    }
    public FlightModel getFlightWithId(Integer id) {
        FlightModel result = flightRepository.findById(id).get();
        return result;
    }
    public List<Flight> getAllFlights() {
        List<Flight> result = new ArrayList<>();
        flightRepository.findAll().forEach(a -> {
            result.add(new Flight(getAllAirports().get(a.getOriginid()), getAllAirports().get(a.getDestinationid()),
                    getAllAirlines().get(a.getAirplaneid()), getAllAirplanes().get(a.getAirplaneid()), a.getDays(),
                    a.getTime(), a.getNumber()));
        });
        return result;
    }
}
