package com.michel.matrixcalculator.model;

public class MatrixCalculator {
    private final  Matrix matrix1;
    private final Matrix matrix2;

    public MatrixCalculator(Matrix matrix1, Matrix matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public Double[][] sum() {
        Double[][] result = new Double[matrix1.getRows()][matrix1.getCols()];
        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix1.getCols(); j++) {
                result[i][j] = matrix1.getComponent(i, j) + matrix2.getComponent(i, j);
            }
        }
        return result;
    }

    public Double[][] sub() {
        Double[][] result = new Double[matrix1.getRows()][matrix1.getCols()];
        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix1.getCols(); j++) {
                result[i][j] = matrix1.getComponent(i, j) - matrix2.getComponent(i, j);
            }
        }
        return result;
    }

}
