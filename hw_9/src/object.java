import java.awt.*;
import java.util.Scanner;
public class object {

    // Напишите функцию, которая принимает на вход двузначное натуральное число и возвращает сумму его цифр.
   /* public static int Summa(int a){
        return a%10+a/10;
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        System.out.print(Summa(m));
    }*/

    //Напишите функцию, которая вычисляет сумму цифр во всех двузначных натуральных числах, кратных 7.
    /*public static int Summa(int a){
        return a%10+a/10;
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10, sum=0;
        for (num=10; num<100; num++){
            if (num%7==0) sum=sum+Summa(num);
        }
        System.out.print(sum);
    }*/

    //Напишите функцию, которая для заданного трехзначного натурального числа X вычисляет количество трехзначных натуральных чисел, меньших X, сумма цифр которых кратна 13-ти.
    /*public static int Summa(int a){
        return a%10+(a/10)%10+a/100;
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  sum=0, x=in.nextInt();
        for (int num=100; num<x; num++){
            if (Summa(num)%13==0) sum++;
        }
        System.out.print(sum);
    }*/

    // Напишите функцию, которая получает на вход вещественное число X (double, 0<X<1) и натуральное число N и выводит на экран N первых двоичных разрядов дробной части числа X.
   /* public static void dv(double x,int n){
      for (int i =0; i<n;i++) {
       x*=2;
       System.out.print((int)x);
       if (x>=1) x--;
      }
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
       double x=in.nextDouble();
       int n = in.nextInt();
       dv(x,n);
    }*/

    //Напишите функцию, которая получает на вход целочисленный массив и вычисляет среднее арифметическое элементов массива, которые являются четырехзначными натуральными числами.
    //Если в массиве нет таких чисел, функция должна вернуть число -1.
    //В главной программе:
    //Сначала запросите с клавиатуры число элементов массива (N).
    //Затем создайте целочисленный массив из N элементов и введите его значения с клавиатуры.
    //После этого передайте этот массив на вход указанной функции и выведите результат функции на экран. Выводите ответ с точностью 2 знача после запятой.
    /* public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float sum=0,per=0;
        int[] a= new int [n];
        for (int i=0;i<n;i++) {
            a[i]=in.nextInt();}
        for (int i=0;i<n;i++) {
            if (a[i]<10000 && a[i]>999) {sum += a[i]; per++;}
        }
        if (sum !=0 && per!=0) {float otv=sum/per; System.out.printf("%.2f",otv);}
        else System.out.print("-1.00");
    }*/

    //Напишите функцию, которая получает на вход целочисленный массив, находит наименьший элемент массива и переставляет его в начало массива (под индексом 0). Остальные элементы сдвигаются, соответственно, вправо, на одну позицию. Если в массиве несколько одинаковых наименьших элементов, переставлять нужно тот из них, который имеет наименьший номер.
    //В главной программе:
    //Сначала запросите с клавиатуры число элементов массива (N).
    //Затем создайте целочисленный массив из N элементов и введите его значения с клавиатуры.
    //После этого передайте этот массив на вход указанной функции.
    //После окончания работы функции выведите массив на экран.
    //Не будет считаться правильным решение, которое просто выводит элементы массива в нужном порядке, не переставляя элементы массива в памяти так, как указано.
    /* public static void mass(int arr[]) {
        int min = 2147483647, min_i = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_i = i;
            }
        }
        for (int i = min_i; i > 0; i--) {
            arr[i] ^= arr[i - 1];
            arr[i - 1] ^= arr[i];
            arr[i] ^= arr[i - 1];
        }
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] =in.nextInt();
        }
        mass(arr);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    //Дополнительные задания
    //Напишите функцию, вычисляющую длину отр,езка по координатам его концов. С помощью этой функции напишите программу, вычисляющую периметр треугольника по координатам трех его вершин.
    /*public static double dlina(int a,int b,int c,int d){
        return Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1=in.nextInt(), y1= in.nextInt(), x2=in.nextInt(), y2= in.nextInt(), x3=in.nextInt(), y3= in.nextInt();
        double a=0,b=0,c=0,p=0;
        a=dlina(x1,y1,x2,y2);
        b=dlina(x2,y2,x3,y3);
        c=dlina(x3,y3,x1,y1); p=a+b+c;
        System.out.printf("%.10f", p);
    }*/
    public static int min (int a, int b, int c, int d) {
        int min = 2147483647;
        if (min > a) min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        return min;
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1=in.nextInt(), y1= in.nextInt(), x2=in.nextInt(), y2= in.nextInt();
        System.out.println(min(x1,y1,x2,y2));
    }

}
