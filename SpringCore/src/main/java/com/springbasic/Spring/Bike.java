package com.springbasic.Spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle

{
	public void drive()
	{
		System.out.println("Bhag raha hey");
	}

}
