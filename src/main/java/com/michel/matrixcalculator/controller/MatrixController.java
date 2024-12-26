package com.michel.matrixcalculator.controller;

import javafx.fxml.FXML;
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

        Label dimensionsMatrix2 = new Label("Dimensions of the second matrix");

        TextField lineMatrix2 = new TextField();
        lineMatrix2.setPromptText("Line");

        TextField rowMatrix2 = new TextField();
        rowMatrix2.setPromptText("Row");

        vBox.getChildren().addAll(dimensionsMatrix1, lineMatrix1, rowMatrix1, dimensionsMatrix2, lineMatrix2, rowMatrix2);
    }
}