import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // С клавиатуры вводятся целые числа, пока не будет введено отрицательное число.
        int x, sum = 0;
        x = in.nextInt();
        do {
            sum++;
            if (x < 0) {
                System.out.print(sum);
                break;
            } else x = in.nextInt();
        } while (x < 0 || x >= 0);

        // С клавиатуры вводятся натуральные числа, пока не будет введено число, делящееся на 5.
    /*int x,sum=0;
        x = in.nextInt();
        do {
            if (x>10) sum=sum+x;
            if (x%5==0) {System.out.print(sum); break;}
            else x=in.nextInt();
        } while (x<0 || x>=0); */

        // Вывести на экран сумму тех введенных чисел, которые больше 10.
    /*int x,sum=0;
        x = in.nextInt();
        do {
            if (x/100<=0 && x/10>0) {sum=sum+x%10+x/10; x=in.nextInt();}
            else {System.out.print(sum); break;}
        } while (x<0 || x>=0); */

        // Вывести на экран частное и остаток от деления A на B, не используя операцию деления.
    /*int a,del=0,b,ost=0;
        a = in.nextInt();
        b = in.nextInt();
        if (a>=b) {while(a>=b) {
            del++;
            a=a-b;
        }  if (a==0) ost=0; else ost = a;}
        else if (a<b) {del=0; ost=a;}
        System.out.println(del+" "+ost); */

        // С клавиатуры вводится натуральное число. Вывести на экран количество цифр в двоичном представлении числа.

        /* int a,del=0;
        a = in.nextInt();
        while (a>0) {
            del++;
            a=a/2;
        }
        System.out.print(del); */

        // Найти сумму всех четных чисел в диапазоне от 25 до N.
/*     int N, sum=0;
        N = in.nextInt();
        for (int i=1; i<(N-25); i++) {
            if ((25+i)%2==0) sum=sum+25+i;
        }
         System.out.print(sum);*/

        // Вывести на экран количество десятичных цифр в числе.
/*   int a,del=0;
        a = in.nextInt();
        while (a>0) {
            del++;
            a=a/10;
        }
        System.out.print(del);*/

        // С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<109). Вывести на экран самую младшую нечетную цифру в десятичном представлении числа. Если в числе нет нечетных цифр, вывести "NO".
/*  int n, ch=0;
       n = in.nextInt();
       while (n>0) {
           if ((n%10)%2 !=0) if ((n%10)%2 > ch) ch=n%10;
           n=n/10;
       }
       if (ch>0) System.out.print(ch);
       else System.out.print("NO");*/

        // С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<109). Вывести на экран самую маленькую положительную цифру в десятичном представлении числа.
/*  int n, ch=10;
        n = in.nextInt();
        while (n>0) {
            if ((n%10) < ch && (n%10)!=0) ch=n%10;
            n=n/10;
        }
        System.out.print(ch);*/
        // Ввести с клавиатуры натуральное число N (N<1000). Вывести на экран наименьшее простое число, которое больше чем N.
    /* int N = in.nextInt(), simp;
        boolean flag = true;
        for (simp = N + 1; flag; simp++) {
            for (int i = 2; i < simp; i++) {
                if (simp % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        System.out.println(--simp); */


        // Дополнительные задания

        /* Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников
        олимпиады.Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не
        умещаются)высотой 437 сантиметров.На экскурсионном маршруте встречаются N мостов.Жюри и оргкомитет олимпиады
        очень обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них.Им удалось
        выяснить точную высоту каждого из мостов.Автобус может проехать под мостом тогда и только тогда, когда
        высота моста превосходит высоту автобуса.Помогите организаторам узнать, закончится ли экскурсия благополучно, а
        если нет, то установить, где произойдет авария. */

/*int N = in.nextInt(), t = 0;
        for (int i = 1; i <= N; i++) {
            t = in.nextInt();
            if (t <= 437){
                System.out.println("Crash " + i);
                break;
            }
        }
        if (t > 437) {
            System.out.println("No crash");
        }*/


        // Напишите программу, которая вводит два целых числа и находит их произведение, не используя операцию умножения.Учтите, что числа могут быть отрицательными.
/* int a = in.nextInt(), b = in.nextInt(), rez = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            rez += Math.abs(a);
        }
        System.out.println(a >= 0 && b >= 0 || a < 0 && b < 0 ? rez : -rez); */

       // Напишите программу, которая вводит натуральное число N и выводит первые N чётных натуральных чисел.
/* int N = in.nextInt(),zn=0;
        for (int i = 2; zn < N; i++) {
            if (i%2==0) {System.out.print(i+" ");
            zn++;}
        }*/

        // Напишите программу, которая вводит четыре натуральных числа (a, b, c и d)и находит все пятизначные числа, которые при делении на a дают в остатке b, а при делении на c дают в остатке d .
        /* int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        boolean cont = true;
        for (int i = 10000; i <= 99999; i++) {
            if (i % a == b && i % c == d) {
                System.out.print(i + " ");
                cont = false;
            }
        }
        if (cont) {
            System.out.println(-1);
        } */


       // Напишите программу, которая считает сумму цифр введённого числа.
        /*int a = in.nextInt(), sum=0,m=0;
        while (a>0) {
            m=a%10;
            sum=sum+m;
            a=a/10;
        }
        System.out.print(sum);*/

       // Напишите программу, которая определяет, верно ли, что введённое число содержит две одинаковых цифры, стоящие рядом(как, например, 221).
 /* int a = in.nextInt();
        int c=0;
        while (a>0) {
            if ((a/10)%10==(a%10))  c++;
            a=a/10;
        } System.out.println(c>0 ? "YES" : "NO"); */

        // Проверьте, является ли число простым. Необходимо вывести строку prime, если число простое, или composite, если число составное
 /*  int num = in.nextInt(), i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("composite");
                break;
            }
        }
        if (i == num) {
            System.out.println("prime");
        }*/

        // Реализуйте алгоритм быстрого возведения в степень.  Нельзя использовать стандартное возведение в степень.
    /* int a = in.nextInt(), rez = a, m=1,c=1;
        long i, n = in.nextLong();
        if (n%2==0) {
            for (i=0; i<n/2; i++) m *=a;
            rez=m*m;
        } else {for (i=0; i<n-1; i++) c *=a;
        rez=c*a;}
        System.out.println(rez);

*/
    }
}
