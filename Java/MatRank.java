package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatRank {

    int[][] getDimension() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:-");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols:-");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return mat;
    }

    int[][] mat = {
            { 1, 2, 0, 4 },
            { 3, 3, 2, 1 },
            { 0, 10, 3, -2 },
            { 2, -3, -1, 5 },
    };

    public static void main(String[] args) {
        MatRank matRank = new MatRank();
        matRank.findRank();
    }

    void findRank() {
        int row = mat.length;
        // int col = mat[0].length;
        int stepCounter = 1;
        printMat();
        System.out.println();

        if (mat[0][0] != 1) {
            // get the row with one
            int rowWith1 = findRowWithElement1(row - 1);
            System.out.println(rowWith1);
            System.out.println("Swapping Row " + 1 + " with Row " + rowWith1);
            // swapping row
            if (rowWith1 != -1) {
                swapRows(0, rowWith1);
                stepCounter++;
                printMat();
            }
        }
        List<List<Integer>> list = expressionWriter(row, 0, 1, mat[0][0]);
        System.out.println(list);
        // System.out.println(list.get(1));
        expressionExecutioner(list, stepCounter, 0);
        stepCounter++;

        System.out.println();
        printMat();
        System.out.println();

        list = expressionWriter(row, 1, 2, mat[1][1]);
        System.out.println(list);

        expressionExecutioner(list, stepCounter, 1);

        System.out.println();
        printMat();
        System.out.println();

        list = expressionWriter(row, 2, 3, mat[2][2]);
        System.out.println(list);

        expressionExecutioner(list, stepCounter, 2);

        System.out.println();
        printMat();
        System.out.println();

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
                        .println("R" + (i + 1) + " = " + (ele1 != 1 ? ele1 : "") + "R" + (i + 1) + " - " + ele2 + "R"
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
                        + Math.abs(ele2) + "R" + (colno + 1));
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
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
