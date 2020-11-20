import java.util.Scanner;
public class object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Дан массив N × M. Требуется повернуть его по часовой стрелке на 90 градусов.
        /* int N = in.nextInt(), M = in.nextInt();
        double [][] arr = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        double[][] izm = new double[M][N];
        System.out.println(M + " " + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                izm[i][j] = arr[N - j - 1][i];
                if (izm[i][j] - (int) izm[i][j] != 0) {
                    System.out.print(izm[i][j] + " ");
                } else {
                    System.out.printf("%.0f",izm[i][j]);System.out.print(" ");
                }
            }
            System.out.print("\n");
        }*/

        // Дано число n, n  100 . Создайте массив n×n и заполните его по следующему правилу:
        // - числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
        // - числа, стоящие выше этой диагонали, равны 0;
        // - числа, стоящие ниже этой диагонали, равны 2.
        /* int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) a[i][j] = 1;
                else if (i + j < n - 1) a[i][j] = 0;
                else if (i + j > n - 1) a[i][j] = 2;
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }*/

        //Проверьте, является ли двумерный массив симметричным относительно главной диагонали. Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
        /*int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "yes" : "no");*/

        //Даны два числа n и m.
        //Создайте двумерный массив A[n][m], заполните его таблицей умножения A[i][j]=i*j и выведите на экран.
        //При этом нельзя использовать вложенные циклы, все заполнение массива должно производиться одним циклом.
        /**/

        //Заполнение матрицы змейкой
        /*int n = in.nextInt(), m = in.nextInt(), s = 0;
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = s++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) System.out.printf("%3d", A[i][j]);
                else System.out.printf("%3d", A[i][m - j - 1]);
            }
            System.out.print("\n");
        }*/

        //Заполнение матрицы спиралью
        int n = in.nextInt(), size = 2 * n + 1;
        int[][] A = new int[size][size];
        int j = n, sup = 0, count = 0;
        for (int i = j; i >= 0; i--) {
            int i_sup = i;
            while (count <= sup) {
                A[i_sup][j] = count++;
                if (j > i && i_sup == i && count <= sup) {
                    j--;
                }
                else if (j == i && i_sup < size - 1 - i) {
                    i_sup++;
                }
                else if (i_sup == size - 1 - i && j < size - 1 - i) {
                    j++;
                }
                else if (j == size - 1 - i && i_sup > i) {
                    i_sup--;
                }
            }
            sup += (n - i + 1) * 8;
        }
        for (int i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
}