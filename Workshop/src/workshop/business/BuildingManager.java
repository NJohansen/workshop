/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.business;

import java.util.ArrayList;

/**
 *
 * @author niclasjohansen
 */
public class BuildingManager {

    public ArrayList<Building> buildings = new ArrayList<Building>();
    public Building building;
    
    public void addBuilding(Building building) {
        buildings.add(building);
    }
    public void addBuilding(){
        buildings.add(building= new Building());
    }
  
    public void delBuilding(Building building) {
        buildings.remove(building);
    }
    public void delBuilding(int i){
        buildings.remove(i);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
}
