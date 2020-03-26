package com.onyx.signal;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtils {

    @Test
    public void linspaceSingleTest() {
        double[] result1 = {2.0, 2.25, 2.50, 2.75, 3.0};
        double[] out1 = UtilMethods.linspace(2, 3, 5, true);
        assertArrayEquals(result1, out1, 0.001);

        double[] result2 = {2.0, 2.2, 2.4, 2.6, 2.8};
        double[] out2 = UtilMethods.linspace(2, 3, 5, false);
        assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void linspaceRepeatTest() {
        double[] result = {2.0, 2.25, 2.50, 2.75, 3.0, 2.0, 2.25, 2.50, 2.75, 3.0};
        double[] out = UtilMethods.linspace(2, 3, 5, 2);
        assertArrayEquals(result, out, 0.001);
    }

    @Test
    public void arangeDoubleTest() {
        double[] result1 = {3.0, 5.0, 7.0};
        double[] out1 = UtilMethods.arange(3.0, 9.0, 2.0);
        assertArrayEquals(result1, out1, 0.001);

        double[] result2 = {3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5};
        double[] out2 = UtilMethods.arange(3.0, 9.0, 0.5);
        assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void arangeIntTest() {
        int[] result = {3, 5, 7};
        int[] out = UtilMethods.arange(3, 9, 2);
        assertArrayEquals(result, out);
    }

    @Test
    public void reverseDoubleTest() {
        double[] signal = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = {6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        double[] out = UtilMethods.reverse(signal);
        assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void reverseIntTest() {
        int[] signal = {1, 2, 3, 4, 5, 6};
        int[] result = {6, 5, 4, 3, 2, 1};
        int[] out = UtilMethods.reverse(signal);
        assertArrayEquals(result, out);
    }

    @Test
    public void concatenateDoubleTest() {
        double[] arr1 = {1.0, 2.0};
        double[] arr2 = {3.0, 4.0, 5.0, 6.0};
        double[] result = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] out = UtilMethods.concatenateArray(arr1, arr2);
        assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void concatenateIntTest() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4, 5, 6};
        int[] result = {1, 2, 3, 4, 5, 6};
        int[] out = UtilMethods.concatenateArray(arr1, arr2);
        assertArrayEquals(result, out);
    }

    @Test
    public void splitByIndexDoubleTest() {
        double[] signal = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = {3.0, 4.0};
        double[] out = UtilMethods.splitByIndex(signal, 2, 4);
        assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void splitByIndexIntTest() {
        int[] signal = {1, 2, 3, 4, 5, 6};
        int[] result = {3, 4};
        int[] out = UtilMethods.splitByIndex(signal, 2, 4);
        assertArrayEquals(result, out);
    }

    @Test
    public void pseudoInverseTest() {
        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] result = {{-0.639, -0.167, 0.306}, {-0.056, 0.000, 0.056}, {0.528, 0.167, -0.194}};
        double[][] out = UtilMethods.pseudoInverse(matrix);
        assertArrayEquals(result[0], out[0], 0.001);
        assertArrayEquals(result[1], out[1], 0.001);
        assertArrayEquals(result[1], out[1], 0.001);
    }
}