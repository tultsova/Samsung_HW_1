import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Напишите программу, которая обнуляет заданное количество последних бит числа.
        int x,i;
        x = in.nextInt();
        i = in.nextInt();
        x >>= i;
        x <<=i;
        System.out.print(x);
        // Напишите программу, вычисляющую заданную степень числа 2, используя битовые операции.
    /*  long x,i;
        x = 2;
        i = in.nextInt();
        if (i == 0) {System.out.println(1);}
        else { x <<=(i-1);
        System.out.print(x);} */
        // Напишите программу, которая в заданном целом числе A устанавливает значение бита под номером i равным 1. Биты нумеруются с нуля, начиная от младших.
    /*  long x;
        int i;
        x = in.nextLong();
        i = in.nextInt();
        x |= 1<<i;
        System.out.println(x); */
        // Напишите программу, которая инвертирует i-ый бит в заданном числе A. Биты нумеруются с 0, начиная с младших
    /*  int x;
        int i;
        x = in.nextInt();
        i = in.nextInt();
        x ^= (1<<i);
        System.out.println(x); */
        // Напишите программу, обнуляющие все биты целого числа А, кроме i младших бит.
    /*  int x;
        int i;
        x = in.nextInt();
        i = in.nextInt();
        x &= ((1<<i)-1);
        System.out.println(x); */
        // Дано натуральное число N. Определите является ли число N точной степенью числа 2. Операцией возведения в степень пользоваться нельзя!
    /*  int x;
        x = in.nextInt();
        if ((x>0)&&((x&(x-1))==0)) System.out.println("YES");
        else System.out.println("NO"); */
    }
}
