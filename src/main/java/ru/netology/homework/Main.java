package ru.netology.homework;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

           int expected = 150;
            long actual = service.calculate(5_000, true);
        System.out.println(expected + " == " + actual);


    }
}