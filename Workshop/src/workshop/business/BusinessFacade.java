/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.business;

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
    public BusinessFacade(){
        buildingManager = new BuildingManager();
    }
    
    @Override
    public void getRoomNames(){
        building.getRoomNames();
    }
}
