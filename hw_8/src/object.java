import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Введите с клавиатуры целое число X.
        // Выведите на экран номер элемента массива, который равен X. Если таких элементов несколько, выведите меньший номер.
        // Выводить на экран номер элемента, который считается от 1.
        /*int x = in.nextInt();
        int Arr[] = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int X = in.nextInt(), result = 0;
        for (int i = 0; i < x; i++) {
            if (Arr[i] == X) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result == 0 ? "NO" : result);*/

        // Выведите на экран сумму четных элементов массива.
    /*int x = in.nextInt();
        int Arr[] = new int [x], result = 0;
        boolean flag = false;
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
            if (Arr[i] % 2 == 0) {
                result += Arr[i];
                flag = true;
            }
        }
        System.out.println(flag ? result : "NO"); */

        // Выведите на экран среднее арифметическое элементов массива, имеющих нечетное значение.
        //Ответ выведите с точностью 2 знака после запятой. Если в массиве нет нечетных элементов, выведите "NO".
    /* int x = in.nextInt();
        int Arr[] = new int [x], count = 0;
        float result = 0;
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
            if (Arr[i] % 2 != 0) {
                result += Arr[i];
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("%.2f", (result / count));
        }
        else {
            System.out.println("NO");} */

        //В этой задаче не нужно вводить с клавиатуры значения элементов массива.
        //Нужно заполнить значения элементов массива числами последовательности: 4, 7, 10, 13, 16, ,,, и вывести получившийся массив на экран.
        //Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран, не попадая в массив.
    /* int x = in.nextInt();
        int Arr[] = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = 4 + 3 * i;
            System.out.print(Arr[i] + " ");} */

        // Развернуть массив в обратную сторону ("задом наперед"). Последний элемент должен находится на месте начального и наоборот.
        //Не разрешается использовать дополнительный массив.
        //Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
    /*  int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = x - 1;
        for (int i = 0; i < count; i++) {
            Arr[i] ^= Arr[count];
            Arr[count] ^= Arr[i];
            Arr[i] ^= Arr[count];
            count--;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(Arr[i] + " ");} */

        //Вывести на экран значение самого часто повторяющегося элемента массива. Если в массиве несколько таких элементов, вывести из них тот, который имеет самый меньший номер.
    /* int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = 0, pos = 0;
        for (int i = 0; i < x; i++) {
            int sup = 0;
            for (int j = i + 1; j < x; j++) {
                if (Arr[i] == Arr[j]) {
                    sup++;
                }
            }
            if (sup > count) {
                count = sup;
                pos = i;
            }
        }
        System.out.println(Arr[pos]); */

        //Переместить в начало массива все отрицательные значения массива, не меняя их относительного положения.
        //То есть, каждый отрицательный элемент должен оказаться в том же порядке относительно всех отрицательных элементов, а каждый неотрицательный элемент -- в том же порядке относительно всех неотрицательных элементов.
    /*int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            if (Arr[i] < 0) {
                for (int j = i; j > count; j--) {
                    int sup = Arr[j - 1];
                    Arr[j - 1] = Arr[j];
                    Arr[j] = sup;
                }
                count++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(Arr[i] + " ");
        } */


        //Дополнительные задания часть 1
        //Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
        /*int n,l,k=0;
        n = in.nextInt(); l=n;
        while (l>0) {k++; l=l/2;}
        int[] obr=new int[k];
            for (int i=0; i <obr.length;i++) {
            int c = n%2;
            obr[i]=c;
            n=n/2;
            System.out.print(obr[i]);
            if (n<=0) break;} */

        //Для настольной игры используются карточки с номерами от 1 до N (N – натуральное число, не превышающее 106). Одна карточка потерялась. Найдите ее.
        //Входные данные: Дано N, далее N-1 номеров оставшихся карточек.
        /* int n;
        n= in.nextInt();
        int[] card = new int[n-1];
        int[] k = new int[n];
        int s=0;
        while (s<n) {k[s]=s+1; s++;}
        for (int i=0; i<card.length;i++) card[i]= in.nextInt();
        for (int i=0; i< k.length;i++) {
            boolean me = false;
             for (int j=0; j< card.length;j++) {
                if (k[i]==card[j])  {me=true; break;}
            }
            if (!me) System.out.print(k[i]);
            }*/

        // Вася записывает в клетки квадратной таблицы NxN натуральные числа по порядку, сначала заполняя первую строку слева направо, затем вторую и т.д. (см. рисунок слева). Петя заполняет такую же таблицу, расставляя числа сначала в первый столбец сверху вниз, затем во второй столбец и т.д.
        // Вам требуется написать программу, выводящую  все числа, которые в обеих таблицах записаны в одних и тех же клетках.
        /*int N = in.nextInt(), res = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(res + " ");
            for (int j = i; j < N; j++) {
                res++;
            }
            res += i + 1;
        }*/

        // Посчитайте n!
        /*int n=in.nextInt(),rez=1;
        for (int i=1; i<n+1;i++) {
            rez=rez*i;
        }
        System.out.print(rez);*/


        //Дополнительные задания часть  2
        // Дана последовательность натуральных чисел 1, 2, 3, ..., N (1 ≤ N ≤ 1000). Необходимо сначала расположить в обратном порядке часть этой последовательности от элемента с номером A до элемента с номером B, а затем от C до D (A < B; C < D; 1 ≤ A, B, C, D ≤ N).
        /*int n=in.nextInt(), a=in.nextInt(), b=in.nextInt(), c=in.nextInt(),d=in.nextInt();
        int[] pos = new int[n];
        for (int i=0;i<n;i++) pos[i]=i+1;
        int nl = 1;
        for (int i = a - 1; i < b - nl; i++) {
            int t=pos[i];
            pos[i]=pos[b-nl];
            pos[b-nl]=t;
            nl++;
        }
        nl = 1;
        for (int i = c - 1; i < d - nl; i++) {
            int t=pos[i];
            pos[i]=pos[d-nl];
            pos[d-nl]=t;
            nl++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(pos[i] + " ");
        }*/

        //Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0. Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).
        /*int n=in.nextInt();
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n;i+=2) System.out.print(a[i]+" ");*/

        //Дан массив, состоящий из целых чисел. Напишите программу, которая выводит те элементы массива, которые являются чётными числами.
        /*int n=in.nextInt();
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n;i++) if(a[i]%2==0) System.out.print(a[i]+" ");*/

        //Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитывает количество положительных чисел среди элементов массива.
        /*int n=in.nextInt(),rez=0;
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n;i++) if(a[i]>0) rez++;
        System.out.print(rez);*/

        //Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).
        /*int n=in.nextInt(),rez=0;
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n-1;i++) if(a[i]<a[i+1]) rez++;
        System.out.print(rez);*/

        // Вывести максимальное число в массиве
        /* int n=in.nextInt();
        long max=-2147483648;
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n;i++) if(a[i]>max) max=a[i];
        System.out.print(max);*/

        //Дан массив, состоящий из целых чисел. Известно, что числа упорядочены по неубыванию (то есть каждый следующий элемент не меньше предыдущего). Напишите программу, которая определит количество различных чисел в этом массиве.
        int n=in.nextInt();
        long raz=0;
        int[]a = new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        for (int i=0;i<n;i++)
                if (i>0) if (a[i]==a[i-1]) raz++;
        System.out.print(n-raz);
    }
}



