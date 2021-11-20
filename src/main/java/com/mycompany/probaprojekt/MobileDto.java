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
public class MobileDto {
    
    int IMEI;
    String Type;
    String Screen;
    int Camera;
    int RAM;
    int ROM;
    int OperationSystem;
    int Price;
    int BrandId;
    
    public MobileDto(int IMEI, String Type, String Screen, int Camera, int RAM, int ROM, int OperationSystem, int Price, int BrandId) {
        this.IMEI = IMEI;
        this.Type = Type;
        this.Screen = Screen;
        this.Camera = Camera;
        this.RAM = RAM;
        this.ROM = ROM;
        this.OperationSystem = OperationSystem;
        this.Price = Price;
        this.BrandId = BrandId;
    }
    
    
    
    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String Screen) {
        this.Screen = Screen;
    }

    public int getCamera() {
        return Camera;
    }

    public void setCamera(int Camera) {
        this.Camera = Camera;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public int getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(int OperationSystem) {
        this.OperationSystem = OperationSystem;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getBrandId() {
        return BrandId;
    }

    public void setBrandId(int BrandId) {
        this.BrandId = BrandId;
    }

    
}
