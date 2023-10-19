/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laba1;

/**
 *
 * @author tanka
 */
class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;

    private static int nextId = 1;


    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id= nextId++;
        if(name.length()>15){throw new FieldLengthLimitException("Too much sumbols in name!");}
        else{this.name = name;}
       
        if(surname.length()>15){throw new FieldLengthLimitException("Too much sumbols in surname!");}
        else{this.surname = surname;}
        
        if(salary < 0){throw new IncorrectSalaryException("Salary cannot be negative");}
        else{this.salary = salary;}
    }

  

    public void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name"+name);
    }
}
    

