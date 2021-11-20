/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.probaprojekt;

/**
 *
 * @author user
 */
public class MobilesQuery {
    
    String Type;
    String OperationSystem;
    String BrandName;

    public MobilesQuery(String Type, String OperationSystem, String BrandName) {
        this.Type = Type;
        this.OperationSystem = OperationSystem;
        this.BrandName = BrandName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String OperationSystem) {
        this.OperationSystem = OperationSystem;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }
    
    
}
