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
public class BusinessFacade {
    private BuildingManager buildingManager;
    
    /*
    * No-arg constructior
    */
    public BusinessFacade(){
        buildingManager = new BuildingManager();
    }
}
