package com.microservices.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.hotelservice.beans.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
