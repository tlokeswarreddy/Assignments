package com.Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {

		String[] empName = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		Double[] empd1 = { 75000.0, 5.0, 4.2 };
		Double[] empd2 = { 68000.0, 3.0, 3.8 };
		Double[] empd3 = { 82000.0, 7.0, 4.5 };
		Double[] empd4 = { 90000.0, 10.0, 2.0 };
		Double[] empd5 = { 60000.0, 2.0, 3.5 };

		Map<String, Double[]> empData = new HashMap<String, Double[]>();

		empData.put(empName[0], empd1);
		empData.put(empName[1], empd2);
		empData.put(empName[2], empd3);
		empData.put(empName[3], empd4);
		empData.put(empName[4], empd5);
		
		Map<String,Double> hikemap=new HashMap<String, Double>();

		for (int i = 0; i < empName.length; i++) {

			Double[] data1 = empData.get(empName[i]);

			Double baseSalary = data1[0];
			Double experience = data1[1];
			Double rating = data1[2];

			Double variablepaypercentage = 0.0;
			Double bonus = 0.0;
			Double reward = 0.0;

			if (rating >= 4) {
				variablepaypercentage = 15.0;
				bonus = 1500.0;

			} else if (rating >= 3 & rating <= 4) {

				variablepaypercentage = 10.0;
				bonus = 1200.0;

			} else if (rating < 3) {

				variablepaypercentage = 3.0;
				bonus = 300.0;

			}

			if (experience >= 5) {
				reward=5000.0;
			}
			
			Double hike=(baseSalary*variablepaypercentage)+bonus+reward;
			
			Double hikePercentage=hike/baseSalary;
			
			hikemap.put(empName[i], hikePercentage);
			
			
			
			

		}
		System.out.println(hikemap);

	}

}
