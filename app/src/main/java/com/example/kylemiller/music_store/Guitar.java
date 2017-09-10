package com.example.kylemiller.music_store;

/**
 * Created by kylemiller on 09/09/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {
    private int numberOfString;
    private double buyPrice;
    private double sellPrice;

    public Guitar(String material, String colour, Type type, int numberOfString, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.numberOfString = numberOfString;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String play(){
        return "Gnarly riff";
    }

    public double markUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}
