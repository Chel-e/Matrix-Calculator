package com.michel.matrixcalculator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixCalculatorTest {

    Matrix matrix1;
    Matrix matrix2;
    private MatrixCalculator matrixCalculator;

    @BeforeEach
    void setUp() {
        Double[][] mat = { { 1D,2D },
                { 3D, 4D}};
        matrix1 = new Matrix(mat);

        Double[][] mat1 = { { 1D,2D },
                { 3D, 4D}};
        matrix2 = new Matrix(mat1);
        matrixCalculator = new MatrixCalculator(matrix1, matrix2);
    }


    @DisplayName(" verify if a sum is correct ")
    @Test
    void testSum() {
        Double[][] result = matrixCalculator.sum();
        Double[][] compare ={{ 2D, 4D }, {9D, 8D}};
        assertArrayEquals(compare[0], result[0]);
        assertArrayEquals(compare[1], result[1]);
    }

    @Test
    void sub() {
        Double[][] result = matrixCalculator.sub();
        Double[][] compare ={{ 0D, 0D }, {0D, 0D}};
        assertArrayEquals(compare[0], result[0]);
        assertArrayEquals(compare[1], result[1]);
    }
}