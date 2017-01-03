package com.neu.design.abfactory;

import com.neu.design.abfactory.honda.HondaGPS;
import com.neu.design.abfactory.honda.HondaRadio;
import com.neu.design.abfactory.honda.HondaSeat;
import com.neu.design.abfactory.product.GPS;
import com.neu.design.abfactory.product.Radio;
import com.neu.design.abfactory.product.Seat;

public class HondaFactory implements AbstractFactory {

	public Seat crateSeat() {
		return new HondaSeat();
	}

	public Radio crateRadio() {
		return new HondaRadio();
	}

	public GPS crateGPS() {
		return new HondaGPS();
	}

}
