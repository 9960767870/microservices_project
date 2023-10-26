package com.microservices.hotelservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.hotelservice.Exceptions.ResourceNotFoundException;
import com.microservices.hotelservice.beans.Hotel;
import com.microservices.hotelservice.repository.HotelRepository;
import com.microservices.hotelservice.services.HotelServices;


@Service
public class HotelServiceImpl implements HotelServices{

	@Autowired
	HotelRepository hotelRepository;
	
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		int id =(int) Thread.currentThread().getId();
		hotel.setHotelId(id);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel With Given Id is Not Found "+hotelId));
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		Hotel hotel2 = hotelRepository.findById(hotel.getHotelId()).get();
		hotel2.setHotelId(hotel.getHotelId());
		hotel2.setName(hotel.getName());
		hotel2.setAbout(hotel.getAbout());
		hotel2.setLocation(hotel.getLocation());
		
		return hotelRepository.save(hotel2);
	}

	@Override
	public String deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
		 return "SuccessFully Deleted Hotel";
	}

}
