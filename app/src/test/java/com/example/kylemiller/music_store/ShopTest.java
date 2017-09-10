package com.example.kylemiller.music_store;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 10/09/2017.
 */
public class ShopTest {
    Shop shop;
    Drums drums;
    ArrayList<Sellable> stock;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        stock = new ArrayList<>();
        shop = new Shop(stock);
        drums = new Drums("Leather", "Black", Type.PERCUSSION, 1, 15.00, 40.00);
        sheetMusic = new SheetMusic(200, 10.00, 15.00);

    }


    @Test
    public void stockStartsEmpty(){
        assertEquals(stock.size(), 0);
    }

    @Test
    public void canGetStock(){
        shop.addItemToStock(drums);
        ArrayList<Sellable> storedStock = shop.getStock();
        assertEquals("Leather", ((Drums) storedStock.get(0)).getMaterial());
        //how to i get the test to return drums as a string without adding a name attr with a drums value

    }
    @Test
    public void canAddToStock(){
        shop.addItemToStock(drums);
        assertEquals(stock.size(), 1);
    }

    @Test
    public void canDeleteItemFromStock(){
        shop.addItemToStock(drums);
        shop.removeItemByIndex(0);
        assertEquals(stock.size(), 0);
    }

    @Test
    public void testProfitSum(){
        shop.addItemToStock(drums);
        shop.addItemToStock(sheetMusic);
        assertEquals(shop.sumPotentialProfit(), 30.00);

    }



}






















