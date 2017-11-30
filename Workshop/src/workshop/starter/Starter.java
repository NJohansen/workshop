/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.starter;

import workshop.UI.UI;
import workshop.acqaintance.IBusiness;
import workshop.acqaintance.IUI;
import workshop.business.BusinessFacade;

/**
 *
 * @author niclasjohansen
 */
public class Starter {
    public static void main (String[] args){
        IBusiness business = new BusinessFacade();
        IUI ui = new UI();
        ui.injectBusiness(business);
        ui.startApplication(args);
        
    }
}
