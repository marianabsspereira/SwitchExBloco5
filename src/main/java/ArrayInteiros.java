import java.util.Arrays;

public class ArrayInteiros {
    //Ex 1
    private int[] array;
    //a)
    public ArrayInteiros(){
        this.array = new int[0];
    }
    //b)
    public ArrayInteiros(int[] vector){
        this.array = vector;
    }

    //c) - copyFrom apenas pq assim não se mexe no original
    public int[] getArray() {
        return copyFrom(this.array);
    }

    private int[] copyFrom (int[] from){
        int[] to = new int[from.length];
        for (int i = 0; i < from.length; i++){
            to [i] = from[i];
        }
        return to;
    }
    public void addElement (int value){
        int[] newVector = new int[this.array.length + 1];

        for (int i = 0; i < this.array.length; i++){
            newVector[i] = this.array[i];
        }

        newVector[this.array.length] = value;

        this.array = newVector;
    }
    //d)
    public void removeElement (int valueToRemove){
        int pos = 0;
        int count = 0;
        int posElement = -1;

        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] == valueToRemove){
                count++;
                if (this.array[i] == valueToRemove && posElement == -1){
                    posElement = i;
                }
            }
        }

        int[] newVector;

        if (count == 0){
            newVector = new int[this.array.length];

            for (int i = 0; i < this.array.length; i++){
                newVector [pos] = this.array[i];
                pos++;
            }
        }
        else {
            newVector = new int[this.array.length - 1];
            for (int i = 0; i < this.array.length; i++){
                if (i != posElement){
                    newVector [pos] = this.array[i];
                    pos++;
                }
            }
        }
        this.array = newVector;
    }
    //e)
    public int valueIndex (int index){
        if (index >= this.array.length || index < 0){
            return this.array[0]; //para não estar a lançar excepções
        }
        return this.array[index];
    }
    //f)
    public int lengthArray (){
        return this.array.length;
    }
    //g)
    public int largerValue (){
        int max = this.array[0];

        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] > max){
                max = this.array[i];
            }
        }
        return max;
    }
    //h)
    public int minorValue(){
        int min = this.array[0];
        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] < min){
                min = this.array[i];
            }
        }
        return min;
    }
    //i)
    public int average (){
        int sum = 0;
        int avg;

        for (int i = 0; i < this.array.length; i++){
           sum += this.array[i];
        }
        if (this.array.length == 0){
            return 0;
        }

        avg = sum / this.array.length;

        return avg;
    }
    //j)
    private int isEven(int x) {
        int mask = 0x1; //ver o que é isto
        return (x & mask);
    }
    public int averageEven (){
        int sum = 0;
        int count = 0;
        int avgEven;

        for (int i = 0; i < this.array.length; i++){
            if (isEven(this.array[i]) == 0){
                sum += this.array[i];
                count++;
            }
        }
        if (count == 0){
            return 0;
        }

        avgEven = sum / count;

        return avgEven;
    }
    //k)
    public int averageOdd (){
        int sum = 0;
        int count = 0;
        int avgOdd;

        for (int i = 0; i < this.array.length; i++){
            if (isEven(this.array[i]) == 1){
                sum += this.array[i];
                count++;
            }
        }
        if (count == 0){
            return 0;
        }

        avgOdd = sum / count;

        return avgOdd;
    }
    //l)
    public double averageMultiples (int N){
        int sum = 0;
        int count = 0;
        double avgMult;

        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] % N == 0){
                sum += this.array[i];
                count++;
            }
        }
        if (count == 0){
            return 0;
        }

        avgMult = (double) sum / count;

        return  avgMult;
    }
    //m)
    public void sortArray (char type){
        int[] newVector = new int[this.array.length];
        int min = this.array[0];
        int pos = 0;
        int[] aux = new int[this.array.length];

        for (int i = 0; i < this.array.length; i++){
            aux[i] = -1;
        }

        if (type == 'A'){
            for (int i = 0; i < this.array.length; i++){
                for (int j = 0; j < this.array.length; j++){
                    if (this.array[j] <= min && !searchValue(aux,j)){
                        min = this.array[j];
                        aux[i] = j;
                    }
                }
                newVector[pos] = min;
                pos++;
            }
        }
        if (type == 'D'){

        }
        this.array = newVector;
    }
    private boolean searchValue(int[] aux, int j) {
        for (int i = 0; i < aux.length; i++){
            if (aux[i] == j){
                return true;
            }
        }
        return false;
    }
    //n)
    public boolean emptyObject (){
        if (this.array.length == 0){
            return true;
        }
        return false;
    }
    //o)
    public boolean oneElementObject (){
        if (this.array.length == 1){
            return true;
        }
        return false;
    }
    //p)
    public boolean evenElementsObject (){
        int count = 0;
        for (int i = 0; i < this.array.length; i++){
            if (isEven(this.array[i]) == 0){
                count++;
            }
        }
        if (this.array.length == count){
            return true;
        }
        return false;
    }
    //q) - nota: obj vazio retorna true
    public boolean oddElementsObject (){
        int count = 0;
        for (int i = 0; i < this.array.length; i++){
            if (isEven(this.array[i]) == 1){
                count++;
            }
        }
        if (this.array.length == count){
            return true;
        }
        return false;
    }
    //r)
    public boolean duplicatedElements (){
        int count = 0;
        for (int i = 0; i < this.array.length; i++){
            for (int j = i + 1; j < this.array.length; j++){
                if (this.array[i] == this.array[j]){
                    count++;
                }
            }
        }
        if (count != 0){
            return true;
        }
        return false;
    }
    //s)
    public int[] countDigits (){
        int[] numberOfDigits = new int[this.array.length];
        int j = 1;
        int digits = 0;

        if (this.array.length == 0){
            return new int[0];
        }

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                digits++;
                j = j * 10;
            }
            if (this.array[i] == 0){
                digits = 1;
            }
            numberOfDigits[i] = digits;
            digits = 0;
            j = 1;
        }
        return numberOfDigits;
    }
    public int[] valuesAboveAverage (){
        int sum = 0;
        int count = 0;
        int pos = 0;
        double avg;
        int [] vectorNumberDigits = countDigits();

        for (int i = 0; i < this.array.length; i++){
            sum += vectorNumberDigits[i];
        }

        avg = (double) sum / this.array.length;

        for (int i = 0; i < this.array.length; i++){
            if (vectorNumberDigits[i] > avg){
                count++;
            }
        }

        int[] vectorOut = new int[count];

        for (int i = 0; i < this.array.length; i++){
            if (vectorNumberDigits[i]  > avg){
                vectorOut[pos] = this.array[i];
                pos++;
            }
        }

        return vectorOut;
    }
    //t)
    public int[] countEvenDigits (){
        int[] evenDigits = new int[this.array.length];
        int j = 1;
        int digits = 0;

        if (this.array.length == 0){
            return new int[0];
        }

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                if (isEven(this.array[i] / j % 10) == 0){
                    digits++;
                }
                j = j * 10;
            }
            if (this.array[i] == 0){
                digits = 1;
            }
            evenDigits[i] = digits;
            digits = 0;
            j = 1;
        }
        return evenDigits;
    }
    public int[] nbOfEvenDigitsAboveAvg(){
        double [] percentageEven = new double[this.array.length];
        int [] numberDigits = countDigits();
        int[] evenDigits = countEvenDigits();
        int sumEven = 0;
        int sum = 0;
        double avg;
        int count = 0;
        int pos = 0;

        for (int i = 0; i < this.array.length; i++){
            percentageEven[i] = evenDigits[i] /  numberDigits[i];
            sum += numberDigits[i];
            sumEven += evenDigits[i];
        }
        avg = (double) sumEven / sum;

        for (int i = 0; i < this.array.length; i++){
            if (percentageEven[i] > avg){
                count++;
            }
        }
        int[] vectorOut = new int[count];

        for (int i = 0; i < this.array.length; i++){
            if (percentageEven[i] > avg){
                vectorOut[pos] = this.array[i];
                pos++;
            }
        }
        return vectorOut;
    }
    //u)
    public int[] evenValues(){
        int count = 0;
        int [] numberDigits = countDigits();
        int[] evenDigits = countEvenDigits();
        int pos = 0;

        for (int i = 0; i < this.array.length; i++){
            if (numberDigits[i] == evenDigits[i]){
                count++;
            }
        }

        int[] vectorOut = new int[count];

        for (int i = 0; i < this.array.length; i++){
            if (numberDigits[i] == evenDigits[i]){
                vectorOut[pos] = this.array[i];
                pos++;
            }
        }
        return vectorOut;
    }
    //v)
    public int[] ascSeq (){
        int j = 1;
        int k = 10;
        int count = 0;
        int pos = 0;
        int [] vectorOut = new int[this.array.length];
        int [] numberDigits = countDigits();

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                if (this.array[i] / j % 10 > this.array[i] / k % 10 && numberDigits[i] > 1){
                    count++;
                }
                j = j * 10;
                k = k * 10;
            }
            if (count == numberDigits[i]){
                vectorOut[pos] = this.array[i];
                pos++;
            }
            j = 1;
            k = 10;
            count = 0;
        }

        return cutVector(pos,vectorOut);
    }
    public int[] cutVector (int pos, int[] vectorIn){
        int[] vectorOut = new int[pos];

        for (int i = 0; i < vectorOut.length; i++){
            vectorOut[i] = vectorIn[i];
        }

        return vectorOut;
    }
    //w)
    public int[] capicua (){
        int j = 1;
        int k = 1;
        int count = 0;
        int pos = 0;
        int [] vectorOut = new int[this.array.length];
        int [] numberDigits = countDigits();

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                k = k * 10;
                j = j * 10;
            }
            k = k / 10;
            j = 1;
            while (this.array[i] / j > 0){
                if (this.array[i] / j % 10 == this.array[i] / k % 10){
                    count++;
                }
                j = j * 10;
                k = k / 10;
            }
            if (count == numberDigits[i]){
                vectorOut[pos] = this.array[i];
                pos++;
            }
            j = 1;
            k = 1;
            count = 0;
        }
        return cutVector(pos,vectorOut);
    }
    //x)
    public int[] equalDigits(){
        int j = 1;
        int k = 10;
        int count = 0;
        int pos = 0;
        int [] vectorOut = new int[this.array.length];
        int [] numberDigits = countDigits();

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                if (this.array[i] / j % 10 == this.array[i] / k % 10){
                    count++;
                }
                j = j * 10;
                k = j * 10;
            }
            if (count == numberDigits[i] - 1){
                vectorOut[pos] = this.array[i];
                pos++;
            }
            j = 1;
            k = j * 10;
            count = 0;
        }
        return cutVector(pos,vectorOut);
    }
    //y)
    public int[] amstrongDigits(){
        int j = 1;
        int sum = 0;
        int pos = 0;
        int [] vectorOut = new int[this.array.length];

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                sum += Math.pow((this.array[i] / j % 10),3);
                j = j * 10;
            }
            if (sum == this.array[i]){
                vectorOut[pos] = this.array[i];
                pos++;
            }
            sum = 0;
            j = 1;
        }
        return cutVector(pos,vectorOut);
    }
    //z)
    public int[] ascSeqN (int n){
        int pos = 0;
        int [] vectorOut = new int[this.array.length];
        int [] numberDigits = countDigits();
        boolean [] seqAsc = ascSeqBol();

        for (int i = 0; i < this.array.length; i++){
            if (seqAsc[i] && numberDigits[i] >= n){
                vectorOut[pos] = this.array[i];
                pos++;
            }
        }

        return cutVector(pos,vectorOut);
    }
    public boolean[] ascSeqBol(){
        int j = 1;
        int k = 10;
        int count = 0;
        boolean [] vectorOut = new boolean[this.array.length];
        int [] numberDigits = countDigits();

        for (int i = 0; i < this.array.length; i++){
            while (this.array[i] / j > 0){
                if (this.array[i] / j % 10 > this.array[i] / k % 10 && numberDigits[i] > 1){
                    count++;
                }
                j = j * 10;
                k = k * 10;
            }
            if (count == numberDigits[i]){
                vectorOut[i] = true;
            }
            j = 1;
            k = 10;
            count = 0;
        }
        return vectorOut;
    }
    //aa)
    public boolean equalVector (int[] vector){ //seria o equals
        int count = 0;

        if (vector.length != this.array.length){
            return false;
        }

        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] == vector[i]){
                count++;
            }
        }

        if (count == this.array.length ){
            return true;
        }
        return false;
    }
    //metodo para a classe ArrayBidimensional2
    public ArrayInteiros reversesOrderOfvalues (){
        int k = this.lengthArray() - 1;
        int temp;
        for(int i = 0; i < this.lengthArray() / 2; i++){
            temp = this.array[i];
            this.array[i] = this.array[k];
            this.array[k] = temp;
            k--;
        }
        return new ArrayInteiros(this.getArray());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayInteiros that = (ArrayInteiros) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
