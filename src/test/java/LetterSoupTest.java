import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterSoupTest {

    @Test
    void validatesWordPositionTrueDiagonal1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,0},new int[]{2,2});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueDiagonal2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{1,0},new int[]{2,1});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueDiagonal3() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{1,4},new int[]{3,2});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueHorizontal1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,1},new int[]{0,4});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueHorizontal2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{3,3},new int[]{3,1});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueVertical1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,1},new int[]{3,1});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionTrueVertical2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{3,2},new int[]{1,2});
        assertTrue(result);
    }
    @Test
    void validatesWordPositionFalseNotValidDirection1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,0},new int[]{2,1});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseNotValidDirection2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{3,1},new int[]{2,3});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseNotValidDirection3() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{1,1},new int[]{0,3});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseSamePosition1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{1,1},new int[]{1,1});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseInputSizeWrong1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);;
        boolean result = letterSoup.validatesWordPosition(new int[]{1,1,1},new int[]{1,3});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseInputSizeWrong2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{1,1},new int[]{1,3,2});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseOutOfBoard1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,5},new int[]{0,4});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseOutOfBoard2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,4},new int[]{0,5});
        assertFalse(result);
    }
    @Test
    void validatesWordPositionFalseOutOfBoard3() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.validatesWordPosition(new int[]{0,4},new int[]{0,-3});
        assertFalse(result);
    }

    @Test
    void findsWordOrientationInvalidPosition1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        char result = letterSoup.findsWordOrientation(new int[]{3,1},new int[]{1,2});
        char expected = 'N';
        assertEquals(expected,result);
    }
    @Test
    void findsWordOrientationHorizontal1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        char result = letterSoup.findsWordOrientation(new int[]{1,1},new int[]{1,3});
        char expected = 'H';
        assertEquals(expected,result);
    }
    @Test
    void findsWordOrientationVertical1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        char result = letterSoup.findsWordOrientation(new int[]{0,2},new int[]{2,2});
        char expected = 'V';
        assertEquals(expected,result);
    }
    @Test
    void findsWordOrientationDiagonal1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        char result = letterSoup.findsWordOrientation(new int[]{1,4},new int[]{3,2});
        char expected = 'D';
        assertEquals(expected,result);
    }

    @Test
    void findsWordDirectionHED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{1,0},new int[]{1,3});
        String expected = "HED";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionHDE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{1,3},new int[]{1,0});
        String expected = "HDE";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionVCB1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{0,0},new int[]{3,0});
        String expected = "VCB";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionVBC1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{4,1},new int[]{1,1});
        String expected = "VBC";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionDDED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{1,1},new int[]{3,3});
        String expected = "DDED";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionDADE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{3,4},new int[]{1,2});
        String expected = "DADE";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionDDDE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{0,4},new int[]{2,2});
        String expected = "DDDE";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionDAED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{4,1},new int[]{2,3});
        String expected = "DAED";
        assertEquals(expected,result);
    }
    @Test
    void findsWordDirectionInvalidPosition1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.findsWordDirection(new int[]{2,1},new int[]{1,3});
        String expected = "N";
        assertEquals(expected,result);
    }

    @Test
    void extractsWordHED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{0,0},new int[]{0,2});
        String expected = "AMA";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordHDE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{1,2},new int[]{1,0});
        String expected = "COR";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordVCB1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{0,0},new int[]{1,0});
        String expected = "AR";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordVBC1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{4,0},new int[]{3,0});
        String expected = "PO";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordDDED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{1,2},new int[]{3,4});
        String expected = "CAO";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordDADE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{4,3},new int[]{2,1});
        String expected = "OLA";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordDDDE1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{0,4},new int[]{3,1});
        String expected = "PAPA";
        assertEquals(expected,result);
    }
    @Test
    void extractsWordDAED1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String result = letterSoup.extractsWord(new int[]{2,2},new int[]{1,3});
        String expected = "PA";
        assertEquals(expected,result);
    }

    @Test
    void isValidMatrixTrue1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        boolean result = letterSoup.isValidMatrix(soupMatrix);
        assertTrue(result);
    }
    @Test
    void isValidMatrixFalseNotSquareMatrix() {
        char [][] soupMatrix = {{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        });
        Assertions.assertEquals("Matrix not valid", thrown.getMessage());
    }
    @Test
    void isValidMatrixFalseNotSameNrOfColumns() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        });
        Assertions.assertEquals("Matrix not valid", thrown.getMessage());
    }
    @Test
    void isValidMatrixFalseWrongSize() {
        char [][] soupMatrix = {{'A'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        });
        Assertions.assertEquals("Matrix not valid", thrown.getMessage());
    }

    @Test
    void verifiesIfWordExistsInSolutionTrue1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String word = "AmA";
        boolean result = letterSoup.verifiesIfWordExistsInSolution(word);
        assertTrue(result);
    }
    @Test
    void verifiesIfWordExistsInSolutionFalse1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String word = "AMAx";
        boolean result = letterSoup.verifiesIfWordExistsInSolution(word);
        assertFalse(result);
    }

    @Test
    void verifiesIfWordWasAlreadyFoundTrue1AndAppendWordInFoundWordsTest1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String word = "AmA";
        letterSoup.appendWordInFoundWords(word);
        boolean result = letterSoup.verifiesIfWordWasAlreadyFound(word);
        assertTrue(result);
    }
    @Test
    void verifiesIfWordWasAlreadyFoundFalse1AndAppendWordInFoundWordsTest2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        String word = "cAO";
        boolean result = letterSoup.verifiesIfWordWasAlreadyFound(word);
        assertFalse(result);
    }

    @Test
    void terminatesMatchTest1() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        letterSoup.appendWordInFoundWords("roca");
        letterSoup.appendWordInFoundWords("ama");
        letterSoup.appendWordInFoundWords("ar");
        letterSoup.appendWordInFoundWords("cor");
        letterSoup.appendWordInFoundWords("cao");
        letterSoup.appendWordInFoundWords("po");
        letterSoup.appendWordInFoundWords("papa");
        letterSoup.appendWordInFoundWords("pa");
        letterSoup.appendWordInFoundWords("ola");
        boolean result = letterSoup.terminatesMatch();
        assertTrue(result);
    }
    @Test
    void terminatesMatchTest2() {
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},{'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);
        letterSoup.appendWordInFoundWords("roca");
        letterSoup.appendWordInFoundWords("ama");
        letterSoup.appendWordInFoundWords("ar");
        letterSoup.appendWordInFoundWords("cor");
        letterSoup.appendWordInFoundWords("cao");
        letterSoup.appendWordInFoundWords("po");
        letterSoup.appendWordInFoundWords("papa");
        letterSoup.appendWordInFoundWords("pa");
        boolean result = letterSoup.terminatesMatch();
        assertFalse(result);
    }
}