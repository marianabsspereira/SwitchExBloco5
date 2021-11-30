public class LetterSoup {

    private char [][] soupMatrix;
    private String [] wordsToFind;
    private String [] wordsFound;

    public LetterSoup(char [][] soupMatrix, String [] wordsToFind){
        if (!isValidMatrix(soupMatrix)){
            throw new IllegalArgumentException("Matrix not valid");
        }
        this.soupMatrix = soupMatrix;
        this.wordsToFind = wordsToFind;
        this.wordsFound = new String[this.wordsToFind.length];
    }

    public void showMatrix (){
        int size = this.soupMatrix.length;

        for (int i = 0; i < this.soupMatrix.length; i++){
            System.out.print("   " + i);
        }
        System.out.println(" ");
        String lineToPrint = 0 + " |";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                lineToPrint += this.soupMatrix[i][j] + " | ";
            }
            System.out.println(lineToPrint);
            lineToPrint = (i+1) + " |";
        }
    }

    public boolean isValidMatrix (char [][] soupMatrix){
        if (soupMatrix.length != soupMatrix[0].length) return false; //validates square matrix

        if (soupMatrix.length < 2) return false; //validates minimum size of matrix

        //validates nº of columns equal for each line
        for (int i = 0; i < soupMatrix.length; i++){
            for (int j = 0; j < soupMatrix[i].length; j++){
                if (soupMatrix[i].length != soupMatrix[0].length){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validatesWordPosition (int[] firstLetterPosition,int[] lastLetterPosition){
        if (firstLetterPosition.length != 2 || lastLetterPosition.length != 2){
            return false;
        }

        for (int i = 0; i < 2; i++){
            if (firstLetterPosition[i] < 0 || lastLetterPosition[i] < 0){
                return false;
            }
            if (firstLetterPosition[i] >= this.soupMatrix.length || lastLetterPosition[i] >= this.soupMatrix.length){
                return false;
            }
        }

        if (firstLetterPosition[0] == lastLetterPosition[0] && firstLetterPosition[1] == lastLetterPosition[1]){
            return false;
        }

        if (Math.abs(lastLetterPosition[0]-firstLetterPosition[0]) != Math.abs(lastLetterPosition[1]-firstLetterPosition[1])
        && firstLetterPosition[0] != lastLetterPosition[0] && firstLetterPosition[1] != lastLetterPosition[1]){
            return false;
        }

        return true;
    }

    public char findsWordOrientation (int[] firstLetterPosition,int[] lastLetterPosition){
        if (!validatesWordPosition(firstLetterPosition,lastLetterPosition)) return 'N';
        if (firstLetterPosition[0] == lastLetterPosition[0]) return 'H';
        if (firstLetterPosition[1] == lastLetterPosition[1]) return 'V';
        return 'D';
    }

    public String findsWordDirection (int[] firstLetterPosition,int[] lastLetterPosition){
        char orientation = findsWordOrientation(firstLetterPosition,lastLetterPosition);

        if (orientation == 'N'){
            return "N";
        }
        if (orientation == 'H'){
            if (firstLetterPosition[1] < lastLetterPosition[1]) return "HED"; //horizontal esquerda - direita -> HED
            if (firstLetterPosition[1] > lastLetterPosition[1]) return "HDE"; //horizontal direita - esquerda -> HDE
        }
        if (orientation == 'V'){
            if (firstLetterPosition[0] < lastLetterPosition[0]) return "VCB"; //vertical cima - baixo -> VCB
            if (firstLetterPosition[0] > lastLetterPosition[0]) return "VBC"; //vertical baixo - cima -> VBC
        }
        if (orientation == 'D'){
            if (firstLetterPosition[0] < lastLetterPosition[0] && firstLetterPosition[1] < lastLetterPosition[1]){
                return "DDED"; //diag descendente esquerda - direita: (i1 < i2 e j1 < j2) -> DDED
            }
            if (firstLetterPosition[0] > lastLetterPosition[0] && firstLetterPosition[1] > lastLetterPosition[1]){
                return "DADE"; //diag ascendente direita - esquerda: (i1 > i2 e j1 > j2) -> DADE
            }
            if (firstLetterPosition[0] < lastLetterPosition[0] && firstLetterPosition[1] > lastLetterPosition[1]){
                return "DDDE"; //diag descendente direita - esquerda: (i1 < i2 e j1 > j2) -> DDDE
            }
            if (firstLetterPosition[0] > lastLetterPosition[0] && firstLetterPosition[1] < lastLetterPosition[1]){
                return "DAED"; //diag ascendente esquerda - direita: (i1 > i2 e j1 < j2) -> DAED
            }
        }
        return "N";
    }

    public String extractsWord (int[] firstLetterPosition,int[] lastLetterPosition){
        String direction = findsWordDirection(firstLetterPosition,lastLetterPosition);

        if (direction.equals("N")) return "";

        String result = "";

        if (direction.equals("HED")){
            for (int j =  firstLetterPosition[1]; j <= lastLetterPosition[1]; j++){
                result += this.soupMatrix[firstLetterPosition[0]][j];
            }
        }
        if (direction.equals("HDE")){
            for (int j =  firstLetterPosition[1]; j >= lastLetterPosition[1]; j--){
                result += this.soupMatrix[firstLetterPosition[0]][j];
            }
        }
        if (direction.equals("VCB")){
            for (int i =  firstLetterPosition[0]; i <= lastLetterPosition[0]; i++){
                result += this.soupMatrix[i][firstLetterPosition[1]];
            }
        }
        if (direction.equals("VBC")){
            for (int i =  firstLetterPosition[0]; i >= lastLetterPosition[0]; i--){
                result += this.soupMatrix[i][firstLetterPosition[1]];
            }
        }
        if (direction.equals("DDED")){
            int j = firstLetterPosition[1];
            for (int i =  firstLetterPosition[0]; i <= lastLetterPosition[0]; i++){
                result += this.soupMatrix[i][j];
                j++;
            }
        }
        if (direction.equals("DADE")){
            int j = firstLetterPosition[1];
            for (int i =  firstLetterPosition[0]; i >= lastLetterPosition[0]; i--){
                result += this.soupMatrix[i][j];
                j--;
            }
        }
        if (direction.equals("DDDE")){
            int j = firstLetterPosition[1];
            for (int i =  firstLetterPosition[0]; i <= lastLetterPosition[0]; i++){
                result += this.soupMatrix[i][j];
                j--;
            }
        }
        if (direction.equals("DAED")){
            int j = firstLetterPosition[1];
            for (int i =  firstLetterPosition[0]; i >= lastLetterPosition[0]; i--){
                result += this.soupMatrix[i][j];
                j++;
            }
        }
        return result.toUpperCase();
    }

    public boolean verifiesIfWordExistsInSolution (String word){
        for (int i = 0; i < this.wordsToFind.length; i++){
            if (word.equalsIgnoreCase(this.wordsToFind[i])){
                return true;
            }
        }
        return false;
    }

    public boolean verifiesIfWordWasAlreadyFound (String word){
        if (this.wordsFound == null) return false;
        for (int i = 0; i < this.wordsFound.length; i++){
            if (word.equalsIgnoreCase(this.wordsFound[i])){
                return true;
            }
        }
        return false;
    }

    public void appendWordInFoundWords (String word){
        if (verifiesIfWordExistsInSolution(word) && !verifiesIfWordWasAlreadyFound(word)){
            int pos = 0;
            for (int i = 0; i < this.wordsFound.length; i++){
                if (this.wordsFound[i] != null) pos++;
            }
            this.wordsFound[pos] = word;
        }
    }

    public boolean terminatesMatch(){
        int count = 0;
        for (int i = 0; i < this.wordsFound.length; i++){
            for (int j = 0; j < this.wordsToFind.length; j++){
                if (this.wordsFound[i] != null && this.wordsFound[i].equalsIgnoreCase(this.wordsToFind[j])) count++;
            }
        }

        if (count == this.wordsToFind.length){
            return true;
        }
        return false;
    }
}
