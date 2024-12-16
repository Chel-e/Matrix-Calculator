package com.michel.matrixcalculator.model;

public class Matrix {
    private final Double[][] matix;
    private int rows;
    private int cols;
    public Matrix(int rows, int cols) {
        this.matix = new Double[rows][cols];
    }

    public void setComponent(Double value, int targetRow, int targetColumn) {
        this.matix[targetRow][targetColumn] = value;
    }
    public Double getComponent(int targetRow, int targetColumn) {
        return matix[targetRow][targetColumn];
    }
}
