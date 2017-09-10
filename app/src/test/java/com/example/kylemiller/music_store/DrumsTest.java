package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Leather", "Black", Type.PERCUSSION, 1, 15.00, 40.00);
    }

    @Test
    public void getNumberOfDrums() {
        assertEquals(drums.getNumberOfDrums(), 1);
    }

    @Test
    public void getBuyPrice(){
        assertEquals(drums.getBuyPrice(), 15.00);

    }

    @Test
    public void getSellPrice() {
        assertEquals(drums.getSellPrice(), 40.00);
    }

    @Test
    public void setNumberOfDrums() {
        drums.setNumberOfDrums(2);
        assertEquals(drums.getNumberOfDrums(), 2);
    }

    @Test
    public void setBuyPrice() {
        drums.setBuyPrice(14.00);
        assertEquals(drums.getBuyPrice(), 14.00);
    }

    @Test
    public void setSellPrice() {
        drums.setSellPrice(39.00);
        assertEquals(drums.getSellPrice(), 39.00);
    }

    @Test
    public void testPlay() {
        assertEquals(drums.play(), "boom boom");
    }

    @Test
    public void testMarkUp(){
        assertEquals(drums.markUp(), 25.00);
    }

}