/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoygame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author petri.ryynanen
 */
public class TicTacToyGame extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button();
        btn1.setText("");
        btn1.setOnAction(event->{
            PlayGame(1,btn1);
        });
        
        Button btn2 = new Button();
        btn2.setText("");
        btn2.setOnAction(event->{
            PlayGame(2,btn2);
        });
        
        Button btn3 = new Button();
        btn3.setText("");
        btn3.setOnAction(event->{
            PlayGame(3,btn3);
        });
        
        Button btn4 = new Button();
        btn4.setText("");
        btn4.setOnAction(event->{
            PlayGame(4,btn4);
        });
        
        Button btn5 = new Button();
        btn5.setText("");
        btn5.setOnAction(event->{
            PlayGame(5,btn5);
        });
        
        Button btn6 = new Button();
        btn6.setText("");
        btn6.setOnAction(event->{
            PlayGame(6,btn6);
        });
        
        Button btn7 = new Button();
        btn7.setText("");
        btn7.setOnAction(event->{
            PlayGame(7,btn7);
        });
        
        Button btn8 = new Button();
        btn8.setText("");
        btn8.setOnAction(event->{
            PlayGame(8,btn8);
        });
        
        Button btn9 = new Button();
        btn9.setText("");
        btn9.setOnAction(event->{
            PlayGame(9,btn9);
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        grid.add(btn1,0,0);
        grid.add(btn2,1,0);
        grid.add(btn3,2,0);
        grid.add(btn4,0,1);
        grid.add(btn5,1,1);
        grid.add(btn6,2,1);
        grid.add(btn7,0,2);
        grid.add(btn8,1,2);
        grid.add(btn9,2,2);
        
        
        Scene scene = new Scene (grid, 1600, 1600);
        scene.getStylesheets()
                .add(TicTacToyGame.class.getResource("Style.css")
                .toExternalForm());
        
        primaryStage.setTitle("*Tic Tac Toy Game*");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    void PlayGame(int CellId, Button SelectedButton){
        System.out.println("CellID: " + CellId);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
