package com.cursmysql;

public class Main {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.name = "Bogdan";
        bogdan.salary = 8142;
        bogdan.age = 40;
        int b = bogdan.calcBonus();
        System.out.println(b);
    }
}
