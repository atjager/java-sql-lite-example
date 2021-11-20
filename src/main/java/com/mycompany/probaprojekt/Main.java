/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.probaprojekt;

import java.util.List;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BrandService brandService = new BrandService();
        List<MobilesQuery> mobiles = brandService.getAllMobiles();
        System.out.println("Adatbázisban szereplo össze telefon adata:");
        mobiles.forEach(mobile -> {
            System.out.println(mobile.toString());
        });

        System.out.println("\n\nA telefonok összértéke: " + brandService.getFullPrice() + "\n");
        
        System.out.println("Legdrágább telefon adatai:");
        System.out.println(brandService.getMaxPrice());
        
        System.out.println("\nApple telefonok régi ára:");

        mobiles.forEach(mobile -> {
            if (mobile.getBrandName().equals("Apple")) {
                System.out.println(mobile.toString());
            }
        });
        brandService.decraseAppleMobiles();
        System.out.println("\nApple telefonok új ára:");
        mobiles = brandService.getAllMobiles();
        mobiles.forEach(mobile -> {
            if (mobile.getBrandName().equals("Apple")) {
                System.out.println(mobile.toString());
            }
        });
    }
    // TODO code application logic here
}
