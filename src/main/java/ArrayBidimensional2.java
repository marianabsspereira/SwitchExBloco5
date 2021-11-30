import java.util.Arrays;

public class ArrayBidimensional2 {
    //Ex 3 do p) até ao fim
    private ArrayInteiros[] matrix; // ArrayInteiros já tem 1 dimensão (int tipo primitivo n tem)
    //a)
    public ArrayBidimensional2() {
        this.matrix = new ArrayInteiros[0];
    }
    //b)
    public ArrayBidimensional2(ArrayInteiros[] matrix) {
        this.matrix = matrix;
    }
    //p)
    public ArrayInteiros numberOfDigitsAboveAverage(){
        int pos = 0;
        int lengthMax = this.AbMaxLengthOfMatrixColumns() * this.matrix.length;
        int[] vector = new int[lengthMax];

        for (int i = 0; i < this.matrix.length; i++){
           for (int j = 0; j < this.AbMaxLengthOfMatrixColumns(); j++){
               if (j < this.matrix[i].lengthArray()){
                   vector[pos] = this.matrix[i].getArray()[j];
                   pos++;
               }
           }
        }

        ArrayInteiros vectorAux = new ArrayInteiros(vector);
        return new ArrayInteiros(vectorAux.valuesAboveAverage());
    }
    //parte do j) - utilizado em p)
    public int AbMaxLengthOfMatrixColumns (){
        int max = this.matrix[0].lengthArray();

        for (int i = 0; i < this.matrix.length; i++){
            if (this.matrix[i].lengthArray() > max) max = this.matrix[i].lengthArray();
        }
        return max;
    }
    //q)
    public ArrayInteiros numberOfEvenDigitsAboveAverage(){
        int pos = 0;
        int lengthMax = this.AbMaxLengthOfMatrixColumns() * this.matrix.length;
        int[] vector = new int[lengthMax];

        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.AbMaxLengthOfMatrixColumns(); j++){
                if (j < this.matrix[i].lengthArray()){
                    vector[pos] = this.matrix[i].getArray()[j];
                    pos++;
                }
            }
        }

        ArrayInteiros vectorAux = new ArrayInteiros(vector);
        ArrayInteiros vectorOut = new ArrayInteiros(vectorAux.cutVector(pos,vector));
        return new ArrayInteiros(vectorOut.nbOfEvenDigitsAboveAvg());
    }
    //r)
    public ArrayBidimensional2 reversesOrderOfLineValuesInMatrix (){
        for (int i = 0; i < this.matrix.length; i++){
            this.matrix[i] = this.matrix[i].reversesOrderOfvalues();
        }
        return new ArrayBidimensional2(this.matrix);
    }
    //s)
    public ArrayBidimensional2 reversesOrderOfColumnValuesInMatrix (){
        ArrayInteiros aux;
        int k = this.matrix.length - 1;
        for (int i = 0; i < this.matrix.length / 2; i++){
            aux = this.matrix[i];
            this.matrix[i] = this.matrix[k];
            this.matrix[k] = aux;
            k--;
        }
        return new ArrayBidimensional2(this.matrix);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBidimensional2 that = (ArrayBidimensional2) o;
        return Arrays.equals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }
}
