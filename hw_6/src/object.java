import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Введите с клавиатуры целое число. Выведите на экран, к какой категории оно относится: "DIGIT", если это однозначное неотрицательное число; "NUM", если это двузначное число положительное число; "OTHER", если оно не относится к первым двум категориям.
        int x;
        x = in.nextInt();
        if (x >= 0 && x / 10 == 0) System.out.println("DIGIT");
        else if (x > 0 && x / 100 == 0) System.out.println("NUM");
        else System.out.println("OTHER");

        // Даны три различных целых числа. Требуется вывести их в стандартный поток вывода в порядке возрастания. Не разрешается пользоваться функциями min/max и подобным им, а также оператором присваивания (за исключением ввода исходных чисел).
    /*  int x, a, b,m=0;
        x = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        if (x>=a) m++;
        else if (x<=a) m=m+2;
        switch(m){
            case 1:
                if (b>=x) System.out.println(a+" "+x+" "+b);
                else if (a<=b && b<=x) System.out.println(a+" "+b+" "+x);
                else if (b<=a) System.out.println(b+" "+a+" "+x);
                break;
            case 2:
                if (b>=a) System.out.println(x+" "+a+" "+b);
                else if (x<=b && b<=a) System.out.println(x+" "+b+" "+a);
                else if (b<=x) System.out.println(b+" "+x+" "+a);
        } */

        // Выведите на экран окончание порядкового числительного во фразе вида "сколько тортов?". Выводите латинскими буквами.
    /*  int x, m = 0;
        x = in.nextInt();
        m = x % 10;
        if (x % 100 <11 || x%100>19) {
            switch (m) {
                case 1:
                    System.out.println(x + " TOPT");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(x + " TOPTA");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println(x + " TOPTOB");
                    break;
            }
        } else System.out.println(x+" TOPTOB"); */

        // Выведите на экран решение неравенства "A|x|+B>0".Числа выводите с точностью 1 знак после запятой.
    /*  float A,B;
        A = in.nextFloat();
        B = in.nextFloat();
        if ((A==0 && B<=0) || (A<0 && B<0)) System.out.println("no such x");
        else if (A>=0 && B>0)  System.out.println("any x");
        else if (A>0 && B<0) {System.out.print("x<");System.out.printf("%.1f",B/A); System.out.print(" or x>"); System.out.printf("%.1f",(-B/A));}
        else if (A<0 && B>0) {System.out.printf("%.1f",B/A); System.out.print("<x<"); System.out.printf("%.1f",(-B/A));} */


        // Дополнительные задания
        // Напишите программу, которая вводит с клавиатуры номер месяца и определяет, сколько дней в этом месяце. При вводе неверного номера месяца должно быть выведено сообщение об ошибке. Считается, что год невисокосный/
    /*  int m;
        m = in.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30");
                break;
            case 2:
                System.out.print("28");
                break;
            default: System.out.print("0");
                break;
        } */

        // Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
    /* int m,d, ost=0;
        m = in.nextInt();
        d = in.nextInt();
        switch (m) {
            case 1: if (d<=31) System.out.println(365-d); else System.out.print("-1"); break;
            case 2: if (d<=28) System.out.println(334-d); else System.out.print("-1"); break;
            case 3: if (d<=31) System.out.println(306-d); else System.out.print("-1"); break;
            case 4: if (d<=30) System.out.println(275-d); else System.out.print("-1"); break;
            case 5: if (d<=31) System.out.println(245-d); else System.out.print("-1"); break;
            case 6: if (d<=30) System.out.println(214-d); else System.out.print("-1"); break;
            case 7: if (d<=31) System.out.println(184-d); else System.out.print("-1"); break;
            case 8: if (d<=31) System.out.println(153-d); else System.out.print("-1"); break;
            case 9: if (d<=30) System.out.println(122-d); else System.out.print("-1"); break;
            case 10: if (d<=31) System.out.println(92-d); else System.out.print("-1"); break;
            case 11: if (d<=30) System.out.println(61-d); else System.out.print("-1"); break;
            case 12: if (d<=31) System.out.println(31-d); else System.out.print("-1"); break;
            default: System.out.print("-1");
                break;
        } */

        // Дано число X. Требуется перевести это число в римскую систему счисления.
    /*  int m,d=0, ost=0;
        String sum="";
        m = in.nextInt();
        if (m%10>0) {
            switch (m % 10) {
                case 1: sum = "I";break;
                case 2: sum = "II";break;
                case 3: sum = "III";break;
                case 4: sum = "IV";break;
                case 5: sum = "V";break;
                case 6: sum = "VI";break;
                case 7: sum = "VII";break;
                case 8: sum = "VIII";break;
                case 9: sum = "IX"; break;
            }
        }
        d = m/10;
        if (m/10>0) {
            switch (d % 10) {
                case 1: sum = "X"+sum;break;
                case 2: sum = "XX"+sum;break;
                case 3: sum = "XXX"+sum;break;
                case 4: sum = "XL"+sum;break;
                case 5: sum = "L"+sum;break;
                case 6: sum = "LX"+sum;break;
                case 7: sum = "LXX"+sum;break;
                case 8: sum = "LXXX"+sum;break;
                case 9: sum = "XC"+sum; break;
            }
        } if (m/100!=0) sum="C"+sum; System.out.print(sum); */

        // Даны три целых числа, каждое записано в отдельной строке. Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
    /* int x, a, b,m=0;
        x = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        if (x>=a) m++;
        else if (x<=a) m=m+2;
        switch(m){
            case 1:
                if (b>=x) System.out.println(b);
                else if (a<=b && b<=x) System.out.println(x);
                else if (b<=a) System.out.println(x);
                break;
            case 2:
                if (b>=a) System.out.println(b);
                else if (x<=b && b<=a) System.out.println(a);
                else if (b<=x) System.out.println(a);
        }
    } */
        // Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания. Программа должна считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.
    /*  int x, a, b,m=0;
        x = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        if (x>=a) m++;
        else if (x<=a) m=m+2;
        switch(m){
            case 1:
                if (b>=x) System.out.println(a+" "+x+" "+b);
                else if (a<=b && b<=x) System.out.println(a+" "+b+" "+x);
                else if (b<=a) System.out.println(b+" "+a+" "+x);
                break;
            case 2:
                if (b>=a) System.out.println(x+" "+a+" "+b);
                else if (x<=b && b<=a) System.out.println(x+" "+b+" "+a);
                else if (b<=x) System.out.println(b+" "+x+" "+a);
        } */

        // Определите тип треугольника (остроугольный, тупоугольный, прямоугольный)
        // Даны три натуральных числа – стороны треугольника.
        // Необходимо вывести одно из слов: right для прямоугольного треугольника, acute для остроугольного треугольника, obtuse для тупоугольного треугольника или impossible, если входные числа не образуют треугольника.
    /* int c, a, b,m=0, n1=0,n2=0;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
       m = Math.max(a, b);
       m = Math.max(m, c);
       if (m==a)  {n1=b; n2=c;}
       else if (m==b) {n1=a; n2=c;}
       else {n1=a;n2=b;}
        if ((a<b+c)&&(b<a+c)&&(c<b+a))
        {
            if (m*m==n1*n1+n2*n2) System.out.print("rigth");
             else if (m*m<=n1*n1+n2*n2) System.out.print("acute");
             else  if (m*m>=n1*n1+n2*n2) System.out.print("obtuse");
        }
        else System.out.print("impossible"); */


    }
}