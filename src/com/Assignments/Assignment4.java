package com.Assignments;

public class Assignment4 extends Assignment3{
	
	public static void main(String[] args) {
		
//		 String[] empNames= new String[3];
//		 int[] empIds = new int[3];
		
		Assignment4 e=new Assignment4();
		
		String[] empNames= {e.empName1,e.empName2,e.empName3};
		 int[] empIds= {e.empId1,e.empId2,e.empId3};
		
	/*	 
		 empNames[0]=e.empName1;
		 empNames[1]=e.empName2;
		 empNames[2]=e.empName3;
		 
		 empIds[0]=e.empId1;
		 empIds[1]=e.empId2;
		 empIds[2]=e.empId3;
	*/	 
		 for (int i=0; i<empNames.length; i++) {
			 
			 System.out.println(i+".Employee names "+empNames[i] +"---"+"Employee Ids "+empIds[i]);
		 }
		 
	}

}
