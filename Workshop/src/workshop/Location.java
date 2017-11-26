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

    public Location() {
        this.x = Math.round(Math.random() * 100) / 100.;
        this.y = Math.round(Math.random() * 100) / 100.;
        this.city = "Unnammed City";
    }

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
        this.city = "No Name";
    }

    public Location(String city) {
        this.x = Math.round(Math.random() * 100) / 100.;
        this.y = Math.round(Math.random() * 100) / 100.;
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

    public String printAll() {
        String s = "City: " + city + "\nX: " + x + " Y: " + y;
        return s;
    }
}
