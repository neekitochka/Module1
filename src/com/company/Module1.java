package com.company;

public class Module1 {

    public static void main(String[] args) {
        int arr[] = {1, 5, 9};
        System.out.println("Задача №1. Ответ:  " + reminder(5, 5));
        System.out.println("Задача №2. Ответ:  " + triArea(10, 10));
        System.out.println("Задача №3. Ответ:  " + animals(5, 2, 8));
        System.out.println("Задача №4. Ответ:  " + profitableGamble(0.9, 3, 2));
        System.out.println("Задача №5. Ответ:  " + operation(15, 11, 11));
        System.out.println("Задача №6. Ответ:  " + ctoa('['));
        System.out.println("Задача №7. Ответ:  " + addUpTo(7));
        System.out.println("Задача №8. Ответ:  " + nextEdge(9,2 ));
        System.out.println("Задача №9. Ответ:  " + sumOfCubes(arr));
        System.out.println("Задача №10. Ответ:  " + abcmath(1, 2, 3));
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
        result = prob * prize > pay;
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

    public static int ctoa(char a){
        return a;
    }

    public static int addUpTo(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int nextEdge(int a, int b){
        int c;
        c = a + b -1;
        return c;
        //Сумма двух сторон треугольника должна быть больше третьей стороны
    }

    public static int sumOfCubes(int[] n){
        int sum = 0;
        for (int i  = 0; i < n.length ;i++){
            sum = sum + n[i] * n[i] * n[i];
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c){
        boolean result;
        for (int i = 0; i <= b; i++){
            a = a * 2;
        }
        if (a % c == 0){
            result  = true;
        }
        else
            result  = false;
        return result;
    }

}
