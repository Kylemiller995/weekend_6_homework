package com.example.kylemiller.music_store;

/**
 * Created by kylemiller on 10/09/2017.
 */

public abstract class Instrument implements Playable {
    private String material;
    private String colour;
    private Type type;

    public Instrument(String material, String colour, Type type){
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    

}


