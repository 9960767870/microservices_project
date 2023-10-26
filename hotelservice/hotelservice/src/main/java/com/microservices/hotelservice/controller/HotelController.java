package com.microservices.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.hotelservice.beans.Hotel;
import com.microservices.hotelservice.services.HotelServices;


@RestController
@RequestMapping("/v1/micro")
public class HotelController {

	
	@Autowired
	HotelServices hotelServices;
	
	@PostMapping("/createhotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		Hotel createHotel = hotelServices.createHotel(hotel);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);
		
	}
	
	@GetMapping("/getallhotel")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		
		List<Hotel> allHotel = hotelServices.getAllHotel();
		
		return ResponseEntity.status(HttpStatus.OK).body(allHotel);
		
	}
	
	@GetMapping("/gethotelbyid")
	public ResponseEntity<Hotel> getHotelById(@RequestParam int hotelId){
		
		Hotel hotelById = hotelServices.getHotelById(hotelId);
		
		return ResponseEntity.status(HttpStatus.OK).body(hotelById);
		
	}
	
	@PutMapping("/updatehotel")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel user){
		
		Hotel updatedHotel = hotelServices.updateHotel(user);
		
		return ResponseEntity.status(HttpStatus.OK).body(updatedHotel);
		
	}
	
	
	@DeleteMapping("/deletehotel")
	public ResponseEntity<String> deleteUser(@RequestParam int hotelId){
		
		 String deleteHotel = hotelServices.deleteHotel(hotelId);
		
		return ResponseEntity.status(HttpStatus.OK).body(deleteHotel);
		
	}
}
