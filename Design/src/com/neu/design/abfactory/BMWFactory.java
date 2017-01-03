package com.neu.design.abfactory;

import com.neu.design.abfactory.bmw.BmwGPS;
import com.neu.design.abfactory.bmw.BmwRadio;
import com.neu.design.abfactory.bmw.BmwSeat;
import com.neu.design.abfactory.product.GPS;
import com.neu.design.abfactory.product.Radio;
import com.neu.design.abfactory.product.Seat;

public class BMWFactory implements AbstractFactory {

	public Seat crateSeat() {
		return new BmwSeat();
	}

	public Radio crateRadio() {
		return new BmwRadio();
	}

	public GPS crateGPS() {
		return new BmwGPS();
	}
}
