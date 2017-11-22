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

    public String name;
    public Sensor sensor;
    public Room room;
    public ArrayList<String> rooms = new ArrayList<String>();

    public Room() {

    }

    public Room(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return name;
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public String setRoomName(String name) {
        return this.name = name;
    }

    public void addSensorToRoom(Sensor sensor, Room room) {
        this.sensor = sensor;
        this.room = room;
    }

}
