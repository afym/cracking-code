package cracking.solution01test;

import cracking.solution01.ArrayAddOne;
import junit.framework.TestCase;
import org.junit.Assert;

public class ArrayAddOneTest extends TestCase
{
    public void testSolutions()
    {
        Assert.assertArrayEquals(new int[]{1,2,4} ,ArrayAddOne.getResult(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{3,5,3} ,ArrayAddOne.getResult(new int[]{3,5,2}));
        Assert.assertArrayEquals(new int[]{2,0,0} ,ArrayAddOne.getResult(new int[]{1,9,9}));
        Assert.assertArrayEquals(new int[]{2,0,0,0} ,ArrayAddOne.getResult(new int[]{1,9,9,9}));
        Assert.assertArrayEquals(new int[]{5,8,8,0} ,ArrayAddOne.getResult(new int[]{5,8,7,9}));
        Assert.assertArrayEquals(new int[]{5,0,0,0,0,0} ,ArrayAddOne.getResult(new int[]{4,9,9,9,9,9}));
        Assert.assertArrayEquals(new int[]{6,9,0,0} ,ArrayAddOne.getResult(new int[]{6,8,9,9}));
        Assert.assertArrayEquals(new int[]{2, 0} ,ArrayAddOne.getResult(new int[]{1, 9}));
        Assert.assertArrayEquals(new int[]{9} ,ArrayAddOne.getResult(new int[]{8}));
        Assert.assertArrayEquals(new int[]{1, 0} ,ArrayAddOne.getResult(new int[]{9}));
        Assert.assertArrayEquals(new int[]{3,6,0,0} ,ArrayAddOne.getResult(new int[]{3,5,9,9}));
    }
}
