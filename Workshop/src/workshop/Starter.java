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
        system.getBuildings().get(0).setMeasurement(new Measurement(2.1));
        system.addBuilding(new Building("Bygning 1"));
        system.getBuildings().get(1).setMeasurement(new Measurement(2.2));
        system.addBuilding(new Building("Bygning 2"));
        system.getBuildings().get(2).setMeasurement(new Measurement(2.3));
        system.addBuilding(new Building("Bygning 3"));
        system.getBuildings().get(3).setMeasurement(new Measurement(2.4));
        system.addBuilding(new Building("Bygning 4"));
        system.getBuildings().get(4).setMeasurement(new Measurement(2.5));
        system.addBuilding(new Building("Bygning 5"));
        system.getBuildings().get(5).setMeasurement(new Measurement(2.6));

        for (int i = 0; i < system.getBuildings().size(); i++) {
            System.out.println("Building name: " + system.getBuildings().get(i).getName());
            System.out.println("Building location: " + system.getBuildings().get(i).getLocation());
            System.out.println("Measurement: " + system.getBuildings().get(i).getMeasurement().value + "\n" );
        }


        BuildingManager system2 = new BuildingManager();
        Building building = new Building("Joes");
        system2.addBuilding(building);
        Location location2 = new Location("City of Soren");
        system2.getBuildings().get(0).setMeasurement(new Measurement(2.2));
        system2.getBuildings().get(0).setLocation(location2);
        String a = system2.getBuildings().get(0).getName();
        String b = system2.getBuildings().get(0).getLocation().getLocationCity();
        
        System.out.println("Building name: " + a + " \nBuilding Location: " + b + " " + system2.getBuildings().get(0).getMeasurement().value);

    }
}
