package com.microservices.hotelservice.services;

import java.util.List;

import com.microservices.hotelservice.beans.Hotel;



public interface HotelServices {

    public abstract Hotel createHotel(Hotel user);
	
	public abstract List<Hotel> getAllHotel();
	
	public abstract Hotel getHotelById(int userId);
	
	public abstract Hotel updateHotel(Hotel user);
	
	public abstract String deleteHotel(int userId);
	
}
