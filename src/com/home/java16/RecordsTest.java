package com.home.java16;

public class RecordsTest {

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Vivek Garg");
        //Employee employee = new Employee(101, "VG"); //Name should be greater than 2 characters.
        System.out.println(employee);

        Customer customer = new Customer(101, "Vivek Garg", 100f);
        //Customer customer = new Customer(101, "VG", 100f); //Name should be greater than 2 characters.
        System.out.println(customer);
        System.out.println(customer.empName());
        System.out.println(customer.empNo());

    }
}
