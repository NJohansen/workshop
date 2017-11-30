/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import workshop.acqaintance.IBusiness;
import workshop.acqaintance.IUI;

/**
 *
 * @author niclasjohansen
 */
public class UI extends Application implements IUI {
    static IBusiness business;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
        Parent root = loader.load();
        
        FXMLController controller = loader.getController();
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Sensor system");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    @Override
    public void injectBusiness(IBusiness businessLayer){
        business = businessLayer;
    }
    
    @Override
    public void startApplication(String[] args) {
         launch(args);
    }
    
}   
