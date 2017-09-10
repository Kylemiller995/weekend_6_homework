package com.example.kylemiller.music_store;

import java.util.ArrayList;

/**
 * Created by kylemiller on 09/09/2017.
 */

public class Shop {
    private ArrayList<Sellable> stock;

    public Shop(ArrayList<Sellable> stock) {
        this.stock = stock;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addItemToStock(Sellable item){
        stock.add(item);
    }

    public void removeItemByIndex(int i){
        stock.remove(i);
    }

    public void sumPotentialProfit(){
        double sum = 0.00;
        for (Sellable item: stock){
            sum += item.markUp();
        }
        return sum;


    }

}












