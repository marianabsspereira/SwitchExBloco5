import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInteirosTest {
    //c)
    @Test
    void addElementTest1() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,2,3,4};
        x.addElement(4);
        int [] result = x.getArray();
        assertArrayEquals(expected,result);
    }
    //d)
    @Test
    void removeElementTest1() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {2,3};
        x.removeElement(1);
        int [] result = x.getArray();
        assertArrayEquals(expected,result);
    }
    //e)
    @Test
    void valueIndexTest1() {
        int expected = 1;
        int [] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.valueIndex(0);
        assertEquals(expected,result);
    }
    //f)
    @Test
    void lengthArrayTest1() {
        int expected = 3;
        int [] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.lengthArray();
        assertEquals(expected,result);
    }
    //g)
    @Test
    void largerValueTest1() {
        int expected = 3;
        int [] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.largerValue();
        assertEquals(expected,result);
    }
    //h)
    @Test
    void minorValueTest1() {
        int expected = 1;
        int [] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.minorValue();
        assertEquals(expected,result);
    }
    //i)
    @Test
    void averageTest1() {
        int expected = 2;
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.average();
        assertEquals(expected,result);
    }
    //j)
    @Test
    void averageEvenTest1() {
        int expected = 2;
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.averageEven();
        assertEquals(expected,result);
    }
    //k)
    @Test
    void averageOddTest1() {
        int expected = 2;
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int result = x.averageOdd();
        assertEquals(expected,result);
    }
    //l)
    @Test
    void averageMultiplesTest1() {
        double expected = 4.5;
        int[] test = {1,3,6,7};
        ArrayInteiros x = new ArrayInteiros(test);
        double result = x.averageMultiples(3);
        assertEquals(expected,result,0.1);
    }
    //m)
    @Test
    void sortArrayTest1() {
        int[] test = {2,1,1,3};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,1,2,3};
        x.sortArray('A');
        int [] result = x.getArray();
        assertArrayEquals(expected,result);
    }
    //n)
    @Test
    void emptyObjectTrue() {
        int[] test = {};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.emptyObject();
        assertEquals(true,result);
    }
    @Test
    void emptyObjectFalse() {
        int[] test = {1};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.emptyObject();
        assertEquals(false,result);
    }
    //o)
    @Test
    void oneElementObjectTrue() {
        int[] test = {1};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.oneElementObject();
        assertEquals(true,result);
    }
    @Test
    void oneElementObjectFalse1() {
        int[] test = {1,2};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.oneElementObject();
        assertEquals(false,result);
    }
    @Test
    void oneElementObjectFalse2() {
        int[] test = {};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.oneElementObject();
        assertEquals(false,result);
    }
    //p)
    @Test
    void evenElementsObjectTrue() {
        int[] test = {2,4,6};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.evenElementsObject();
        assertEquals(true,result);
    }
    @Test
    void evenElementsObjectFalse() {
        int[] test = {2,4,1};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.evenElementsObject();
        assertEquals(false,result);
    }
    //q)
    @Test
    void oddElementsObjectTrue() {
        int[] test = {1,3,5};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.oddElementsObject();
        assertEquals(true,result);
    }
    @Test
    void oddElementsObjectFalse() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.oddElementsObject();
        assertEquals(false,result);
    }
    //r)
    @Test
    void duplicatedElementsTrue1() {
        int[] test = {1,2,1};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.duplicatedElements();
        assertEquals(true,result);
    }
    @Test
    void duplicatedElementsTrue2() {
        int[] test = {2,2,1};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.duplicatedElements();
        assertEquals(true,result);
    }
    @Test
    void duplicatedElementsFalse() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.duplicatedElements();
        assertEquals(false,result);
    }
    //s)
    @Test
    void countDigitsTest1() {
        int[] test = {10,2,30};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {2,1,2};
        int [] result = x.countDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void countDigitsTest2() {
        int[] test = {0,2,30};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,1,2};
        int [] result = x.countDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void valuesAboveAverageTest1() {
        int[] test = {0,2,30};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {30};
        int [] result = x.valuesAboveAverage();
        assertArrayEquals(expected,result);
    }
    //t)
    @Test
    void countEvenDigitsTest1() {
        int[] test = {0,2,32};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,1,1};
        int [] result = x.countEvenDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void countEvenDigitsTest2() {
        int[] test = {0,222,31};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,3,0};
        int [] result = x.countEvenDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void nbOfEvenDigitsAboveAvgTest1() {
        int[] test = {0,222,31};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {0,222};
        int [] result = x.nbOfEvenDigitsAboveAvg();
        assertArrayEquals(expected,result);
    }
    //u)
    @Test
    void evenValuesTest1() {
        int[] test = {0,222,32,1};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {0,222};
        int [] result = x.evenValues();
        assertArrayEquals(expected,result);
    }
    //v)
    @Test
    void cutVectorTest1() {
        int[] test = {0,222,32,1};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {0,222};
        int [] result = x.cutVector(2,test);
        assertArrayEquals(expected,result);
    }
    @Test
    void ascSeqTest1() {
        int[] test = {0,347,12,31};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {347,12};
        int [] result = x.ascSeq();
        assertArrayEquals(expected,result);
    }
    @Test
    void ascSeqTest2() {
        int[] test = {0,347,12,1};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {347,12};
        int [] result = x.ascSeq();
        assertArrayEquals(expected,result);
    }
    @Test
    void ascSeqTest3() {
        int[] test = {7,341,6891,123};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {123};
        int [] result = x.ascSeq();
        assertArrayEquals(expected,result);
    }
    @Test
    void ascSeqTest4() {
        int[] test = {7,341,6891,1};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {};
        int [] result = x.ascSeq();
        assertArrayEquals(expected,result);
    }
    //w)
    @Test
    void capicuaTest1() {
        int[] test = {7,121,6891,1};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {7,121,1};
        int [] result = x.capicua();
        assertArrayEquals(expected,result);
    }
    @Test
    void capicuaTest2() {
        int[] test = {7,121,6891,1331};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {7,121,1331};
        int [] result = x.capicua();
        assertArrayEquals(expected,result);
    }
    @Test
    void capicuaTest3() {
        int[] test = {123,45};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {};
        int [] result = x.capicua();
        assertArrayEquals(expected,result);
    }
    //x)
    @Test
    void equalDigitsTest1() {
        int[] test = {123,45,22,444};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {22,444};
        int [] result = x.equalDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void equalDigitsTest2() {
        int[] test = {1,45,22,444};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,22,444};
        int [] result = x.equalDigits();
        assertArrayEquals(expected,result);
    }
    @Test
    void equalDigitsTest3() {
        int[] test = {1,45,22,444,556,66566};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,22,444};
        int [] result = x.equalDigits();
        assertArrayEquals(expected,result);
    }
    //y)
    @Test
    void amstrongDigitsTest1() {
        int[] test = {1,45,22,153};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {1,153};
        int [] result = x.amstrongDigits();
        assertArrayEquals(expected,result);
    }
    //z)
    @Test
    void ascSeqNTest1() {
        int[] test = {654,123,1234,4561,45};
        ArrayInteiros x = new ArrayInteiros(test);
        int[] expected = {123,1234};
        int [] result = x.ascSeqN(3);
        assertArrayEquals(expected,result);
    }
    //aa)
    @Test
    void equalVectorTest1() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.equalVector(new int[]{1, 2, 3});
        assertEquals(true,result);
    }
    @Test
    void equalVectorTest2() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.equalVector(new int[]{1, 2, 3, 4});
        assertEquals(false,result);
    }
    @Test
    void equalVectorTest3() {
        int[] test = {1,2,3};
        ArrayInteiros x = new ArrayInteiros(test);
        boolean result = x.equalVector(new int[]{1, 2, 4});
        assertEquals(false,result);
    }
    //metodo extra para ex 3
    @Test
    void reversesOrderOfvaluesTest1() {
        ArrayInteiros test = new ArrayInteiros(new int[]{1, 2, 3});
        ArrayInteiros result = test.reversesOrderOfvalues();
        ArrayInteiros expected = new ArrayInteiros(new int[]{3,2,1});
        assertEquals(expected,result);
    }
    @Test
    void reversesOrderOfvaluesTest2() {
        ArrayInteiros test = new ArrayInteiros(new int[]{1,2,3,4});
        ArrayInteiros result = test.reversesOrderOfvalues();
        ArrayInteiros expected = new ArrayInteiros(new int[]{4,3,2,1});
        assertEquals(expected,result);
    }
    @Test
    void reversesOrderOfvaluesTest3() {
        ArrayInteiros test = new ArrayInteiros(new int[]{1,2,3,4,5,6,7});
        ArrayInteiros result = test.reversesOrderOfvalues();
        ArrayInteiros expected = new ArrayInteiros(new int[]{7,6,5,4,3,2,1});
        assertEquals(expected,result);
    }
}