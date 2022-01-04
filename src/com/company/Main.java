package com.company;

public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int bonusLimit = 1000;
        int rublesForBonus = 100;
        int payment = 1100;

        int bonus = 0;
        if (payment > bonusLimit) {
            bonus = payment / rublesForBonus;
        }

        int newBalance = balance + payment + bonus;
        System.out.println("Итого на счёте: " + newBalance);
        System.out.println("в т.ч. бонусов: " + bonus);

    }
}
