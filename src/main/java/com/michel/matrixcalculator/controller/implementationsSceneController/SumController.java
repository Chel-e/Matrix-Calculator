package com.michel.matrixcalculator.controller.implementationsSceneController;

import com.michel.matrixcalculator.controller.SceneController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SumController implements SceneController {
    @Override
    public void update(VBox vBox, int... dim) {
        vBox.getChildren().clear();
        Text firstMatrix = new Text("First Matrix");
        vBox.getChildren().add(firstMatrix);
        createMatrix(vBox, dim[0], dim[1]);
        Text secondMatrix = new Text("Second Matrix");
        vBox.getChildren().add(secondMatrix);
        createMatrix(vBox, dim[0], dim[1]);
        vBox.getChildren().add(new Button("Sum"));
    }

    private void createMatrix(VBox vBox, int line, int row) {
        GridPane gridMatrix = new GridPane();
        gridMatrix.setAlignment(Pos.CENTER);
        vBox.getChildren().add(gridMatrix);
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                TextField textField = new TextField();
                textField.setPromptText((i+1) + "," + (j+1));
                textField.setPrefWidth(50);
                textField.setTextFormatter(numericTextFormatter());
                gridMatrix.add(textField, i, j);
            }
        }
    }

    @Override
    public void startOperation() {

    }

    @Override
    public void printResult() {

    }
}
