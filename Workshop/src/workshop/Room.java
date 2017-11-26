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
public class Room {

    public String name;
    public Sensor sensor;
    private int floor;

    public Room() {
        this.name = "testRoom";
        this.sensor = new Sensor();
        this.floor = (int) Math.random() * 10;
    }

    public Room(String name) {
        this.name = name;
        this.sensor = new Sensor();
        this.floor = (int) Math.random() * 10;
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

    public int getFloor() {
        return floor;
    }

}
