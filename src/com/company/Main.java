package com.company;

public class Main {

    public static int result = 0;

    public static void main(String[] args) {
        double[] Massif = {1,-6,-4,-3,7,8,3,8,3,4,7,3,2,7,-5};
        int countOfNumbers = 0;
        double number = 0;
        boolean firstNegative = false;
        for (double a : Massif
        ) {
            if (a<0) {
                firstNegative = true;
            }
            else if (firstNegative==true){
                number = number += a;
                countOfNumbers = countOfNumbers += 1;
            }
        }
        System.out.println(number/countOfNumbers);
    }
}