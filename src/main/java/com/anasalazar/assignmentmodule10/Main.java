/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmodule10;

/**
 *
 * @author anasa
 */
public class Main {
    public static void main(String[] args) {
        
        Professional garment1 = new Professional();
        Casual garment2 = new Casual();
        Party garment3 = new Party();
        
        garment1.setPants("Dressy pants");
        garment1.setShoes("Dressy shoes");
        garment1.setTops("Dressy tops");
        System.out.println(garment1.getPants());
        System.out.println(garment1.getShoes());
        System.out.println(garment1.getTops());
        
        garment2.setPants("Jeans");
        garment2.setShoes("Sneakers");
        garment2.setTops("T-Shirt");
        System.out.println(garment2.getPants());
        System.out.println(garment2.getShoes());
        System.out.println(garment2.getTops());
        
    }
    
}
