# smartFlightManagement
Required Software
To run this application, you'll need:

IDE: STS (Spring Tool Suite), VS Code, or any IDE that supports Spring Boot applications.
Database: MongoDB.

Endpoints

/register
To register a user

/signIn
for signing in

/
for going to home page

@Get
/flights
for getting all the flights

@Post
/flights
for posting a flight data.
e.g :-

{
 
       "flightId": "9A 2773",
 
       "operatingAirline": "Indigo",
       
       "departureCity":"PAT",
       
       "arrivalCity":"DEL",
       
       "dateOfDeparture":"2024-08-11",
       
       "delay":0,
       
       "gateNumber":"3E",
 
       "status": "On Time"
 
   }

   @Put
   /flights/{id}
   for updating the entry.
   e.g :-

   {
 
       "flightId": "{id}",
 
       "operatingAirline": "Indigo",
       
       "departureCity":"PAT",
       
       "arrivalCity":"DEL",
       
       "dateOfDeparture":"2024-08-11",
       
       "delay":0,
       
       "gateNumber":"3E",
 
       "status": "On Time"
 
   }

   

Project Overview
This project is a flight management web application designed with a modern tech stack:

Backend: Spring Boot, MongoDB, and Spring Validations.
Frontend: HTML, CSS, and Bootstrap.
Template Engine: Thymeleaf.
Features
Flight Search: Users can search for flights by entering the IATA source code, destination code, and travel date. The flight details are fetched from MongoDB and displayed on the screen.
View All Flights: Users can view a comprehensive list of flights, including details like flight status, departure gate, and potential delays.
User Registration and Login: Users can register and log in using Jakarta Validations to ensure data integrity and security.
Architecture
The project employs Object-Oriented Programming (OOP) principles, with a well-defined architecture that includes:

Service Layer: Manages business logic.
DAO Layer: Handles data access operations.
Model Layer: Defines the data structures.
The use of Thymeleaf helps create cleaner, more user-friendly URLs.
