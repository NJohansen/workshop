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
public class BuildingManager {

    public ArrayList<Building> buildings = new ArrayList<Building>();
    
    public void addBuilding(Building building) {
        buildings.add(building);
    }
  
    public void delBuilding(Building building) {
        buildings.remove(building);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
}