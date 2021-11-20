/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.probaprojekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class BrandService {

    private final String URL = "jdbc:sqlite:MobileShop.db";

    public List<MobilesQuery> getAllMobiles() {

        List<MobilesQuery> mobiles = new ArrayList<>();
        try {
            ResultSet resultSet = getStatement().executeQuery("SELECT m.Type, m.Camera, m.IMEI, m.Screen, m.RAM, m.ROM, m.Price, m.OperationSystem, b.Id, b.BrandName \nFROM Mobiles AS m \nINNER JOIN Brands as b \nON m.BrandId==b.Id");
            while (resultSet.next()) {
                MobilesQuery mobile = new MobilesQuery(resultSet.getString("BrandName"), resultSet.getString("IMEI"), resultSet.getString("Type"), resultSet.getString("Screen"), resultSet.getInt("Camera"), resultSet.getInt("RAM"), resultSet.getInt("ROM"), resultSet.getString("OperationSystem"), resultSet.getInt("Price"));
                mobiles.add(mobile);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return mobiles;
    }

    public int getFullPrice() {
        int fullPrice = 0;
        for (MobilesQuery mobile : getAllMobiles()) {
            fullPrice += mobile.getPrice();
        }
        return fullPrice;
    }

    public void decraseAppleMobiles() {
        getAllMobiles().forEach(mobile -> {
            double newPrice = mobile.getPrice() * 0.9;
            if (mobile.getBrandName().equals("Apple")) {
                try {
                    int v = getStatement().executeUpdate("UPDATE Mobiles SET Price = " + newPrice + " WHERE IMEI LIKE '" + mobile.getIMEI() + "'");
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

    }

    public String getMaxPrice() {
        String maxSTR = "";
        int maxPrice = 0;
        for (MobilesQuery mobile : getAllMobiles()) {
            if (mobile.getPrice() > maxPrice) {
                maxPrice = mobile.getPrice();
                maxSTR = mobile.toString();
            }
        }
        return maxSTR;
    }

    private Statement getStatement() throws SQLException {
        Connection connection = DriverManager.getConnection(URL);
        Statement statement = connection.createStatement();
        return statement;
    }
}
