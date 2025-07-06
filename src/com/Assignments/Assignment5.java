package com.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		//List
		
		List<String> empId1=new ArrayList<String>();
		empId1.add("E001");
		empId1.add("Alice Green");
		empId1.add("30");
		empId1.add("Female");
		empId1.add("Engineering");
		empId1.add("Software Engineer");
		empId1.add("75,000");
		empId1.add("alice@example.com");
		empId1.add("9876543213");
		
		List<String> empId2=new ArrayList<String>();
		empId2.add("E002");
		empId2.add("Bob Johnson");
		empId2.add("35");
		empId2.add("Male");
		empId2.add("Marketing");
		empId2.add("Marketing Manager");
		empId2.add("85,000");
		empId2.add("bob@example.com");
		empId2.add("9876543214");
		
		List<String> empId3=new ArrayList<String>();
		empId3.add("E003");
		empId3.add("Carol White");
		empId3.add("28");
		empId3.add("Female");
		empId3.add("Sales");
		empId3.add("Sales Executive");
		empId3.add("65,000");
		empId3.add("Carol@example.com");
		empId3.add("9876543215");
		
		for(int i=0; i<empId2.size(); i++) {
			
			
			if(empId2.get(i).equalsIgnoreCase("bob@example.com")) {
				System.out.println("List - "+empId2.get(i));
				break;
			}
		}
		
		//Set
		
		Set<String> empId4=new HashSet<String>();
		empId4.add("E001");
		empId4.add("Alice Green");
		empId4.add("30");
		empId4.add("Female");
		empId4.add("Engineering");
		empId4.add("Software Engineer");
		empId4.add("75,000");
		empId4.add("alice@example.com");
		empId4.add("9876543213");
		
		Set<String> empId5=new HashSet<String>();
		empId5.add("E002");
		empId5.add("Bob Johnson");
		empId5.add("35");
		empId5.add("Male");
		empId5.add("Marketing");
		empId5.add("Marketing Manager");
		empId5.add("85,000");
		empId5.add("bob@example.com");
		empId5.add("9876543214");
		
		Set<String> empId6=new HashSet<String>();
		empId6.add("E003");
		empId6.add("Carol White");
		empId6.add("28");
		empId6.add("Female");
		empId6.add("Sales");
		empId6.add("Sales Executive");
		empId6.add("65,000");
		empId6.add("Carol@example.com");
		empId6.add("9876543215");
		
		for (String value : empId5) {
		    if (value.equalsIgnoreCase("bob@example.com")) {
		        System.out.println("Set - " + value);
		        break;
		    }
		}
		
		
		
		//Map
		
		Map<String,String> empId7=new HashMap<String,String>();
		empId7.put("EmpId","E002");
		empId7.put("EmpName","Bob Johnson");
		empId7.put("EmpAge","35");
		empId7.put("EmpGender","Male");
		empId7.put("EmpDep","Marketing");
		empId7.put("EmpPos","Marketing Manager");
		empId7.put("Empsalary","85,000");
		empId7.put("EmpEmailid","bob@example.com");
		empId7.put("EmpPhno","9876543214");
		
		
		for (String value : empId7.values()) {
		    if (value.equalsIgnoreCase("bob@example.com")) {
		        System.out.println("Map - " + value);
		        break;
		    }
		}

	}

}
