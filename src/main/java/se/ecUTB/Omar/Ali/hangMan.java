package se.ecUTB.Omar.Ali;

import java.util.Random;


/**
 * Hello world!
 *
 */
public class hangMan
{
    private static StringBuilder sb = new StringBuilder();
    private static String[] secretWord = {"apple","watermelon","orange","pear","cherry","strawberry","nectarine","grape","mango","blueberry",
            "pomegranate","plum","banana","raspberry","mandarin","papaya","kiwi","pineapple","lime","lemon",
            "apricot","grapefruit","melon","coconut","avocado","peach"};

    public static void main(String[] args) {
        welcome();
        Random random = new Random();
        String randomWord = secretWord[random.nextInt(secretWord.length)];
        hangManClass hang = new hangManClass(randomWord, 8,0);
        hang.guess(secretWord[(int) (Math.random() * hang.getHangManSecretWord().length())],hang.getPlayerGuesses(), hang.getGuessedTimes());
        sb.append(secretWord);

    }

    private static void welcome() {
        System.out.println("Welcome to my hangman GUESS THE FRUIT Game,\n " +
                "==============================================\n" +
                "You have eight guesses total to win the game\n" +
                "Guess a word by entering space in between or guess using letters.\n" +
                "you can also complete the letters by writing the remaining words with spaces in between \n" +
                "if you type the same letter more than once you wont get a minus point.\n"
                + "\t\t\t\t Good Luck!!\n" +
                "======================================================================== \n");
    }
}
