package com.company;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x < 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("FizzBuzz");
                System.out.print("\n");
            } else {

                if (x % 3 == 0) {
                    //multiples_of_3 = x * 3;
                    System.out.print("Fizz");
                    System.out.print("\n");
                } else if (x % 5 == 0) {
                    System.out.print("Buzz");
                    System.out.print("\n");
                } else {
                    System.out.print(x);
                    System.out.print("\n");
                }
            }
            }
        }
}
