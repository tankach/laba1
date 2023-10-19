/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laba1;

/**
 *
 * @author tanka
 */
public class Laba1 {

    public static void main(String[] args) {
        try{
            Employee emp1=new Employee("John", "Doe", 5000.0);
            emp1.PrintEmpoyee();
        }catch(FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        try{
        Employee emp2=new Employee("Alice", "Smith", -2000.0);
        emp2.PrintEmpoyee();
        }catch(FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee emp3=new Employee("VeryLongNameThatExceedsTheCharacterLimit", "Johnson", 4000.0);
            emp3.PrintEmpoyee();
        }catch(FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
