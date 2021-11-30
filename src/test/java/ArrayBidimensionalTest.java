import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayBidimensionalTest {
    //a) - c)
    @Test
    void addElementMatrixTest1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,3},{1,2,3}});
        matrixTest.addElementMatrix(0,4);
        ArrayBidimensional matrixExpected = new ArrayBidimensional(new int[][]{{1,2,3,4},{1,2,3}});
        assertEquals(matrixExpected,matrixTest);
    }
    @Test
    void copyFromTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        int[][] result = x.copyFrom(new int[][]{{1,2},{2,4,5},{3,7}});
        int[][] expected = {{1,2},{2,4,5},{3,7}};
        assertArrayEquals(expected,result);
    }
    @Test
    void testEqualsTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        ArrayBidimensional y = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        assertEquals(x,y);
    }
    @Test
    void testEqualsTest2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        ArrayBidimensional y = x;
        assertEquals(x,y);
    }
    @Test
    void testEqualsTest3() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        ArrayBidimensional y = new ArrayBidimensional (new int[][]{{1,2},{2,7,5},{3,7}});
        boolean result = x.equals(y);
        assertFalse(result);
    }
    //d)
    @Test
    void removeFirstElementWithGivenValueTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        x.removeFirstElementWithGivenValue(2);
        ArrayBidimensional y = new ArrayBidimensional (new int[][]{{1},{2,4,5},{3,7}});
        assertEquals(x,y);
    }
    @Test
    void removeFirstElementWithGivenValueTest2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,2},{2,4,5},{3,7}});
        x.removeFirstElementWithGivenValue(2);
        ArrayBidimensional y = new ArrayBidimensional (new int[][]{{1,2},{2,4,5},{3,7}});
        assertEquals(x,y);
    }
    //e)
    @Test
    void isEmptyTrue1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{},{},{}});
        assertEquals(true,x.isEmpty());
    }
    @Test
    void isEmptyTrue2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{});
        assertEquals(true,x.isEmpty());
    }
    @Test
    void isEmptyFalse1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{},{1},{}});
        assertEquals(false,x.isEmpty());
    }
    //f)
    @Test
    void maximumValueOfMatrixTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,2},{2,4,5},{3,7}});
        assertEquals(7,x.maximumValueOfMatrix());
    }
    //g)
    @Test
    @DisplayName("minor value")
    void minorValueOfMatrixTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,2},{2,4,5},{3,7}});
        assertEquals(1,x.minorValueOfMatrix());
    }
    @Test
    @DisplayName("minor value 2")
    void minorValueOfMatrixTest2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{5,2,2},{2,4,5},{3,7}});
        assertEquals(2,x.minorValueOfMatrix());
    }
    //h)
    @Test
    void avaregeOfMatrixValuesTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{2,2,2},{2,2,2}});
        assertEquals(2,x.avaregeOfMatrixValues());
    }
    //i)
    @Test
    void sumOfMatrixLinesTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,3},{1,1,1}});
        int [] expected = {6,3};
        assertArrayEquals(expected,x.sumOfMatrixLines());
    }
    //j)
    @Test
    void sumOfMatrixColumnsTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,3},{1,1}});
        int [] expected = {2,3,3};
        assertArrayEquals(expected,x.sumOfMatrixColumns());
    }
    //k)
    @Test
    void indexMaxValueOfMatrixTest1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,3},{1,1}});
        int expected = 0;
        assertEquals(expected,x.indexMaxValueOfMatrix());
    }
    @Test
    void indexMaxValueOfMatrixTest2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,3},{1,7}});
        int expected = 1;
        assertEquals(expected,x.indexMaxValueOfMatrix());
    }
    //l)
    @Test
    void isMatrixSquareTrue1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{1,7}});
        assertEquals(true,x.isMatrixSquare());
    }
    @Test
    void isMatrixSquareFalse1() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2,5},{1,7,6}});
        assertEquals(false,x.isMatrixSquare());
    }
    @Test
    void isMatrixSquareFalse2() {
        ArrayBidimensional x = new ArrayBidimensional (new int[][]{{1,2},{1,7,6}});
        assertEquals(false,x.isMatrixSquare());
    }
    //m)
    @Test
    void transposeMatrixTest1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,3},{1,2,3}});
        ArrayBidimensional matrixResult = new ArrayBidimensional(matrixTest.transposeMatrix());
        ArrayBidimensional matrixExpected = new ArrayBidimensional(new int[][]{{1,1},{2,2},{3,3}});
        assertEquals(matrixExpected,matrixResult);
    }
    @Test
    void transposeMatrixTest2() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,1},{2,2},{3,3}});
        ArrayBidimensional matrixResult = new ArrayBidimensional(matrixTest.transposeMatrix());
        ArrayBidimensional matrixExpected = new ArrayBidimensional(new int[][]{{1,2,3},{1,2,3}});
        assertEquals(matrixExpected,matrixResult);
    }
    @Test
    void isMatrixSquareAndSymmetricTrue1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,5,9},{5,3,8},{9,8,7}});
        boolean result = matrixTest.isMatrixSquareAndSymmetric();
        assertEquals(true,result);
    }
    @Test
    void isMatrixSquareAndSymmetricFalse1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,5,9},{5,3,7},{9,8,7}});
        boolean result = matrixTest.isMatrixSquareAndSymmetric();
        assertEquals(false,result);
    }
    @Test
    void isMatrixSquareAndSymmetricFalse2() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,5},{5,3},{9,8}});
        boolean result = matrixTest.isMatrixSquareAndSymmetric();
        assertEquals(false,result);
    }
    //n)
    @Test
    void notNullElementsInMainDiagonalTest1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,5},{5,3},{9,8}});
        int expected = -1;
        int result = matrixTest.notNullElementsInMainDiagonal();
        assertEquals(expected,result);
    }
    @Test
    void notNullElementsInMainDiagonalTest2() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,3},{1,2,3},{1,2,3}});
        int expected = 3;
        int result = matrixTest.notNullElementsInMainDiagonal();
        assertEquals(expected,result);
    }
    @Test
    void notNullElementsInMainDiagonalTest3() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,3},{1,0,3},{1,2,3}});
        int expected = 2;
        int result = matrixTest.notNullElementsInMainDiagonal();
        assertEquals(expected,result);
    }
    //o)
    @Test
    void isMainDiagonalEqualToSecDiagonalTrue1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,1},{4,5,6},{3,4,3}});
        boolean result = matrixTest.isMainDiagonalEqualToSecDiagonal();
        assertEquals(true,result);
    }
    @Test
    void isMainDiagonalEqualToSecDiagonalFalse1() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2,1},{4,5,6},{3,4,1}});
        boolean result = matrixTest.isMainDiagonalEqualToSecDiagonal();
        assertEquals(false,result);
    }
    @Test
    void isMainDiagonalEqualToSecDiagonalFalse2() {
        ArrayBidimensional matrixTest = new ArrayBidimensional(new int[][]{{1,2},{4,5},{3,4}});
        boolean result = matrixTest.isMainDiagonalEqualToSecDiagonal();
        assertEquals(false,result);
    }
}