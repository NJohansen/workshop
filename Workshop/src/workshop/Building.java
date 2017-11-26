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

    private String name;
    private int amountOfRooms = 0;
    private Location location;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;

    public Building() {
        this.name = "test";
        this.location = new Location();
        this.room1 = new Room();
        this.room2 = new Room();
        this.room3 = new Room();
        this.room4 = new Room();
        this.room5 = new Room();
        this.rooms.add(room1);
        this.rooms.add(room2);
        this.rooms.add(room3);
        this.rooms.add(room4);
        this.rooms.add(room5);

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
