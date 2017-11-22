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
            System.out.println("Building name: " + system.getBuildings().get(i).getName());
            System.out.println("Building location: " + system.getBuildings().get(i).getLocation());
        }

        Location location = system.getBuildings().get(0).getLocation();
        System.out.println(location);

        BuildingManager system2 = new BuildingManager();
        Building building = new Building("Joes");
        system2.addBuilding(building);
        Location location2 = new Location("City of Soren");
        system2.getBuildings().get(0).setLocation(location2);
        String a = system2.getBuildings().get(0).getName();
        String b = system2.getBuildings().get(0).getLocation().getLocationCity();
        System.out.println("Building name: " + a + " \nBuilding Location: " + b);

    }
}
