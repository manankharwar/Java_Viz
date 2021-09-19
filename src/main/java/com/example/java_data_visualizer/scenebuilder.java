package com.example.java_data_visualizer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class scenebuilder {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}