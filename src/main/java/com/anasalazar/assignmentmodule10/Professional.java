/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmodule10;

/**
 *
 * @author anasa
 */
public class Professional implements Products{
    
    private String tops;
    private String shoes;
    private String pants;

    @Override
    public String getTops() {
        return "Professional tops: " + tops;
    }

    @Override
    public String getShoes() {
        return "Professional shows: " + shoes;
    }

    @Override
    public String getPants() {
        return "Professional pants: " + pants;
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
