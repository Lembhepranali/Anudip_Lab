package com.AnudipLab;

import java.util.HashMap;

public class EmployeeHashMap  {

    public static void main(String[] args) {
        // Creating a HashMap to store employee ID and employee name mappings
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        //Insert elements to the Hashmap for the Employee
        employeeMap.put(1001, "Pranali");
        employeeMap.put(1002, "Shruti");
        employeeMap.put(1003, "Basundhara");
        employeeMap.put(1004, "Snehal");
        employeeMap.put(1005, "Srinidhi");

        // Displaying the HashMap
        System.out.println("Employee HashMap: " + employeeMap);

        //Access keys of the map
        System.out.println("Keys: " + employeeMap.keySet());

        //Access values of the map
        System.out.println("Values: " + employeeMap.values());

        //Access entries of the map
        System.out.println("Entries: " + employeeMap.entrySet());

    }
}

