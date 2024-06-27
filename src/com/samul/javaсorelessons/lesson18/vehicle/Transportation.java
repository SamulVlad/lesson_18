package com.samul.javaсorelessons.lesson18.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Transportation {

	public static void main(String[] args) {
		List<Vehicle> trans = new ArrayList<>();

		trans.add(new Car(4, "Caddy"));
		trans.add(new Car(3, "Zoye"));
		trans.add(new Car(4, "Dziguli"));
		trans.add(new Bicycle(2, "Bike"));
		trans.add(new Bicycle(3, "Trike"));
		trans.add(new Bicycle(2, "Tandem"));

		for (Vehicle elem : trans) {
			elem.dysplayInfo();
			
			if (elem instanceof Car) {
				((Car) elem).displayCarInfo();
			} else if (elem instanceof Bicycle) {
				((Bicycle) elem).displayBiCycleInfo();
			}
		}

	}

}
