/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class Scena2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       FlowPane pane= new FlowPane();
       pane.setPadding(new Insets(11, 12, 13, 14));
       pane.setHgap(5);
       pane.setVgap(5);
       pane.getChildren().addAll(new Label("FirstName:"),new TextField(), new Label("MI:"));
       TextField tfMi= new TextField();
       tfMi.setPrefColumnCount(1);pane.getChildren().addAll(tfMi, new Label("LastName:"),new TextField());
       Scene scena2 = new Scene(pane,500,500);
       primaryStage.setScene(scena2);
       primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
