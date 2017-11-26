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
public class Room {

    private String name;
    private Sensor sensor;
    private ArrayList<Sensor> sensors = new ArrayList<>();

    public Room() {
        this.name = "Unnammed Room";
        this.sensor = new Sensor();
        this.sensors.add(sensor);
    }

    public Room(String name) {
        this.name = name;
        this.sensor = new Sensor();
    }

    public String getRoomName() {
        return name;
    }

    public String setRoomName(String name) {
        return this.name = name;
    }

    public void addSensorToRoom(Sensor sensor) {
        this.sensor = sensor;
    }
    public Sensor getSensor(){
        return sensor;
    }
}
