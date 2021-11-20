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


    private String BrandName;
    private String IMEI;
    private String Type;
    private String Screen;
    private int Camera;
    private int RAM;
    private int ROM;
    private String OperationSystem;
    private int Price;

    public MobilesQuery(String BrandName, String IMEI, String Type, String Screen, int Camera, int RAM, int ROM, String OperationSystem, int Price) {
        
        this.BrandName = BrandName;
        this.IMEI = IMEI;
        this.Type = Type;
        this.Screen = Screen;
        this.Camera = Camera;
        this.RAM = RAM;
        this.ROM = ROM;
        this.OperationSystem = OperationSystem;
        this.Price = Price;

    }


    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
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

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String OperationSystem) {
        this.OperationSystem = OperationSystem;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "BrandName=" + BrandName + ", IMEI=" + IMEI + ", Type=" + Type + ", Screen=" + Screen + ", Camera=" + Camera + ", RAM=" + RAM + ", ROM=" + ROM + ", OperationSystem=" + OperationSystem + ", Price=" + Price;
    }

}
