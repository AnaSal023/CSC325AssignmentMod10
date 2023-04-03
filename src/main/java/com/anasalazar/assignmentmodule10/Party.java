/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmodule10;

/**
 *
 * @author anasa
 */
public class Party implements Products{
    private String tops;
    private String shoes;
    private String pants;

    public Party() {
    }

    public Party(String tops, String shoes, String pants) {
        this.tops = tops;
        this.shoes = shoes;
        this.pants = pants;
    }
    
    @Override
    public String getTops() {
        return "Party tops: " + tops;
    }

    @Override
    public String getShoes() {
        return "Party shows: " + shoes;
    }

    @Override
    public String getPants() {
        return "Party pants: " + pants;
    }
    
    public void setTops(String tops) {
        this.tops = tops;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }
    
}
