package com.company;

public class Myshyk {
    private String aty;
    private String onu;
    private int jashy;
    private int salmagy;


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
        if(jashy>=0 && jashy<=20){
            this.jashy = jashy;
        }else{
            System.out.println("Myshyktyr 0-20 arasy jashait ");
        }

    }

    public int getSalmagy() {
        return salmagy;
    }

    public void setSalmagy(int salmagy) {
        if(salmagy>0){
            this.salmagy = salmagy;
        }else{
            System.out.println("Myshyktyn salmagy negative bolushu munkun emes");
        }

    }
}
