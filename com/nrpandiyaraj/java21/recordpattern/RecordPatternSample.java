package com.nrpandiyaraj.java21.recordpattern;

public class RecordPatternSample {


    public static void main(String[] args) {
        Employee e1 = new Employee("nrp", 1);
        if (e1 instanceof Employee(String name, int id)) {
            if (id == 0) {
                System.out.println("Object e1 was  created with single param");
            }
            if (id == 1) {
                System.out.println("Object e1 was  created with two params");
            }

        }

        Employee e2 = new Employee("Nrp");
        if (e2 instanceof Employee(String name, int id)) {
            if (id == 0) {
                System.out.println("Object e2 was  created with single param");
            }
            if (id == 1) {
                System.out.println("Object e2 was  created with two params");
            }

        }


    }
}
