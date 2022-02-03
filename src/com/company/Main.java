package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Balyk balyk = new Balyk();
        balyk.setAty("Dori");
        balyk.setTuru("Siga");
        balyk.setBaasy(450);

        System.out.println(balyk.getAty()+" "+
                balyk.getTuru()+" " + balyk.getBaasy());

        Papugay papu = new Papugay();
        papu.setOnu("sary");
        papu.setParodasy("Small");

        System.out.println(papu.getOnu()+" "+ papu.getParodasy());


        Myshyk myshyk = new Myshyk();
        myshyk.setAty("Tom");
        myshyk.setOnu("kara");
        myshyk.setJashy(3);
        myshyk.setSalmagy(15);

        System.out.println(myshyk.getJashy()+" "+ myshyk.getSalmagy()+" "+ myshyk.getAty()+" "+
                myshyk.getOnu());


        It it = new It();
        it.setAty("Hatiko");
        it.setJashy(23);
        it.setOnu("sary");
        it.setParodasy("Alabay");
        it.setSalmagy(25);


    }
}
