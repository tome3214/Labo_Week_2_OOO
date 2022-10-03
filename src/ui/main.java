package ui;
// import for reading input
import java.util.Scanner;

import domain.Caesar;
import domain.mirrorring;
import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;


import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        new UserInterface(stage);
    }

}

