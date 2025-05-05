package com.home.java10;

import java.util.Optional;

public class OptionalApi {

    public static void main(String[] args) {
        var name = "Vivek1";
        var employee = Optional.ofNullable(getEmployeeName(name))
                .orElseThrow(() -> new RuntimeException("No Employee present with given name: " + name));
        System.out.println("Employee present with given name: " + name);
    }

    public static Employee getEmployeeName(String name){
        if(name.equals("Vivek") || name.equals("Shivam")){
            return new Employee();
        }
        else{
            return null;
        }
    }
}
