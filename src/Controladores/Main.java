/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class Main extends Application {
     

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent ventana = FXMLLoader.load(getClass().getResource("Visual/Escena 3.fxml"));
        Scene escena = new Scene(ventana);
        primaryStage.setScene(escena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}