package com.neu.design.abfactory;

import com.neu.design.abfactory.product.GPS;
import com.neu.design.abfactory.product.Radio;
import com.neu.design.abfactory.product.Seat;

public interface AbstractFactory {

	public Seat crateSeat();
	public Radio crateRadio();
	public GPS crateGPS();
	
}
