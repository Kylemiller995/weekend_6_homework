package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Metal", "Bronze", Type.WOODWIND, 4, 30.00, 50.00);
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(flute.getNumberOfValves(), 4);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(flute.getBuyPrice(), 30.00);

    }

    @Test
    public void getSellPrice() {
        assertEquals(flute.getSellPrice(), 50.00);
    }

    @Test
    public void setNumberOfValves() {
        flute.setNumberOfValves(2);
        assertEquals(flute.getNumberOfValves(), 2);
    }

    @Test
    public void setBuyPrice() {
        flute.setBuyPrice(40.00);
        assertEquals(flute.getBuyPrice(), 40.00);
    }

    @Test
    public void setSellPrice() {
        flute.setSellPrice(70.00);
        assertEquals(flute.getSellPrice(), 70.00);
    }

    @Test
    public void testPlay() {
        assertEquals(flute.play(), "Whimsical flute music");
    }

    @Test
    public void testMarkUp(){
        assertEquals(flute.markUp(), 20.00);
    }

}