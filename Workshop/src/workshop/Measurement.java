/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author niclasjohansen
 */
public class Measurement {

    public int timestamp;
    public double value;
    public double temp;

    public Measurement() {
        this.timestamp = ((int) Math.random() * 10);
        this.value = Math.round((Math.random() * 10.) * 100.) / 100.;
        this.temp = Math.round((Math.random() * 100.) * 100.) / 100.;
    }

    public Measurement(int timestamp, double value, double temp) {
        this.timestamp = timestamp;
        this.value = value;
        this.temp = temp;
    }

    public Measurement(double value, double temp) {
        this.timestamp = 0;
        this.value = value;
        this.temp = temp;
    }

    public Measurement(int timestamp) {
        this.timestamp = timestamp;
        this.value = 0.0;
        this.temp = 0.0;
    }

    public void setMeasurement(int timestamp, double value, double temp) {
        this.timestamp = timestamp;
        this.value = value;
        this.temp = temp;
    }

    public void setMeasurement(double value, double temp) {
        this.value = value;
        this.temp = temp;
        this.timestamp=timestamp;
    }
}
