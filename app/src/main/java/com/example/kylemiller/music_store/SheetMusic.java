package com.example.kylemiller.music_store;

/**
 * Created by kylemiller on 10/09/2017.
 */

public class SheetMusic implements Sellable {

    private int numberOfPages;
    private double buyPrice;
    private double sellPrice;


    public SheetMusic(int numberOfPages, double buyPrice, double sellPrice) {
        this.numberOfPages = numberOfPages;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double markUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}
