package com.michel.matrixcalculator.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
        Double[][] mat = { { 1D,2D },
            { 3D, 4D}};
        matrix = new Matrix(mat);
    }

    @DisplayName("Test if a component is equal original ")
    @Test
    void testGetComponent() {
        assertEquals(1D, matrix.getComponent(0,0));
        assertEquals(2D, matrix.getComponent(0,1));
        assertEquals(3D, matrix.getComponent(1,0));
        assertEquals(4D, matrix.getComponent(1,1));
    }
}