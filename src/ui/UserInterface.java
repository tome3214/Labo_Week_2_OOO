package ui;

import java.util.Scanner;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
// import codingcontext
import domain.Caesar;
import domain.mirrorring;

import static javafx.application.Application.launch;


public class UserInterface {
    private Stage stage;
    private Scene scene;
    private VBox root;
    private HBox top;
    private HBox bottom;
    private Label label;
    private TextField input;
    private Button button;
    private Label output;
    private Button button2;
    private Button button3;
    private Button button4;





    public UserInterface(Stage stage) {
        // make a Stage
        this.stage = stage;
        // make a Scene
        root = new VBox();
        top = new HBox();
        bottom = new HBox();
        // layout
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        top.setPadding(new Insets(10));
        top.setSpacing(10);
        bottom.setPadding(new Insets(10));



        // ask for a string
        label = new Label("Enter a string:");
        // make a TextField
        input = new TextField();
        // remember the string


        // once entered make 2 buttons next to each other encrypt and decrypt
        button = new Button("Caesar");
        button2 = new Button("Mirrorring");
        root.getChildren().addAll(label, input, button, button2);
        // if the user clicks on caesar ask for a shift
        button.setOnAction((event) -> {
            // close the previous scene and make a new one
            root.getChildren().clear();
            // ask for a shift
            Label label2 = new Label("Enter a shift:");
            // make a TextField
            TextField input2 = new TextField();
            // make a button
            Button button3 = new Button("Encrypt");
            Button button4 = new Button("Decrypt");
            root.getChildren().addAll(label2, input2, button3, button4);
            // if the user clicks on encrypt or decrypt show the result with the caesar cipher
            button3.setOnAction((event2) -> {
                root.getChildren().clear();
                // use the shift to show the result
                int shift = Integer.parseInt(input2.getText());
                String text = input.getText();
                String result = Caesar.encrypt(text, shift);
                output = new Label(result);
                root.getChildren().add(output);
                Button button5 = new Button("Back");
                root.getChildren().add(button5);
                button5.setOnAction((event3) -> {
                    root.getChildren().clear();
                    root.getChildren().addAll(label, input, button, button2);
                });
            });
            button4.setOnAction((event2) -> {
                root.getChildren().clear();
                // use the shift to show the result
                int shift = Integer.parseInt(input2.getText());
                String text = input.getText();
                String result = Caesar.decrypt(text, shift);
                output = new Label(result);
                root.getChildren().add(output);
                Button button5 = new Button("Back");
                root.getChildren().add(button5);
                button5.setOnAction((event3) -> {
                    root.getChildren().clear();
                    root.getChildren().addAll(label, input, button, button2);
                });
            });
        });
        button2.setOnAction((event) -> {
            // close the previous scene and make a new one
            root.getChildren().clear();
            // 2 buttons encrypt and decrypt
            Button button3 = new Button("Encrypt");
            Button button4 = new Button("Decrypt");
            root.getChildren().addAll(button3, button4);
            // if user clicks on either use the mirrorring function to show the result
            button3.setOnAction((event2) -> {
                root.getChildren().clear();
                String text = input.getText();
                String result = mirrorring.mirrorring(text);
                output = new Label(result);
                root.getChildren().add(output);
                Button button5 = new Button("Back");
                root.getChildren().add(button5);
                button5.setOnAction((event3) -> {
                    root.getChildren().clear();
                    root.getChildren().addAll(label, input, button, button2);
                });
            });
            button4.setOnAction((event2) -> {
                root.getChildren().clear();
                String text = input.getText();
                String result = mirrorring.mirrorring(text);
                output = new Label(result);
                root.getChildren().add(output);
                // add a button to go back to the start
                Button button5 = new Button("Back");
                root.getChildren().add(button5);
                button5.setOnAction((event3) -> {
                    root.getChildren().clear();
                    root.getChildren().addAll(label, input, button, button2);
                });
            });
            });




            // show the ui

            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();



        }


        // layout function









    }
    // make a nice layout for the ui

    // make the ui visible








    // run the application

