import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Напишите программу, которая определяет, верно ли, что введённое число содержит по крайней мере две одинаковых цифры, возможно, не стоящие рядом (как, например, 212).
        /*int a = in.nextInt();
        boolean metka = false;
        for (int i = 1; a > a % i; i *= 10) {
            int ts = (a % (i * 10) - a % i) / i;
            for (int j = i * 10; a > a % j; j *= 10) {
                if (ts == (a % (j * 10) - a % j) / j) {
                    metka = true;
                    break;
                }
            }
            if (metka) {
                break;
            }
        }
        System.out.println(metka ? "YES" : "NO");*/

        //Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел, формулируется так: нужно заменять большее число на разность большего и меньшего до тех пор, пока одно из них не станет равно нулю; тогда второе и есть НОД. Напишите программу, которая реализует этот алгоритм.
        /*int a=in.nextInt(), b=in.nextInt(), min=0;
        while (a != 0 && b != 0)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
            min++;
        }
        System.out.println((a + b) + " " + min);*/

        //Напишите программу которая выводит все простые числа в диапазоне от а до б
        /*int a = in.nextInt(), b = in.nextInt();
        boolean metka = false;
        int[] arr = new int[b - a+1];
        for (int i = 0; i < b - a+1; i++) arr[i] = a + i;
        for (int i = 0; i < b - a+1; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    arr[i] = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < b - a+1; i++) {
            if (arr[i] != 0) {System.out.print(arr[i] + " "); metka=true;}
        }if (!metka) System.out.print(0);*/

        //В магазине продается мастика в ящиках по a кг (тип 1), b кг (тип 2) и c кг (тип 3). Как купить ровно N кг мастики, не вскрывая ящики? Сколькими способами можно это сделать?
        //Входная строка содержит четыре числа, разделённые пробелами: a , b , c и N .
        //В первой строке нужно вывести число K способов, которыми можно купить заданное количество мастики ( N кг), не вскрывая ящики.
        // В каждой из последующих K строчек программа должна вывести (через пробелы) три числа, k a , k b и k c :
        // количество ящиков 1, 2 и 3 типов для каждого из K вариантов закупки. Варианты должны выводиться в лексикографическом порядке:
        // сначала варианты с наименьшим значением k a , для одинаковых k a – сначала варианты с наименьшим значением k b и т.д.
        /* int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), N = in.nextInt(), count = 0;
        for (int i = 0; i <= N / a; i++) {
            for (int j = 0; j <= N / b; j++) {
                for (int k = 0; k <= N / c; k++) {
                    if (i * a + j * b + c * k == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i <= N / a; i++) {
            for (int j = 0; j <= N / b; j++) {
                for (int k = 0; k <= N / c; k++) {
                    if (i * a + j * b + c * k == N) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }*/

        //Последовательность состоит из натуральных чисел и завершается числом 0.
        // Всего вводится не более 10000 чисел (не считая завершающего числа 0).
        // Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
        /*int[] arr = new int[10001];
        int max = -2147483648, i;
        for (i = 0; i < 10001; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                break;
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] == max) {
                sum++;
            }
        }
        System.out.println(sum);*/
        //Дана последовательность натуральных чисел, завершающаяся число 0.
        //Определите наибольшую длину монотонного фрагмента последовательности
        //(то есть такого фрагмента, где все элементы либо больше предыдущего, либо меньше).
        int[] arr = new int[10001];
        int i, count = 0, max = 0;
        boolean rise = false, fall = false;
        for (i = 0; i < 10001; i++) {
            if (count > max) {
                max = count;
            }

            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                break;
            }
            else if (i == 0) {
                count = 1;
            }
            else if (arr[i] > arr[i - 1]) {
                if (!rise) {
                    fall = false;
                    rise = true;
                    count = 1;
                }
                count++;
            }
            else if (arr[i] < arr[i - 1]) {
                if (!fall) {
                    fall = true;
                    rise = false;
                    count = 1;
                }
                count++;
            }
            else if (arr[i] == arr[i - 1]) {
                fall = false;
                rise = false;
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}

