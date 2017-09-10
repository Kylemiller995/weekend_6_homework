package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Red", Type.STRING, 5, 55.00, 70.00);
    }

    @Test
    public void testCanGetNumberofStrings(){
        assertEquals(guitar.getNumberOfString(), 5);
    }

    @Test
    public void testCanGetBuyPrice(){
        assertEquals(guitar.getBuyPrice(), 55.00);
    }

    @Test
    public void testCanGetSellPrice(){
        assertEquals(guitar.getSellPrice(), 70.00);
    }

    @Test
    public void testCanSetNumberOfStrings(){
        guitar.setNumberOfString(6);
        assertEquals(guitar.getNumberOfString(), 6);
    }

    @Test
    public void canSetBuyPrice(){
        guitar.setBuyPrice(40.00);
        assertEquals(guitar.getBuyPrice(), 40.00);
    }

    @Test
    public void canSetSellPrice(){
        guitar.setSellPrice(90.00);
        assertEquals(guitar.getSellPrice(), 90.00);
    }

    @Test
    public void canPlay(){
        assertEquals(guitar.play(), "Gnarly riff");
    }

    @Test
    public void testMarkup(){
        assertEquals(guitar.markUp(), 15.00);
    }
}