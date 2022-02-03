package com.company;

public class Balyk {
    private String aty;
    private String turu;
    private int baasy;

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public int getBaasy() {
        return baasy;

    }

    public void setBaasy(int baasy) {
        if(baasy>0){
            this.baasy = baasy;

        }else{
            System.out.println("Balyktyn baasy negativ bolushu munkun emes!");
        }
    }
}
