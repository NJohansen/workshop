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
public class System {
    public Building building;
    public ArrayList<String> buildings = new ArrayList<String>();
    
    public void addBuilding(String name) {
        buildings.add(name);
    }
  
    public void delBuilding(String name) {
        buildings.remove(name);
    }
    
}
