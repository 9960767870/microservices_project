package com.microservices.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.ratingservice.beans.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>{
   
	
	/*custom finder methods*/
	
	List<Rating> findByUserId(int userId);
	List<Rating> findByHotelId(int hotelId);
	
}
