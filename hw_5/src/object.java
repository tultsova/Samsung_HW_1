import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // На числовой прямой дан отрезок [3;8]. Требуется определить, принадлежит ли точка x данному отрезку.
        // Выходные данные : Выведите true, если точка x принадлежит данному отрезку, или false в противном случае.
        float x;
        x = in.nextFloat();
        if (x>=3 && x<=8) System.out.println("true");
        else  System.out.println("false");

        // На числовой прямой даны два отрезка [−3;5] и [9;15]. Требуется определить, принадлежит ли точка x любому из данных отрезков.
        // Выходные данные : Выведите true, если точка x принадлежит любому из данных отрезков, или false в противном случае.
    /*  float x;
        x = in.nextFloat();
        if ((x>=-3 && x<=5) || (x>=9 && x<=15)) System.out.println("true");
        else System.out.println("false"); */

        // На числовой прямой даны два отрезка [−2;3] и [6;9]. Требуется определить, что точка x НЕ принадлежит ни одному из данных отрезков.
        // Выходные данные : Выведите true, если точка x НЕ принадлежит ни одному из данных отрезков, или false в противном случае.
    /*  float x;
        x = in.nextFloat();
        if ((x>=-2 && x<=3) || (x>=6 && x<=9)) System.out.println("false");
        else System.out.println("true"); */

        // Дано целое число. Требуется определить, является ли данное число трехзначным положительным числом, кратным пяти..
        // Выходные данные : Выведите true, если данное число является трехзначным положительным числом, кратным пяти, или false в противном случае.
    /*  float x;
        x = in.nextFloat();
        if ((x%1000==x)&&(x%10 !=x)&&(x%100 != x)&&(x>0)) {
            if (x % 5 == 0) System.out.println("true");
            else System.out.println("false");
        } else System.out.println("false"); */

        // Даны 4 целых числа. Требуется определить, есть ли среди этих чисел взаимно противоположные (0 противоположен сам себе).
        // Выходные данные : Выведите true, если среди данных чисел есть взаимно противоположные, или false в противном случае.
    /*  float []a = new float[4];
        int m = 0;
        for (int i = 0; i<4; i=i+1) {
            a[i] = in.nextFloat();
        }
        for (int i = 0; i <4; i=i+1)
            for (int j = 0; j < 3; j++){
                if (a[i] != 0){
                if ((0-a[i])==a[j]) { m = m+1;}}
            }
        if (m >0) System.out.println("true");
        else System.out.println("false"); */

        // Даны 3 целых числа. Требуется определить, есть ли среди этих чисел хотя бы два четных.
        // Выходные данные : Выведите true, если среди данных чисел есть хотя бы два четных, или false в противном случае.
    /*  float []a = new float[3];
        int m = 0;
        for (int i = 0; i<3; i=i+1) {
            a[i] = in.nextFloat();
        }
        for (int i = 0; i <3; i=i+1) {
                if (a[i] != 0){
                if (a[i]%2==0) { m = m+1;}}}
        if (m >=2) System.out.println("true");
        else System.out.println("false"); */

    }
}

