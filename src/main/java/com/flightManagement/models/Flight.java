package com.flightManagement.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Size;


@Document(collection = "flight")
public class Flight {
	
	@Id
	private String flightId;
	private String operatingAirline;
	
	@Size(min=3, max=3, message="Please Enter a Valid IATA code")
	private String departureCity;
	
	@Size(min=3, max=3, message="Please Enter a Valid IATA code")
	private String arrivalCity;
	
	private String dateOfDeparture;
	private double delay;
	private String gateNumber;
	private String status;
	
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	public double getDelay() {
		return delay;
	}
	public void setDelay(double delay) {
		this.delay = delay;
	}
	public String getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlight_id(String flightId) {
		this.flightId = flightId;
	}
	public Flight(String flightId, String operatingAirline, String departureCity, String arrivalCity, String dateOfDeparture, double delay, String gateNumber,
			String status) {
		super();
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.delay = delay;
		this.gateNumber = gateNumber;
		this.status = status;
		this.operatingAirline = operatingAirline;
		this.flightId = flightId;
		
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
