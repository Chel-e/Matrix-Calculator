package com.michel.matrixcalculator.controller;

import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;

public interface SceneController {
    public void update(VBox vBox, int... dim);
    public void startOperation();
    public void printResult();
    default TextFormatter<String> numericTextFormatter() {
        return new TextFormatter<>(change -> {
            if (change.getText().matches("\\d*|\\.")) {
                return change;
            }
            return null;
        });
    }
}
