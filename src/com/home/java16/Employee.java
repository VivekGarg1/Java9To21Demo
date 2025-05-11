package com.home.java16;

public class Employee {

    private Integer empNo;
    private String empName;

    public Employee(Integer empNo, String empName) {
        if(empName.length() <= 2)
            throw new IllegalArgumentException("Name should be greater than 2 characters.");
        this.empNo = empNo;
        this.empName = empName;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ']';
    }
}
