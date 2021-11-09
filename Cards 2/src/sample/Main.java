/*
Travis Nickerson
CSD 405
July 24th, 2021
Assignment 10
Goal: write a program that displays four playing cards. In addition, your program should meet the following requirements:
Below the cards, there will be a refresh button that will then display four different cards.
All cards will be displayed through random selection.
 */
// Package import
package sample;

// App imports for javafx
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {

    // Creating an ArrayList to hold our card images
    ArrayList <Image> cardsArr = new ArrayList<Image>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        // This is loader for Java 11
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // for loop that iterates through our AssignmentCards folder and adds them to
        // our ArrayList
        for(int i = 1; i < 55; i++) {
            cardsArr.add(new Image("/AssignmentCards/" + i + ".png"));
        }

        // Creating an HBox to hold our cards in a horizontal row
        HBox p = new HBox(50);
        // Setting the padding between the cards
        p.setPadding(new Insets(5,5,5,5));

        // implementing shuffle method on our ArrayList of cards to get random order
        java.util.Collections.shuffle(cardsArr);

        // Creating the first card image
        Image card1 = (Image) cardsArr.get(0);
        // Adding the card image to an imageView and adding it to the HBox
        p.getChildren().add(new ImageView(card1));

        // Creating the second card image
        Image card2 = (Image) cardsArr.get(1);
        // Adding the card image to an imageView and adding it to the HBox
        p.getChildren().add(new ImageView(card2));

        // Creating the third card image
        Image card3 = (Image) cardsArr.get(2);
        // Adding the card image to an imageView and adding it to the HBox
        p.getChildren().add(new ImageView(card3));

        // Creating the fourth card image
        Image card4 = (Image) cardsArr.get(3);
        // Adding the card image to an imageView and adding it to the HBox
        p.getChildren().add(new ImageView(card4));


        // Creating a new button and setting some margin to pull it off the bottom of
        // the GUI stage
        Button refresh = new Button("Deal My New Cards");
        StackPane.setMargin(refresh, new Insets(20));

        // our try catch block to implement shuffling and drawing new cards upon a user
        // click of our button
        refresh.setOnAction(e -> {
            try {
                // calling our start method and initializes a new shuffled deck of cards
                start(primaryStage);
                java.util.Collections.shuffle(cardsArr);
            }
            // catching a printStackTrace exception
            catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        // Creating a StackPane to organizes our pane and button in StackPane layout
        StackPane stack = new StackPane(p,refresh);

        // positions the pane in the top center of the StackPane
        StackPane.setAlignment(p, Pos.TOP_CENTER);

        // positions the button in the bottom center of the StackPane
        StackPane.setAlignment(refresh, Pos.BOTTOM_CENTER);

        // Creating our scene to place our HBox onto for display that also holds our cards
        Scene s = new Scene(stack, 450, 200);

        // Setting the Scene Title
        primaryStage.setTitle("Deck of Cards");

        // Setting our scene
        primaryStage.setScene(s);

        // Calling our display
        primaryStage.show();

    }

    // running the main method
    public static void main(String[] args) {

        launch(args);
    }
}
