import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBidimensional2Test {
    //p)
    @Test
    void numberOfDigitsAboveAverageTest1() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{0,2});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{30});
        ArrayBidimensional2 matrixTest = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2});
        ArrayInteiros vectorExpected = new ArrayInteiros(new int[]{30});
        assertEquals(vectorExpected,matrixTest.numberOfDigitsAboveAverage());
    }
    @Test
    void testEqualsTest1() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{0,2});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{30});
        ArrayInteiros array3 = new ArrayInteiros(new int[]{30});
        ArrayBidimensional2 matrix1 = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2});
        ArrayBidimensional2 matrix2 = new ArrayBidimensional2(new ArrayInteiros[]{array1, array3});
        assertEquals(matrix1,matrix2);
    }
    @Test
    void testEqualsTest2Ai() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{0,2});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{0,2});
        assertEquals(array1,array2);
    }
    //q)
    @Test
    void numberOfEvenDigitsAboveAverageTest1() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{0,222});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{31});
        ArrayBidimensional2 matrixTest = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2});
        ArrayInteiros vectorExpected = new ArrayInteiros(new int[]{0,222});
        assertEquals(vectorExpected,matrixTest.numberOfEvenDigitsAboveAverage());
    }
    //r)
    @Test
    void reversesOrderOfLineValuesInMatrixTest1() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{1,2,3});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{1,2,3,4});
        ArrayBidimensional2 matrixTest = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2});
        ArrayBidimensional2 result = matrixTest.reversesOrderOfLineValuesInMatrix();
        ArrayInteiros array3 = new ArrayInteiros(new int[]{3,2,1});
        ArrayInteiros array4 = new ArrayInteiros(new int[]{4,3,2,1});
        ArrayBidimensional2 expected = new ArrayBidimensional2(new ArrayInteiros[]{array3, array4});
        assertEquals(expected,result);
    }
    //s)
    @Test
    void reversesOrderOfColumnValuesInMatrixTest1() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{1,2,3});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{4,5});
        ArrayInteiros array3 = new ArrayInteiros(new int[]{6,7,8});
        ArrayBidimensional2 matrixTest = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2,array3});
        ArrayBidimensional2 result = matrixTest.reversesOrderOfColumnValuesInMatrix();
        ArrayInteiros array4 = new ArrayInteiros(new int[]{6,7,8});
        ArrayInteiros array5 = new ArrayInteiros(new int[]{4,5});
        ArrayInteiros array6 = new ArrayInteiros(new int[]{1,2,3});
        ArrayBidimensional2 expected = new ArrayBidimensional2(new ArrayInteiros[]{array4, array5, array6});
        assertEquals(expected,result);
    }
    @Test
    void reversesOrderOfColumnValuesInMatrixTest2() {
        ArrayInteiros array1 = new ArrayInteiros(new int[]{1,2,3});
        ArrayInteiros array2 = new ArrayInteiros(new int[]{4,5});
        ArrayBidimensional2 matrixTest = new ArrayBidimensional2(new ArrayInteiros[]{array1, array2});
        ArrayBidimensional2 result = matrixTest.reversesOrderOfColumnValuesInMatrix();
        ArrayInteiros array3 = new ArrayInteiros(new int[]{4,5});
        ArrayInteiros array4 = new ArrayInteiros(new int[]{1,2,3});
        ArrayBidimensional2 expected = new ArrayBidimensional2(new ArrayInteiros[]{array3,array4});
        assertEquals(expected,result);
    }
}