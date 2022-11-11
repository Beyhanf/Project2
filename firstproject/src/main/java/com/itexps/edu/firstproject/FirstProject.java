/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.edu.firstproject;

import java.util.ArrayList;

/**
 *
 * @author beyhan
 */
public class FirstProject {
    private int Id;
    private String Name;
    ArrayList<String> employeeList= new ArrayList<String>();

    public FirstProject() {
    }

    public FirstProject(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "FirstProject{" + "Id=" + Id + ", Name=" + Name + ", employeeList=" + employeeList + '}';
    }

    
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<String> employeeList) {
        this.employeeList = employeeList;
    }
    
    
    
    
    
}