/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.business;

import java.util.ArrayList;
import workshop.acqaintance.IBusiness;

/**
 *
 * @author niclasjohansen
 */
public class BusinessFacade implements IBusiness {

    private BuildingManager buildingManager;
    private Building building;

    /*
    * No-arg constructior
     */
    
    public BusinessFacade() {
        this.buildingManager = buildingManager;
    }

    @Override
    public ArrayList<String> getRoomNames() {
        return buildingManager.building.getRoomNames();
    }

    @Override
    public void addBuilding() {
        buildingManager.addBuilding();

    }
    @Override
    public void BuildingManager() {
        this.buildingManager = new BuildingManager();
    }

    @Override
    public ArrayList<String> getBuildings() {
        return buildingManager.getBuildingsNames();
    }
    
}
