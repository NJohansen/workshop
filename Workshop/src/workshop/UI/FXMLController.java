/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import workshop.acqaintance.IBusiness;
import workshop.business.BuildingManager;

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
    private IBusiness ib;
    private ArrayList<String> roomnames;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.ib.BuildingManager();
        this.ib.addBuilding();
        this.roomnames = ib.getRoomNames();

        ObservableList<String> items = FXCollections.observableArrayList(roomnames);
        roomList.setItems(items);
    }

}
