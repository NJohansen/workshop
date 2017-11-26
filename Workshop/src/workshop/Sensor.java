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
public class Sensor {

    private int data;
    private int limit;
    private Measurement measurements;

    public Sensor(int data, int limit) {
        this.data = data;
        this.limit = limit;
    }

    Sensor() {
        this.data = (int) Math.random() * 100;
        this.limit= (int) Math.random() *10;
        this.measurements= new Measurement();
    }

    public int getData(int data) {
        return this.data = data;

    }
    public Measurement getMeasurement() {
        return measurements;
    }


    public void setLimit(int limit) {
        this.limit = limit;
    }

}
