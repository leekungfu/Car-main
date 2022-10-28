package com.vn.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer brandId;
	private Integer modelId;
	private Integer year;
	private String licensePlate;
	private Integer colorId;
	private Integer seat;
	private Integer transmission;
	private Integer fuel;
	private String registrationPaperUrl;
	private String certificateInspectionUrl;
	private String insuranceUrl;
	private Double mileage;
	private Double fuelConsumption;
	private Integer cityId;
	private Integer districtId;
	private Integer wardId;
	private String street;
	private String description;
	private Integer addFunction;
	private String imageUrl;
	private Double price;
	private Integer deposit;
	private Integer term;
	private String termExtra;
	
	@OneToMany(mappedBy = "car")
	private List<Booking> bookings;
}
