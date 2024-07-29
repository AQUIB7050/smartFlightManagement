package com.flightManagement.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.flightManagement.models.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {
	
	/*@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date departureDate);*/
	
	public List<Flight> findAllByDepartureCityAndArrivalCityAndDateOfDeparture(String from, String to, String date);

}

