package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue
	private Integer prodId;
	@NonNull
	private String prodCode;
	@NonNull
	private Double prodCost;
	
	
}
