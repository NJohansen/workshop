/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;

/**
 *
 * @author niclasjohansen
 */
public class Location {

    private double x;
    private double y;
    private String city;
    private ArrayList<String> cities = new ArrayList<String>();
    
    

    public Location() {
        this.x = Math.round(Math.random()*100)/100.;
        this.y = Math.round(Math.random()*100)/100.;
        this.city ="test";
    }

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
        this.city = null;
    }

    public Location(String city) {
        this.x = 0;
        this.y = 0;
        this.city = city;
    }
    

    public Location(double x, double y, String city) {
        this.x = x;
        this.y = y;
        this.city = city;
    }
    
    public double getLocationX() {
        return x;
    }

    public double getLocationY() {
        return y;
    }

    public String getLocationCity() {
        return city;
    }
}
