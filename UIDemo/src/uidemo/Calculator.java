/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uidemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author petri.ryynanen
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // UI Define
        Label laNumber1 = new Label("Number1:");
        TextField txtNumber1 = new TextField();
        
        GridPane grid =  new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setGridLinesVisible(true); // For development only
        grid.add(laNumber1,0,0);
        grid.add(txtNumber1,1,0);
        Scene scene = new Scene(grid, 600, 600);
        
        primaryStage.setTitle("UI Demo screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
