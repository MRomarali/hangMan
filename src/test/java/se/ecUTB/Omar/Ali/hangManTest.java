package se.ecUTB.Omar.Ali;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class hangManTest
{
    private String secretWord;
    private int playerGuesses;
    private int guessedTimes;

    private hangManClass hang = new hangManClass(secretWord ,playerGuesses, guessedTimes);

    @Before
    public void init(){
        hang = new hangManClass(secretWord ,playerGuesses, guessedTimes);
        secretWord = "apple";
        hang.guess(secretWord, playerGuesses, guessedTimes);
   }

    @Test
    public void test_guessed_times(){
        int expected = guessedTimes;
        int actual = hang.getGuessedTimes();

        assertEquals(expected, actual);
    }
    @Test
    public void test_player_guesses(){
        int expected = playerGuesses;
        int actual = hang.getPlayerGuesses();
        assertEquals(expected, actual);
    }
    @Test
    public void test_used_letter(){
        boolean expected = hang.usedLetter.add('l');
        boolean actual = hang.usedLetter.contains('l');
        assertEquals(expected,actual);
    }

}
