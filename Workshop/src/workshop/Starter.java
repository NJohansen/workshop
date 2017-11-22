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
public class Starter {



    public static void main(String[] args) {

        BuildingManager system = new BuildingManager();

        system.addBuilding(new Building("Bygning 0"));
        system.addBuilding(new Building("Bygning 1"));
        system.addBuilding(new Building("Bygning 2"));
        system.addBuilding(new Building("Bygning 3"));
        system.addBuilding(new Building("Bygning 4"));
        system.addBuilding(new Building("Bygning 5"));
        
        for (int i = 0; i < system.getBuildings().size(); i++) {
            System.out.println(system.getBuildings().get(i).getName());
        }
    }
}
