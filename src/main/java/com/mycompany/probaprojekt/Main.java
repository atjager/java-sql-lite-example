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
        mobiles.forEach(mobile -> {
            System.out.println(mobile.getBrandName());
        });
    }
    // TODO code application logic here
}
