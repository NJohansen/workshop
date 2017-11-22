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

    public Measurement() {
        this.timestamp = 0;
        this.value = 0.0;
    }

    public Measurement(int timestamp, double value) {
        this.timestamp = timestamp;
        this.value = value;
    }

    public Measurement(double value) {
        this.timestamp = 0;
        this.value = value;
    }

    public Measurement(int timestamp) {
        this.timestamp = timestamp;
        this.value = 0.0;
    }
}
