package com.mycompany.myapp.models;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "cars")
public class Car 
{
	private int id;
	private String status;
	private String make;
	private String model;
	/*
	private String yearOfProduction;
	private String color;
	private float engineCapacity;
	private int enginePower;
	private String lastEdit;
	private String informations;
	private String deleted;
	*/
}
