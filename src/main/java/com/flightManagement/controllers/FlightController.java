package com.flightManagement.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flightManagement.models.Flight;
import com.flightManagement.services.FlightService;

import jakarta.validation.Valid;

@Controller
public class FlightController {

	    @Autowired
	    private FlightService flightService;

	    @GetMapping("/getFlights")
	    public String getFlights(@Valid @ModelAttribute Flight flight, BindingResult result,@RequestParam("departureCity") String from, @RequestParam("arrivalCity") String to, @RequestParam("dateOfDeparture") String departureDate, Model model) {
	    	
	    	if(result.hasErrors()) {
	    		return "access";
	    	}
	    	
	        List<Flight> flights =  this.flightService.findFlights(from.toUpperCase(), to.toUpperCase(), departureDate.toUpperCase());
	        model.addAttribute("flights", flights);
	        return "displayFlights";
	        
	    }
	    
	    
	    @GetMapping("/flights")
	    public String getAllFlights( Model model) {
	    	List<Flight> flights = this.flightService.getAllFlights();
	    	model.addAttribute("flights", flights);
	    	return "allFlights";
	    }
	    
	    @ResponseBody
	    @PostMapping("/flights")
	    public ResponseEntity<String> postFlight(@RequestBody Flight flight){
	    	try {
	    		
	    		this.flightService.saveFlight(flight);
	    		return ResponseEntity.ok("saved");
	    		
	    	} catch(Exception e) {
	    		e.printStackTrace();
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please Enter A Valid Flight");
	    	}
	    }
	    
	    @ResponseBody
	    @PutMapping("/flights/{flightId}")
	    public ResponseEntity<String> updateFlight(@PathVariable("flightId") String flightId, @RequestBody Flight newFlight){
	    	
	    	try {
	    		
	    		this.flightService.saveFlight(newFlight);
	    		return ResponseEntity.ok("updated");
	    		
	    	} catch(Exception e) {
	    		e.printStackTrace();
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please Enter A Valid Flight");
	    	}
	    	
	    }
	    

}
