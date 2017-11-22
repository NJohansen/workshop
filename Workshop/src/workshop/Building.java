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
public class Building {

    public String name;
    public int amountOfRooms = 0;
    private Location location;
    public ArrayList<Room> rooms = new ArrayList<Room>();

    public Building() {
        this.name = null;
        this.location = null;
    }

    public Building(String name) {
        this.name = name;
        this.location = null;
    }

    public Building(Location location) {
        this.location = location;
        this.name = null;
    }

    public Building(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void delRoom(Room room) {
        this.rooms.remove(room);
    }
}
