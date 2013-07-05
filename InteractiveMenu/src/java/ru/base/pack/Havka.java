package ru.base.pack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Сергей
 */
public class Havka {
    private double Cost;
    private String Name;
    private Integer ID;
    private String Consistance;
    
    public Havka (){}
    
    public void SetName (String name) {
        Name = name;   
    }    
    public String GetName () {
        return Name;
    }    
    public void SetCost (double cost) {
        Cost = cost;   
    }    
    public double GetCost () {
        return Cost;
    }
    
    public void SetID (Integer id) {
        ID = id;   
    }    
    public Integer GetID () {
        return ID;
    }    
    public void SetConsistance (String consist) {
        Consistance = consist;   
    }    
    public String GetConsistance () {
        return Consistance;
    }
}
