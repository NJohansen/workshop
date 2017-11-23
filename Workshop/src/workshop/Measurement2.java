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
public class Measurement2 {

    public double temp;

    public Measurement2() {
        this.temp = Math.round((Math.random() * 10.) * 100.) / 100.;
    }

    public Measurement2(double temp) {
        this.temp = temp;
    }

    public void setMeasurement2(double temp) {
        this.temp = temp;
    }
}
