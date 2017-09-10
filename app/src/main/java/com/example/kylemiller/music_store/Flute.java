package com.example.kylemiller.music_store;

/**
 * Created by kylemiller on 10/09/2017.
 */

public class Flute extends Instrument implements Playable, Sellable {
    private int numberOfValves;
    private double buyPrice;
    private double sellPrice;

    public Flute(String material, String colour, Type type, int numberOfValves, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.numberOfValves = numberOfValves;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String play(){
        return "Whimsical flute music";
    }

    public double markUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}
