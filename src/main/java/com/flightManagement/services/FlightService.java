package com.flightManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightManagement.dao.FlightRepository;
import com.flightManagement.models.Flight;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	
	
	public List<Flight> findFlights(String from, String to, String dateOfDeparture) {
        //return flightRepository.findFlights(from,to,dateOfDeparture);
        return this.flightRepository.findAllByDepartureCityAndArrivalCityAndDateOfDeparture(from, to, dateOfDeparture);
    }
	
	public List<Flight> getAllFlights(){
		 return this.flightRepository.findAll();
	}
	
	public void saveFlight(Flight flight) {
		 this.flightRepository.save(flight);
	}
	
	public void updateFlight(String flightId, Flight newFlight) {
		this.flightRepository.save(newFlight);
	}
	
	

}


/*
 * 
 * 
 * 
 [
 
   {
 
       "flightId": "6E 2341",
 
       "operatingAirline": "Indigo",
       
       "departureCity":"BOM",
       
       "arrivalCity":"PNBE",
       
       "dateOfDeparture":"2024-07-03"
       
       "delay":2.1,
       
       "gateNumber":""8A,
 
       "status": "On Time",
 
   },
 
   {
 
       "flight_id": "6E 2342",
 
       "airline": "Indigo",
 
       "status": "Delayed",
 
       "departure_gate": "C3",
 
       "arrival_gate": "D4",
 
       "scheduled_departure": "2024-07-26T16:00:00Z",
 
       "scheduled_arrival": "2024-07-26T20:00:00Z",
 
       "actual_departure": null,
 
       "actual_arrival": null
 
   },
 
   {
 
       "flightId": "6E 2343",
 
       "airline": "Indigo",
 
       "status": "Cancelled",
 
       "departure_gate": "E2",
 
       "arrival_gate": "F1",
 
       "scheduled_departure": "2024-07-26T12:00:00Z",
 
       "scheduled_arrival": "2024-07-26T16:00:00Z",
 
       "actual_departure": null,
 
       "actual_arrival": null
 
   }
 
]
 
 
 
 Notification Data:
 
[
   {
       "notification_id": "1",
       "flight_id": "6E 2341",
       "message": "Your flight 6E 2341 is on time. Departure gate: A12.",
       "timestamp": "2024-07-26T13:00:00Z",
       "method": "SMS",
       "recipient": "+1234567890"
   },
   {
       "notification_id": "2",
       "flight_id": "6E 2342",
       "message": "Your flight 6E 2342 is delayed. New departure time: 2024-07-26T17:00:00Z. Departure gate: C3.",
       "timestamp": "2024-07-26T15:30:00Z",
       "method": "Email",
       "recipient": "user@example.com"
   },
   {
       "notification_id": "3",
       "flight_id": "6E 2343",
       "message": "Your flight 6E 2343 has been cancelled.",
       "timestamp": "2024-07-26T11:00:00Z",
       "method": "App",
       "recipient": "user_app_id_12345"
   }
]
 
 
 
 
 * */
