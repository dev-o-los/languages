package Java.Board_Programs;

import java.util.Scanner;

public class SymmetricMatrix {

    public static int[][] initiateMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int rows = sc.nextInt();
        System.out.println("Enter num of col");
        int col = sc.nextInt();
        int[][] mat = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                int ele = sc.nextInt();
                mat[i][j] = ele;
            }
        }
        sc.close();
        return mat;
    }

    static int[][] transpose(int[][] mat) {
        int[][] mattranspose = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mattranspose[i][j] = mat[j][i];
            }
        }
        return mattranspose;
    }

    static boolean equalmat(int a[][], int b[][]) {
        int r1 = a.length, r2 = b.length, c1 = a[0].length, c2 = a[0].length;
        if (r1 != r2 || c1 != c2) {
            return false;
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    if (a[i][j] != b[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static void displaymat(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] orgmat = initiateMatrix();
        System.out.println("Original matrix");
        displaymat(orgmat);
        System.out.println("Transpose of matrix");
        int[][] transposemat = transpose(orgmat);
        displaymat(transposemat);
        if (equalmat(orgmat, transposemat)) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }

}
