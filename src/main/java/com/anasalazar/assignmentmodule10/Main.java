/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmodule10;

/**
 * Driver class to test code
 * @author anasa
 */
public class Main {
    public static void main(String[] args) {
        
        //professional, casual, party variables
        Professional garment1 = new Professional();
        Casual garment2 = new Casual();
        Party garment3 = new Party();
        
        //setting and getting professional variable elements
        garment1.setPants("Dressy pants");
        garment1.setShoes("Dressy shoes");
        garment1.setTops("Dressy tops");
        System.out.println(garment1.getPants());
        System.out.println(garment1.getShoes());
        System.out.println(garment1.getTops());
        
        //space
        System.out.println("");
        
        //setting and getting casual variable elements
        garment2.setPants("Jeans");
        garment2.setShoes("Sneakers");
        garment2.setTops("T-Shirt");
        System.out.println(garment2.getPants());
        System.out.println(garment2.getShoes());
        System.out.println(garment2.getTops());
        
        //space
        System.out.println("");
        
        //setting and getting party variable elements
        garment3.setPants("Party pants");
        garment3.setShoes("Party shoes");
        garment3.setTops("Party tops");
        System.out.println(garment3.getPants());
        System.out.println(garment3.getShoes());
        System.out.println(garment3.getTops());
        
    }
    
}
