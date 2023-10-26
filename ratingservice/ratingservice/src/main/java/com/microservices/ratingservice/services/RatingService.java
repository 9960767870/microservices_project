package com.microservices.ratingservice.services;

import java.util.List;

import com.microservices.ratingservice.beans.Rating;




public interface RatingService {

	
	 public abstract Rating create(Rating rating);
		
		public abstract List<Rating> getRatings();
		
		public abstract List<Rating> getRatingByUserId(int userId);
		
		public abstract List<Rating> getRatingByHotelId(int hotelId);
		
		
}
