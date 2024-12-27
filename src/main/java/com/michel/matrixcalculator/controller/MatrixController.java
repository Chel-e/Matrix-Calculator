package com.michel.matrixcalculator.controller;

import com.michel.matrixcalculator.controller.implementationsSceneController.SumController;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;


public class MatrixController {
    @FXML
    private VBox vBox;
    @FXML
    private void onClickSum() {
        Label dimensionsMatrix1 = new Label("Dimensions of the first matrix");

        TextField lineMatrix1 = new TextField();
        lineMatrix1.setPromptText("Line");

        TextField rowMatrix1 = new TextField();
        rowMatrix1.setPromptText("Row");


        Button button = getButton(lineMatrix1, rowMatrix1);
        vBox.getChildren().addAll(dimensionsMatrix1, lineMatrix1, rowMatrix1, button);

    }

    private Button getButton(TextField lineMatrix1, TextField rowMatrix1) {
        Button button = new Button("enter");
        button.setOnMouseClicked(event -> {
            if (lineMatrix1.getText() != null && rowMatrix1.getText() != null) {

                SceneController sceneController = new SumController();
                sceneController.update(vBox,
                        Integer.parseInt(lineMatrix1.getText()), Integer.parseInt(rowMatrix1.getText()));
            }

        });
        return button;
    }
}