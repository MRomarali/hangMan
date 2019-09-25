package se.ecUTB.Omar.Ali;

import java.util.ArrayList;
import java.util.Scanner;

public class hangManClass {
    private int guessedTimes;
    String hangManSecretWord;
    private int playerGuesses;
    private static Scanner input = new Scanner(System.in);
    ArrayList<Character> usedLetter;
    private StringBuilder str = new StringBuilder();

    public hangManClass(String hangManSecretWord, int playerGuesses, int guessedTimes) {
        this.hangManSecretWord = hangManSecretWord;
        this.playerGuesses = playerGuesses;
        this.guessedTimes = guessedTimes;
    }

    public int getPlayerGuesses() {
        return playerGuesses;
    }

    public void setPlayerGuesses(int playerGuesses) {
        this.playerGuesses = 8;
        this.playerGuesses = playerGuesses;
    }

    public int getGuessedTimes() {
        return guessedTimes;
    }

    public void setGuessedTimes(int guessedTimes) {
        this.guessedTimes = 0;
        this.guessedTimes = guessedTimes;
    }

    public String getHangManSecretWord() {
        return hangManSecretWord;
    }

    public void setHangManSecretWord(String hangManSecretWord) {
        hangManSecretWord = "apple" + "watermelon" + "orange" + "pear" + "cherry" + "strawberry" + "nectarine" + "grape" + "mango" + "blueberry" +
                "pomegranate" + "carambola" + "plum" + "banana" + "raspberry" + "mandarin" + "jackfruit" + "papaya" + "kiwi" + "pineapple" + "lime" + "lemon" +
                "apricot" + "grapefruit" + "melon" + "coconut" + "avocado" + "peach";
        this.hangManSecretWord = hangManSecretWord;
    }

    //Check guessed letter
    public void guess(String guess,int playerGuesses, int guessedTimes) {

        char[] letterBox = new char[guess.length()];
        int i = 0;
        while (i<guess.length()){
            letterBox[i]= '*';
            if (guess.charAt(i) == ' ') {
                letterBox[i]= ' ';
            }
            i++;
        }
        System.out.println(letterBox);
        System.out.println("Remaining Guesses " + playerGuesses);
        System.out.println("The secret word has " + guess.length() + " letters in it");

        usedLetter = new ArrayList<Character>();
        while (playerGuesses>0){
            guessedTimes++;
            char alreadyExist= input.next().charAt(0);
            if (usedLetter.contains(alreadyExist)) {
                System.out.println("Already entered");
                continue;
            }
            // refuses letters repetition
            usedLetter.add(alreadyExist);
            if (guess.contains(alreadyExist+"")) {
                for (int j = 0; j < guess.length(); j++) {
                    if (guess.charAt (j) ==alreadyExist) {
                        letterBox[j]=alreadyExist;
                    }
                }
                System.out.println("\t\t\t\t" + usedLetter);
            }
            else {
                playerGuesses--;
            }
            if (guess.equals(String.valueOf(letterBox))) {
                System.out.println("You won!!\n" + "The secret word was: ");
                System.out.println(guess);
                System.out.println(" You guessed " + guessedTimes + " Times ");
                break;
            }
            System.out.println(letterBox);
            System.out.println(" remaining Guesses = " + playerGuesses);

        }
        if (playerGuesses==0){
            System.out.println();
            System.out.println("You lost!!\n The secret word was: ");
            System.out.println(guess);
            System.out.println(" You guessed " + guessedTimes + " Times ");
        }
    }
    public boolean guess(String guess){
        guessedTimes ++;
        if(guess.equals(hangManSecretWord)){
            System.out.println("You guessed correctly!!");
            return true;

    }
        return true;
}
}
