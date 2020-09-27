package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Первая задача. Ответ:  " + reminder(5, 5));
        System.out.println("Вторая задача. Ответ:  " + triArea(10, 10));
        System.out.println("Третья задача. Ответ:  " + animals(5, 2, 8));
        System.out.println("Четвёртая задача. Ответ:  " + profitableGamble(0.9, 3, 2));
        System.out.println("Пятая задача. Ответ:  " + operation(15, 11, 11));
    }

    public static int reminder(int a, int b){
        int c = a%b;
        return c;
    }

    public static double triArea(int base, int hight){
        double area = 0.5 * base * hight;
        return area;
    }

    public static int animals (int kolChickens, int kolPigs, int kolCows){
        int legsChickens = 2;
        int legsPigs = 4;
        int legsCows = 4;
        int legs = kolChickens * legsChickens + kolPigs * legsPigs + kolCows * legsCows;
        return legs;
    }

    public static boolean profitableGamble(double prob, double prize, double pay){
        boolean result;
        if (prob * prize > pay){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public static String operation(int n, int a, int b){
        String oper;
        if (a + b == n){
            oper = "added";
        }
        else if (a - b == n){
            oper = "subtracted";
        }
        else if (a * b == n){
            oper = "multiply";
        }
        else if (a/b == n){
            oper = "split";
        }
        else
            oper = "none";
        return oper;
    }
}
