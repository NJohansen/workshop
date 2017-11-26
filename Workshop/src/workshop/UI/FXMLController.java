/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import workshop.BuildingManager;

/**
 * FXML Controller class
 *
 * @author niclasjohansen
 */
public class FXMLController implements Initializable {

    @FXML
    private ListView<String> buildingList;
    @FXML
    private ListView<String> roomList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    BuildingManager program = new BuildingManager();
    program.addBuilding();
    
    for(int i = 0; i < program.buildings.size(); i++){
    ObservableList<String> items =FXCollections.observableArrayList (program.getBuildings().get(i).getName());
    buildingList.setItems(items);
    }
    
    for(int i = 0; i < program.building.rooms.size(); i++){
    ObservableList<String> items =FXCollections.observableArrayList (program.building.rooms.get(i).getRoomName());
    roomList.setItems(items);
    }
    
    
    
    }    
    
}
