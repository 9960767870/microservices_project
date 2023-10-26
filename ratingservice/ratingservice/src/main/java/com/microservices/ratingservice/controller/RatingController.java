package com.microservices.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ratingservice.beans.Rating;
import com.microservices.ratingservice.services.RatingService;

@RestController
@RequestMapping("/v1/micro")
public class RatingController {

	
	@Autowired
	RatingService ratingService;
	
	@PostMapping("/createrating")
	public ResponseEntity<Rating> createHotel(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
		
	}
	
	@GetMapping("/getallratings")
	public ResponseEntity<List<Rating>> getRatings(){
		
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatings());
		
	}
	
	@GetMapping("/getratingbyuserid")
	public ResponseEntity<List<Rating>> getRatingByUserId(@RequestParam("userId") int userId){
			
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));
		
	}
	
	@PutMapping("/getratingbyhotelid")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@RequestParam("hotalId") int hotelId){
	
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));
		
	}
	
}
