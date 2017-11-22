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
    private ArrayList<Measurement> measurement = new ArrayList<>();
    private int unit;
    private int limit;

    public int getData(int data) {
        return this.data = data;
    }

    public ArrayList<Measurement> getMeasurement() {
        return measurement;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
