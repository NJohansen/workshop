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
    private int floor; 
    
    

    public Room() {

    }

    public Room(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return name;
    }

    public String setRoomName(String name) {
        return this.name = name;
    }

    public void addSensor() {

    }

    public int getFloor() {
        return floor;
    }
    

}
