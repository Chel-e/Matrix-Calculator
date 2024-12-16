module com.michel.matrixcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.michel.matrixcalculator to javafx.fxml;
    exports com.michel.matrixcalculator;
}