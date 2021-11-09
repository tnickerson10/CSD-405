/*
Travis Nickerson
CSD 405
July 10th, 2021
Assignment 7 Flow Pane Example
 */
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    // overriding the start method
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Creating 3 new circle objects
        Circle c1 = new Circle(25,25,25);
        Circle c2 = new Circle(25,25,25);
        Circle c3 = new Circle(25,25,25);

        // Creating a FlowPane so our circles will overflow when sized down
        FlowPane f1 = new FlowPane();

        // Adding the circles to our flowpane
        f1.getChildren().add(c1);
        f1.getChildren().add(c2);
        f1.getChildren().add(c3);

        // Setting the Horizontal and Vertical spacing of the circles
        f1.setHgap(15);
        f1.setVgap(15);

        // Creating a new scene and passing the flowpane in and setting the size of the scene
        Scene s = new Scene(f1, 200, 100);

        // Setting the scene title
        primaryStage.setTitle("Flow Pane Example");

        // Passing in our scene
        primaryStage.setScene(s);

        // Displaying our scene
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
