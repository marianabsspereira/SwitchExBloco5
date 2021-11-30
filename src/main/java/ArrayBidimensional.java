import java.util.Arrays;

public class ArrayBidimensional {
    //Ex 2 mas já recorrendo à classe ArrayInteiros
    private int[][] matrix;
    //a)
    public ArrayBidimensional(){
        this.matrix = new int[0][0];
    }
    //b)
    public ArrayBidimensional(int[][]matrixValues){
        this.matrix = matrixValues;
    }
    //c)
    public int[][] getMatrix() {
        return copyFrom(this.matrix);
    }
    public int[][] copyFrom(int[][] from){
        int[][] to = new int[this.matrix.length][];
        for (int i = 0; i < from.length; i++){
            to[i] = from[i];
        }
        return to;
    }
    public void addElementMatrix (int line, int value){
        ArrayInteiros vector = new ArrayInteiros(this.matrix[line]);
        vector.addElement(value);
        this.matrix[line] = vector.getArray();
    }
    //d)
    public void removeFirstElementWithGivenValue (int value){
        endloop:
        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                if (this.matrix[i][j] == value){
                    ArrayInteiros line = new ArrayInteiros(this.matrix[i]);
                    line.removeElement(value);
                    this.matrix[i] = line.getArray();
                    break endloop;
                }
            }
        }
    }
    //e) podia usar o emptyObject de ArrayInteiros mas teria + linhas de código
    public boolean isEmpty (){
        int count = 0;
        if (this.matrix.length == 0) return true;

        for (int i = 0; i < this.matrix.length; i++){
            if (this.matrix[i].length == 0) count++;
        }

        if (count == this.matrix.length) return true;

        return false;
    }
    //f)
    public int maximumValueOfMatrix(){
        int max = this.matrix[0][0];

        for (int i = 0; i < this.matrix.length; i++){
            ArrayInteiros line = new ArrayInteiros(this.matrix[i]);
            if (max < line.largerValue()){
                max = line.largerValue();
            }
        }
        return max;
    }
    //g)
    public int minorValueOfMatrix(){
        int min = this.matrix[0][0];

        for (int i = 0; i < this.matrix.length; i++){
            ArrayInteiros line = new ArrayInteiros(this.matrix[i]);
            if (min > line.minorValue()){
                min = line.minorValue();
            }
        }
        return min;
    }
    //h)
    public double avaregeOfMatrixValues(){
        double avg;
        double sumAvg = 0;
        int count = 0;

        for (int i = 0; i < this.matrix.length; i++){
            ArrayInteiros line = new ArrayInteiros(this.matrix[i]);
            sumAvg += line.average();
            count++;
        }
        avg = sumAvg / count;

        return avg;
    }
    //i)
    public int[] sumOfMatrixLines (){
        int [] vectorOut = new int[this.matrix.length];
        int sum = 0;

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                sum += this.matrix[i][j];
            }
            vectorOut[i] = sum;
            sum = 0;
        }
        return vectorOut;
    }
    //j)
    public int[] sumOfMatrixColumns (){
        int [] vectorOut = new int[this.maxLengthOfMatrixColumns()];

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < vectorOut.length; j++){
                if (j < this.matrix[i].length){
                    vectorOut[j]  += this.matrix[i][j];
                }
            }
        }
        return vectorOut;
    }

    public int maxLengthOfMatrixColumns (){
        int max = this.matrix[0].length;

        for (int i = 0; i < this.matrix.length; i++){
            if (this.matrix[i].length > max) max = this.matrix[i].length;
        }
        return max;
    }
    //k)
    public int indexMaxValueOfMatrix (){
        int [] vectorMaxLineValues = this.sumOfMatrixLines();
        int max = vectorMaxLineValues[0];
        int index = 0;

        for (int i = 0; i < vectorMaxLineValues.length; i++){
            if (vectorMaxLineValues[i] > max){
                max = vectorMaxLineValues[i];
                index = i;
            }
        }
        return index;
    }
    //l)
    public boolean isMatrixSquare (){
        int count = 0;

        for (int i = 0; i < this.matrix.length; i++){
            if (this.matrix[i].length == this.matrix.length) count++;
        }

        if (count == this.matrix.length) return true;

        return false;
    }
    //m)
    public boolean isMatrixSquareAndSymmetric(){
       int[][] transposeMatrix = this.transposeMatrix();
       ArrayBidimensional transposeMatrixObj = new ArrayBidimensional(transposeMatrix);

       if (this.equals(transposeMatrixObj) && this.isMatrixSquare()){
           return true;
       }
       return false;
    }
    //não estou a validar se o nº colunas é sempre o mesmo
    public int[][] transposeMatrix (){
        int [][] transposeMatrix = new int[this.matrix[0].length][this.matrix.length];

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                transposeMatrix[j][i] = this.matrix[i][j];
            }
        }

        return transposeMatrix;
    }
    //n)
    public int notNullElementsInMainDiagonal (){
        int count = 0;

        if (!this.isMatrixSquare()) return -1;

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix.length; j++){
                if (i == j && this.matrix[i][j] != 0){
                    count++;
                }
            }
        }

        return count;
    }
    //o)
    public boolean isMainDiagonalEqualToSecDiagonal (){
        if (!this.isMatrixSquare()) return false;

        int [] mainDiagonal = new int[this.matrix.length];
        int [] secDiagonal = new int[this.matrix.length];
        int k = this.matrix.length - 1;

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix.length; j++){
                if (i == j) mainDiagonal[i] = this.matrix[i][j];
            }
            secDiagonal[i] = this.matrix[i][k];
            k--;
        }
        return Arrays.equals(mainDiagonal,secDiagonal);
    }

    @Override //é suposto funcionar sem isto, serve para facilitar leitura
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBidimensional that = (ArrayBidimensional) o;
        if (this.matrix.length != that.matrix.length) return false;

        int countLines = 0;
        int countColumns = 0;

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                if (this.matrix[i].length != that.matrix[i].length) return false;
                if (this.matrix[i][j] == that.matrix[i][j]){
                    countColumns++;
                }
            }
            if (countColumns == this.matrix[i].length){
                countLines++;
            }
            countColumns = 0;
        }

        if (countLines == this.matrix.length) return true;
        return false; //return Arrays.equals(matrix, that.matrix); -> substitui cod da 37 - 55
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }
}
