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

    public List<BrandDto> getAllBrands() {

        List<BrandDto> brands = new ArrayList<>();
        try {
            ResultSet resultSet = getStatement().executeQuery("SELECT * FROM Brands");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("BrandName"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return brands;
    }

    public List<MobilesQuery> getAllMobiles() {

        List<MobilesQuery> mobiles = new ArrayList<>();
        try {
            ResultSet resultSet = getStatement().executeQuery("SELECT c.Type, c.OperationSystem, b.BrandName\n FROM Mobiles AS c\n INNER JOIN Brands as b\n ON c.BrandId==b.Id");
            while (resultSet.next()) {
               MobilesQuery mobile = new MobilesQuery(resultSet.getString("BrandName"),resultSet.getString("Type"),resultSet.getString("OperationSystem"));
               mobiles.add(mobile);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return mobiles;
    }

    private Statement getStatement() throws SQLException {
        Connection connection = DriverManager.getConnection(URL);
        Statement statement = connection.createStatement();
        return statement;
    }
}
