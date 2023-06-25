package Java.Board_Programs;

import java.util.Scanner;

public class OctMatrix {

    static int rows, col;
    static int[][] mat;

    public static void initiateMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        rows = sc.nextInt();
        System.out.println("Enter num of col");
        col = sc.nextInt();
        mat = new int[rows][col];
        System.out.println("Enter elements from (0-7) only");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                int ele = sc.nextInt();
                if (ele < 0 || ele > 7) {
                    System.out.println("Invalid Input , re-enter");
                    j--;
                    continue;
                } else {
                    mat[i][j] = ele;
                }
            }
        }
        sc.close();
    }

    static void displaymat() {
        for (int i = 0; i < rows; i++) {
            int deceq = 0, counter = col;
            for (int j = 0; j < col; j++) {
                deceq += mat[i][j] * (int) Math.pow(8, (counter - 1));
                counter--;
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("Decimal equivalent = " + deceq);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initiateMatrix();
        displaymat();
    }
}
