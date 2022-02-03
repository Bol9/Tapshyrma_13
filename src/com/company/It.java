package com.company;

public class It {
    private String aty;
    private String onu;
    private int jashy;
    private int salmagy;
    private String parodasy;

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getOnu() {
        return onu;
    }

    public void setOnu(String onu) {
        this.onu = onu;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        if(jashy>=0  && jashy<=20){
            this.jashy = jashy;
        }else{
            System.out.println("Itter 0-20 jash arasy jashait , siz bergen jash "+ jashy);
        }

    }

    public int getSalmagy() {
        return salmagy;
    }

    public void setSalmagy(int salmagy) {
        if(salmagy>0){
            this.salmagy = salmagy;
        }else{
            System.out.println("Ittin salmak negativ bolushu munkun emes, siz bergen jash "+ salmagy);
        }

    }

    public String getParodasy() {
        return parodasy;
    }

    public void setParodasy(String parodasy) {
        this.parodasy = parodasy;
    }
}
