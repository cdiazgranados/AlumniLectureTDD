package Main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

//Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
//Task: sort the numbers
//Restriction: the numbers must stay strings - no converting to integers


public class MainTest {
    Main main = new Main();
    @Test
    public void sortNumbersTest() {
        //given (arrange):
        String[] given = new String[]{"1", "5", "15", "9", "4"};
        String[] expected = new String[]{"1", "4", "5", "9", "15"};
        //{"1", "5", "9", "4", "15"}

        //when (act):
        String[] actual = main.sortNumbers(given);

        //then (assert):
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void firstBiggerThanSecondTest_1_5() {
        //given (arrange):
        String[] given = new String[]{"1", "5"};

        //when (act):
        Boolean actual = main.firstBiggerThanSecond(given);


        //then (assert):
        Assert.assertFalse(actual);

    }
    @Test
    public void firstBiggerThanSecondTest_5_1() {
        //given (arrange):
        String[] given = new String[]{"5", "1"};

        //when (act):
        Boolean actual = main.firstBiggerThanSecond(given);


        //then (assert):
        Assert.assertTrue(actual);

    }
    @Test
    public void firstBiggerThanSecondTest_15_5() {
        //given (arrange):
        String[] given = new String[]{"15", "5"};

        //when (act):
        Boolean actual = main.firstBiggerThanSecond(given);


        //then (assert):
        Assert.assertTrue(actual);

    }

    @Test
    public void firstBiggerThanSecondTest_5_15() {
        //given (arrange):
        String[] given = new String[]{"5", "15"};

        //when (act):
        Boolean actual = main.firstBiggerThanSecond(given);


        //then (assert):
        Assert.assertFalse(actual);

    }
    @Test
    public void firstBiggerThanSecondTest_5_5() {
        //given (arrange):
        String[] given = new String[]{"5", "5"};

        //when (act):
        Boolean actual = main.firstBiggerThanSecond(given);


        //then (assert):
        Assert.assertFalse(actual);

    }
}