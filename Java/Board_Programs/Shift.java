package Java.Board_Programs;

import java.util.Scanner;

public class Shift {
    int[][] mat;
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mat");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void cyclic(Shift P) {
        int[][] temp = new int[P.m][P.n];
        int k = 2;
        for (int i = 0; i < P.m; i++) {
            for (int j = 0; j < P.n; j++) {
                temp[i][j] = P.mat[k][j];
            }
            k--;
        }
        for (int i = 0; i < P.m; i++) {
            for (int j = 0; j < P.n; j++) {
                P.mat[i][j] = temp[i][j];
            }
        }
    }

    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Shift obj = new Shift(3, 3);
        obj.input();
        obj.cyclic(obj);
        obj.display();
    }
}
