import java.util.Scanner;
public class object {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Дано натуральное число. Выведите его последнюю цифру.
        int a;
        a = in.nextInt();
        System.out.println(a%10);
        // Дано трехзначное число, найдите сумму его цифр
    /*  int a;
        int b;
        int c;
        int x;
        x = in.nextInt();
        a = x % 10;
        b = (x/10)%10;
        c = x/100;
        System.out.println(a+b+c); */
        // Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.
    /*  int a;
        int x;
        x = in.nextInt();
        a = (x/2 + 1)*2;
        System.out.println(a); */
        // Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
    /*  int a;
        int b;
        int n;
        int b1;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        b1 = (b*n)%100;
        int c = (int)(b*n/100.0);
        a = a * n + c;
        System.out.println(a+" "+b1); */
        // Электронные часы показывают время в формате h:mm:ss, то есть сначала записывается количество часов, потом обязательно двузначное количество минут, затем обязательно двузначное количество секунд. Количество минут и секунд при необходимости дополняются до двузначного числа нулями.С начала суток прошло n секунд. Выведите, что покажут часы.
    /*  int h;
        int m;
        int s;
        int x;
        x = in.nextInt();
        s = x % 60;
        m = (x / 60) % 60;
        h = (x / 3600)%24;
        if (m < 10 && s < 10) {
            System.out.println(h + ":0" + m + ":0" + s);
        } else if (m < 10) {
            System.out.println(h + ":0" + m + ":" + s);
        } else {
            if (s < 10) {
                System.out.println(h + ":" + m + ":0" + s);
            } else {
                System.out.println(h + ":" + m + ":" + s);
            }
        } */
        // Дополнительные задания
        // Дано натуральное число N. Требуется определить младшую цифру в десятичной записи числа N.
    /*  int x;
        x = in.nextInt();
        System.out.println(x%10); */
        // Дано двухзначное натуральное число N. Требуется определить количество десятков в десятичной записи числа N.
    /*  int m;
        int x;
        x = in.nextInt();
        m = (int)(x/10.0);
        System.out.println(m); */
        // Дано трехзначное натуральное число N. Требуется определить сумму цифр в десятичной записи числа N
    /*  int x;
        x = in.nextInt();
        System.out.println((x/100)+((x/10)%10)+(x%10)); */
        // Дан прямоугольник со сторонами A и B. Требуется вычислить квадрат диагонали прямоугольника
    /*  int a;
        int b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a*a+b*b); */
    }
}
