package by.epam.lesson12.inner;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		System.out.println("*****Inner class*****");
		System.out.println("");
		Smartphone smartphone1 = new Smartphone("iOS", "Apple iPhone 6 Plus", 2016);
		smartphone1.init("Apple 616-0772", 2915, 800);
		Smartphone smartphone2 = new Smartphone("iOS", "Apple iPhone 7", 2017);
		smartphone2.init("Apple 812-6666", 3000, 100);

		System.out.println("");
		System.out.println("*****Nested class*****");
		SmartphoneAndCharger.LifeCharger.use();

		// создание объекта статического класса
		SmartphoneAndCharger.LifeCharger lifeCharger = new SmartphoneAndCharger.LifeCharger(1);
		lifeCharger.chargingWhatYouWant();
		lifeCharger.chargingByDefault();

		System.out.println("");
		System.out.println("*****Anonymous class*****");
		System.out.println("");
		List<Smartphone> smartphoneList = new ArrayList<Smartphone>();
		Smartphone smartphone3 = new Smartphone("Android", "Samsung Galaxy A5", 2016);
		smartphoneList.add(smartphone1);
		smartphoneList.add(smartphone2);
		smartphoneList.add(smartphone3);

		Collections.sort(smartphoneList, new Comparator<Smartphone>() {
			public int compare(Smartphone smartphoneOne, Smartphone smartphoneTwo) {
				return (smartphoneOne.getPhoneModel().compareTo(smartphoneTwo.getPhoneModel()));
			}
		});

		System.out.println("The sorting by model");
		for (Smartphone e : smartphoneList) {
			System.out.println(e.toString());

		}

		Collections.sort(smartphoneList, new Comparator<Smartphone>() {
			public int compare(Smartphone smartphoneOne, Smartphone smartphoneTwo) {
				return (smartphoneOne.getYear().compareTo(smartphoneTwo.getYear()));
			}
		});
		System.out.println("The sorting by year");
		Iterator<Smartphone> iter = smartphoneList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());

		}

	}
}
