package com.michel.matrixcalculator.model;

import java.util.Arrays;

public class Matrix {
    private final Double[][] matrix;
    private final int rows;
    private final int cols;
    public Matrix(Double[][] values) throws IllegalArgumentException{
        if (values == null || values.length == 0 || values[0].length == 0) {
            throw new IllegalArgumentException("Values cannot be null or empty");
        }
        this.rows = values.length;
        this.cols = values[0].length;
        this.matrix = new Double[rows][cols];
        //creates an immutable copy of the matrix
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.copyOf(values[i], cols);
        }
    }

    public Double getComponent(int targetRow, int targetColumn) throws IndexOutOfBoundsException{
        if (targetRow < 0 || targetRow >= rows || targetColumn < 0 || targetColumn >= cols) {
            throw new IndexOutOfBoundsException();
        }
        return matrix[targetRow][targetColumn];
    }

    public int getRows(){
        return rows;
    }
    public int getCols(){
        return cols;
    }
}
