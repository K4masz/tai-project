/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.application.common;

/**
 *
 * @author 
 */
public class DataRow {
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String phoneNumber;
    
    public DataRow(String name, String lastName, Integer age, String city, String phoneNumber){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.city=city;
        this.phoneNumber=phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public Integer getAge(){
        return age;
    }
    
    public void setAge(Integer age){
        this.age=age;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
}
