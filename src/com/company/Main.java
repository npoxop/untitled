package com.company;

public class Main {

    public static void main(String[] args) {
	//Задание 1
    int price=42;
    int gas=50;
    int total=price * gas;
    System.out.println(total + " Рублей");

    //Залание 2
    double gross = 56500;
    double net = gross - (gross * 13/100);
    System.out.println(net + " Рублей");

    //Задание 3
    int sec = 3600;
    int min = sec / 60;
    int hour = min / 60;
    System.out.println(hour + " Час(ов)");
    }
}

