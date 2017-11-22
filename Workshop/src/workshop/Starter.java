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
public class Starter {
    public static ArrayList<Building> buildings;


    public static void main(String[] args) {

       
        BuildingManager system = new BuildingManager();
        Building building = new Building("joes");
        system.addBuilding(building);
        String a = system.getBuildings().toString();
        System.out.println(a);
           
    }
}
