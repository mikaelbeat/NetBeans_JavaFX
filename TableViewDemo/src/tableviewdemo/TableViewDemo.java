/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author petri.ryynanen
 */
public class TableViewDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Define table view
        
        // 1 - Define data set
        ObservableList<Accounts> accountlist =
                FXCollections.observableArrayList(
                        new Accounts("Snake","12345","Admin"),
                        new Accounts("Monkey","11111","Tester"),
                        new Accounts("Cat","QWERTY","QA"),
                        new Accounts("Fish","Chips","Manager"),
                        new Accounts("Dog","fooD","Tester")
                );

        // 2- Define table view
        TableView<Accounts> tvAccounts = 
                new TableView<>(accountlist);
        TableColumn<Accounts, String> fUserName =
                new TableColumn<>("User Name");
        fUserName.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        tvAccounts.getColumns().add(fUserName);

        TableColumn<Accounts, String> fPassword =
                new TableColumn<>("Password");
        fPassword.setCellValueFactory(new PropertyValueFactory<>("Password"));
        tvAccounts.getColumns().add(fPassword);

        TableColumn<Accounts, String> fType =
                new TableColumn<>("Account Type");
        fType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        tvAccounts.getColumns().add(fType);
        tvAccounts.setPrefSize(300, 350);
        
        
        FlowPane root = new FlowPane();
        root.getChildren().add(tvAccounts);

        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Table view DEMO");
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


Video 14,18