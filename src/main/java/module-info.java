module com.michel.matrixcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.michel.matrixcalculator to javafx.fxml;
    exports com.michel.matrixcalculator;
    exports com.michel.matrixcalculator.controller;
    opens com.michel.matrixcalculator.controller to javafx.fxml;
}