package com.home.java16;

public record Customer(int empNo, String empName, float salary) {

    public Customer {
        if(empName.length() <= 2)
            throw new IllegalArgumentException("Name should be greater than 2 characters.");
    }

    @Override
    public String empName() {
        return empName.toUpperCase();
    }
}
