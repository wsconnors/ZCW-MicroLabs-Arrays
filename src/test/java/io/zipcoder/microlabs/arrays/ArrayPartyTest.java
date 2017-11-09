package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lastButOneTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Tomatoes";

        //: When
        String actual = arrayParty.lastButOne(breakfast);

        //: Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void reversTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n"+
                "Tomatoes\n"+
                "Bacon\n"+
                "Beans\n"+
                "Eggs\n"+
                "Sausage";


        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void isPalindrome(){
        String [] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "True\nFalse";

        String actual = arrayParty.isPalindrome(palindromic)+"\n"+arrayParty.isPalindrome(breakfast);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void compressTest(){
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\n: 1\n: 3\n: 2\n: 1\n: 4";

        String actual = arrayParty.compress(nums);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pack(){
        char [] letters = {'a','a', 'a', 'a', 'b', 'c', 'c', 'a', 'a' ,'d', 'e', 'e', 'e', 'e'};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\n: aaaa, b, cc, aa, d, eeee";

        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected,actual);
    }


}
