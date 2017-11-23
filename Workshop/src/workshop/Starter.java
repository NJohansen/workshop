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

        BuildingManager program = new BuildingManager();

        program.addBuilding(new Building("Bygning 0"));
        program.getBuildings().get(0).setMeasurement(new Measurement());
        program.addBuilding(new Building("Bygning 1"));
        program.getBuildings().get(1).setMeasurement(new Measurement());
        program.addBuilding(new Building("Bygning 2"));
        program.getBuildings().get(2).setMeasurement(new Measurement());
        program.addBuilding(new Building("Bygning 3"));
        program.getBuildings().get(3).setMeasurement(new Measurement());
        program.addBuilding(new Building("Bygning 4"));
        program.getBuildings().get(4).setMeasurement(new Measurement());
        program.addBuilding(new Building("Bygning 5"));
        program.getBuildings().get(5).setMeasurement(new Measurement());

        for (int i = 0; i < program.getBuildings().size(); i++) {
            System.out.println("Building name: " + program.getBuildings().get(i).getName());
            System.out.println("Building location: " + program.getBuildings().get(i).getLocation());
            System.out.println("Measurement: " + program.getBuildings().get(i).getMeasurement().value);
            System.out.println("Measurement: " + program.getBuildings().get(i).getMeasurement().temp + "\n");

        }

        BuildingManager program2 = new BuildingManager();
        Building building = new Building("Joes");
        program2.addBuilding(building);
        Location location2 = new Location("City of Soren");
        program2.getBuildings().get(0).setMeasurement(new Measurement(2.2, 2.2));
        program2.getBuildings().get(0).setLocation(location2);
        String a = program2.getBuildings().get(0).getName();
        String b = program2.getBuildings().get(0).getLocation().getLocationCity();

        System.out.println("Building name: " + a + " \nBuilding Location: " + b + " " + program2.getBuildings().get(0).getMeasurement().value);

    }
}
