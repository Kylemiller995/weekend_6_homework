package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(200, 10.00, 15.00);
    }


    @Test
    public void getNumberOfPages()  {
        assertEquals(sheetMusic.getNumberOfPages(), 200);

    }

    @Test
    public void getBuyPrice() {
        assertEquals(sheetMusic.getBuyPrice(), 10.00);
    }

    @Test
    public void getSellPrice() {
        assertEquals(sheetMusic.getSellPrice(), 15.00);
    }

    @Test
    public void setNumberOfPages() {
        sheetMusic.setNumberOfPages(30);
        assertEquals(sheetMusic.getNumberOfPages(), 30);
    }

    @Test
    public void setBuyPrice() {
        sheetMusic.setBuyPrice(40.00);
        assertEquals(sheetMusic.getBuyPrice(), 40.00);
    }

    @Test
    public void setSellPrice() {
        sheetMusic.setSellPrice(30.00);
        assertEquals(sheetMusic.getSellPrice(), 30.00);
    }

    @Test
    public void markUp() {
        assertEquals(sheetMusic.markUp(), 5.00);
    }

}