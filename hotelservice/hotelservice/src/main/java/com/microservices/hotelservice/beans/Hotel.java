package com.microservices.hotelservice.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="microhotel")
public class Hotel {

	@Id
	private int hotelId;
	private String name;
	private String about;
	private String location;
}
