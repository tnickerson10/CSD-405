/*
Travis Nickerson
CSD 405
July 10th, 2021
Assignment 7 HBox Example
 */
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    // overriding the start method
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // creating 3 buttons
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");

        // creating an hbox and adding our buttons to it
        HBox hbox = new HBox(b1,b2,b3);

        // giving some spacing to the buttons
        hbox.setSpacing(10);

        // centering the buttons on our scene
        hbox.setAlignment(Pos.BASELINE_CENTER);

        // creating a new scene and passing our hbox in so we can see the buttons
        Scene s = new Scene(hbox, 250, 100);

        // setting the title of the scene
        primaryStage.setTitle("HBox Example");

        // passing in our new scene
        primaryStage.setScene(s);

        // displaying our scene
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
