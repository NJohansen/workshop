/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.business;

/**
 *
 * @author niclasjohansen
 */
public class Starter {

    public static void main(String[] args) {

        BuildingManager program = new BuildingManager();
        program.addBuilding();
        program.addBuilding();
        for (int i = 0; i < program.buildings.size(); i++) {
            for (int j = 0; j < program.buildings.get(i).getRoomList().size(); j++) {
                System.out.println(program.buildings.get(i).getRoomList().get(j).getRoomName());
            }
        }


        for (int i = 0; i < program.getBuildings().size(); i++) {
            System.out.println("Building name: " + program.getBuildings().get(i).getName());
            System.out.println(program.getBuildings().get(i).getLocation().printAll());
//            System.out.println("Value of Sensors: " + program.getBuildings().get(i).getMeasurement().value);
//            System.out.println("Temperature of Sensors: " + program.getBuildings().get(i).getMeasurement().temp + "\n");

        }

        BuildingManager program2 = new BuildingManager();
        Building building = new Building("Joes");
        program2.addBuilding(building);
        Location location2 = new Location("City of Soren");
        program2.getBuildings().get(0).getRoomList().get(0).getSensor().getMeasurement().setMeasurement(2.2, 2.2);
        program2.getBuildings().get(0).setLocation(location2);
        String a = program2.getBuildings().get(0).getName();
        String b = program2.getBuildings().get(0).getLocation().getLocationCity();

//        System.out.println("Building name: " + a + " \nBuilding Location: " + b + " " + program2.getBuildings().get(0).getMeasurement().value);
    }
}