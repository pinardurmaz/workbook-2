package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int two=0, four=0, six=0, seven=0;

        for (int i = 1; i <= 100; i++) {
            int r1 = dice.roll();
            int r2 = dice.roll();
            int sum = r1 + r2;
            System.out.printf("Roll %d: %d + %d = %d%n", i, r1, r2, sum);

            if (sum == 2)  two++;
            if (sum == 4)  four++;
            if (sum == 6)  six++;
            if (sum == 7)  seven++;
        }

        System.out.println("2: " + two);
        System.out.println("4: " + four);
        System.out.println("6: " + six);
        System.out.println("7: " + seven);
    }
}