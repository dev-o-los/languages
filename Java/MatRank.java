package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatRank {

    static int[][] mat = {};

    int[][] getDimension() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:-");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols:-");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element" + '[' + i + ']' + '[' + j + ']' + ":-");
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    public static void main(String[] args) {
        MatRank matRank = new MatRank();
        mat = matRank.getDimension();
        matRank.echelonForm();
        matRank.findRank();
    }

    void echelonForm() {
        int row = mat.length;
        printMat();

        if (mat[0][0] != 1) {
            // get the row with one
            int rowWith1 = findRowWithElement1(row - 1);
            System.out.println("Swapping Row " + 1 + " with Row " + (rowWith1 + 1));
            // swapping row
            if (rowWith1 != -1) {
                swapRows(0, rowWith1);
                printMat();
            }
        }
        for (int i = 0; i < 2; i++) {
            List<List<Integer>> list = expressionWriter(row, i, i + 1, mat[i][i]);
            // System.out.println(list);
            expressionExecutioner(list, i + 1, i);
            printMat();
        }
    }

    void findRank() {
        int rank = 0;
        for (int[] row : mat) {
            boolean isNonZero = false;
            for (int ele : row) {
                if (ele != 0) {
                    isNonZero = true;
                    break;
                }
            }
            if (isNonZero) {
                rank++;
            }
        }
        System.out.println("Rank of the given matrix is: " + rank);
    }

    void expressionExecutioner(List<List<Integer>> list, int stepCounter, int helperRowNo) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) != 0) {
                updateRow(list.get(i).get(0), list.get(i).get(1), i + stepCounter, helperRowNo);
            }
        }
    }

    void updateRow(int multiplier1, int multiplier2, int r2, int helperRowNo) {
        int[] helperRow = mat[helperRowNo];
        int[] changingRow = mat[r2];

        for (int i = 0; i < helperRow.length; i++) {
            changingRow[i] = multiplier1 * changingRow[i] - multiplier2 * helperRow[i];
        }
    }

    List<List<Integer>> expressionWriter(int row, int colno, int startFrom, int element) {
        final List<List<Integer>> listofLists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int ele1 = element;
        for (int i = startFrom; i < row; i++) {
            int ele2 = mat[i][colno];
            if (ele2 > 0) {
                System.out
                        .println("R" + (i + 1) + " = " + (ele1 != 1 ? ele1 : "") + "R" + (i + 1) + " - "
                                + (ele2 != 1 ? ele2 : "") + "R"
                                + (colno + 1));
                list.add(ele1);
                list.add(ele2);
                listofLists.add(List.copyOf(list));
                list.clear();
            } else if (ele2 == 0) {
                list.add(0);
                listofLists.add(List.copyOf(list));
                list.clear();
            } else if (ele2 < 0) {
                System.out.println("R" + (i + 1) + " = " + (ele1 != 1 ? ele1 : "") + "R" + (i + 1) + " + "
                        + (ele2 != 1 ? Math.abs(ele2) : "") + "R" + (colno + 1));
                list.add(ele1);
                list.add(ele2);
                listofLists.add(List.copyOf(list));
                list.clear();
            }
        }
        return listofLists;
    }

    int findRowWithElement1(int rows) {
        if (mat[rows][0] == 1) {
            return rows;
        } else {
            if (rows > 0) {
                return findRowWithElement1(rows - 1);
            } else {
                return -1;
            }
        }
    }

    void swapRows(int rowToSwapFrom, int rowToSwapTo) {
        int[] temp = mat[rowToSwapTo];
        mat[rowToSwapTo] = mat[rowToSwapFrom];
        mat[rowToSwapFrom] = temp;
    }

    void printMat() {
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
