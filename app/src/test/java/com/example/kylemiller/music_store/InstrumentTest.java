package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class InstrumentTest {
    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Leather", "Black", Type.PERCUSSION, 1, 15.00, 40.00);
    }

    @Test
    public void testCanGetMaterial(){
        assertEquals(drums.getMaterial(), "Leather");
    }

    @Test
    public void testCanGetColour(){
        assertEquals(drums.getColour(), "Black");
    }

    @Test
    public void testCanGetType(){
        assertEquals(drums.getType(), Type.PERCUSSION);
    }

    @Test
    public void testCanSetColour(){
        drums.setColour("Red");
        assertEquals(drums.getColour(), "Red");
    }

    @Test
    public void testCanSetMaterial(){
        drums.setMaterial("Plastic");
        assertEquals(drums.getMaterial(), "Plastic");
    }




}