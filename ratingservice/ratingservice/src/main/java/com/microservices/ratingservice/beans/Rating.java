package com.microservices.ratingservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="microrating")
public class Rating {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int ratingId;
	private int userId;
	private int hotelId;
	private int rating;
	private String feedback;
}
