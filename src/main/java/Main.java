import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] firstLetterPosition = new int[2];
        int[] lastLetterPosition = new int[2];
        String word;
        char [][] soupMatrix = {{'A','M','A','X','P'},{'R','O','C','A','Z'},{'U','A','P','A','T'},
                                {'O','A','L','V','O'},{'P','X','Z','O','Y'}};
        String [] wordsToFind = {"roca","ama","ar","cor","po","cao","ola","pa","papa"};
        LetterSoup letterSoup = new LetterSoup(soupMatrix,wordsToFind);

        while (!letterSoup.terminatesMatch()){
            letterSoup.showMatrix();
            System.out.println();
            System.out.println("Inserir linha da 1ª letra da palavra");
            firstLetterPosition[0] = sc.nextInt();
            System.out.println("Inserir coluna da 1ª letra da palavra");
            firstLetterPosition[1] = sc.nextInt();
            System.out.println("Inserir linha da última letra da palavra");
            lastLetterPosition[0] = sc.nextInt();
            System.out.println("Inserir coluna da última letra da palavra");
            lastLetterPosition[1] = sc.nextInt();
            word = letterSoup.extractsWord(firstLetterPosition,lastLetterPosition);
            letterSoup.appendWordInFoundWords(word);
        }
        System.out.println("Fim do jogo");
    }
}
