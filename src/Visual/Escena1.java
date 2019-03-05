/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class Escena1 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
         
        GridPane pane = new GridPane();
        pane.add(new Label("Ingrese Usuario"), 0, 0);
        pane.add(new TextField(),1,0);
        pane.add(new TextField(),1,1);
        pane.add(new Label ("Ingrese Contrasena"), 0, 1);
        Button acepar = new Button("Aceptar   ");
        Button borrar = new Button("Borrar     ");
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(Background.EMPTY);
        pane.setBorder(Border.EMPTY);
        pane.setHgap(15);
        pane.setVgap(10);
        VBox vbox = new VBox(pane,acepar,borrar);
        Scene escena1 = new Scene(vbox,300,300);
        stage.setTitle("nombre principal");
        stage.setScene(escena1);
        stage.show();
        
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
   
    
}
