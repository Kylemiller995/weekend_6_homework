package com.example.kylemiller.music_store;

/**
 * Created by kylemiller on 09/09/2017.
 */

public class Drums extends Instrument implements Playable, Sellable {

    private int numberOfDrums;
    private double buyPrice;
    private double sellPrice;



    public Drums(String material, String colour, Type type, int numberOfDrums, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.numberOfDrums = numberOfDrums;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setNumberOfDrums(int numberOfDrums) {
        this.numberOfDrums = numberOfDrums;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String play(){
        return "boom boom";
    };

    public double markUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }





}
