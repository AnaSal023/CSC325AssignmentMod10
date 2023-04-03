/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmodule10;

/**
 * Party class implements products interface
 * @author anasa
 */
public class Party implements Products{
    //attributes
    private String tops;
    private String shoes;
    private String pants;

    /**
     * default constructor
     */
    public Party() {
    }
    /**
     * constructor to set variable
     * @param tops
     * @param shoes
     * @param pants 
     */
    public Party(String tops, String shoes, String pants) {
        this.tops = tops;
        this.shoes = shoes;
        this.pants = pants;
    }
    /**
     * override method from products 
     * @return   tops
     */
    @Override
    public String getTops() {
        return "Party tops: " + tops;
    }
    /**
     * override method from products
     * @return  shoes
     */
    @Override
    public String getShoes() {
        return "Party shows: " + shoes;
    }
    /**
     * override method from products
     * @return  pants
     */
    @Override
    public String getPants() {
        return "Party pants: " + pants;
    }
    /**
     * set tops
     * @param tops 
     */
    public void setTops(String tops) {
        this.tops = tops;
    }
    /**
     * set shoes
     * @param shoes 
     */
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    /**
     * set pants
     * @param pants 
     */
    public void setPants(String pants) {
        this.pants = pants;
    }
    
}
