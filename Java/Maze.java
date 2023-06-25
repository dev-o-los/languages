package Java;

import java.util.Scanner;

public class Maze {
    static char[][] maze = new char[10][10];
    static int x_coordinate;
    static int y_coordinate;

    static void MazePad() {
        for (int i = 0; i < maze.length - 1; i++) {
            for (int j = 0; j < maze.length - 1; j++) {

                String sum_index = Integer.toString(i) + "," + Integer.toString(j);

                if ((sum_index.equals("0,1")) || (sum_index.equals("1,1")) || (sum_index.equals("1,2")) ||
                        (sum_index.equals("2,2")) || (sum_index.equals("3,2")) || (sum_index.equals("3,3")) ||
                        (sum_index.equals("3,4")) || (sum_index.equals("4,4")) || (sum_index.equals("4,5")) ||
                        (sum_index.equals("4,6")) || (sum_index.equals("5,6")) ||
                        (sum_index.equals("6,6")) || (sum_index.equals("7,6")) ||
                        (sum_index.equals("8,6"))) {
                    maze[i][j] = ' ';
                } else {
                    maze[i][j] = '#';
                }

            }
        }
        for (int i = 0; i < maze.length - 1; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Rat() {
        String initialpos = "0,2", finalpos = "8,6", currentpos = "";
        // Stack<String> stack = new Stack<String>();
        // System.out.println(stack);
        Scanner sc = new Scanner(System.in);
        String anykey = "";

        while (!initialpos.equals(finalpos)) {
            if (currentpos.isEmpty()) {
                currentpos = initialpos;
                x_coordinate = Integer.parseInt(initialpos.substring(0, 1));
                x_coordinate = Integer.parseInt(initialpos.substring(2));
            }
            if (CheckUp(currentpos)) {
                currentpos = Integer.toString(x_coordinate) + "," + Integer.toString(y_coordinate);
                initialpos = currentpos;
                maze[x_coordinate][y_coordinate] = '1';
            } else if (CheckRight(currentpos)) {
                currentpos = Integer.toString(x_coordinate) + "," + Integer.toString(y_coordinate);
                initialpos = currentpos;
                maze[x_coordinate][y_coordinate] = '1';
            } else if (CheckLeft(currentpos)) {
                currentpos = Integer.toString(x_coordinate) + "," + Integer.toString(y_coordinate);
                initialpos = currentpos;
                maze[x_coordinate][y_coordinate] = '1';
            } else if (CheckDown(currentpos)) {
                currentpos = Integer.toString(x_coordinate) + "," + Integer.toString(y_coordinate);
                initialpos = currentpos;
                maze[x_coordinate][y_coordinate] = '1';
            } else {
                System.out.println("Error");
            }
            anykey = sc.nextLine();
            if (anykey == "l") {
                Maze.MazePad();
                continue;
            }
        }
        sc.close();
    }

    static boolean CheckLeft(String currentpos) {
        x_coordinate = Maze.x_coordinate(currentpos);
        y_coordinate = Maze.y_coordinate(currentpos) - 1;

        if (y_coordinate < 0 || x_coordinate < 0) {
            return false;
        } else if (maze[x_coordinate][y_coordinate] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    static boolean CheckRight(String currentpos) {
        x_coordinate = Maze.x_coordinate(currentpos);
        y_coordinate = Maze.y_coordinate(currentpos) + 1;
        if (y_coordinate < 0 || x_coordinate < 0) {
            return false;
        } else if (maze[x_coordinate][y_coordinate] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    static boolean CheckUp(String currentpos) {
        x_coordinate = Maze.x_coordinate(currentpos) - 1;
        y_coordinate = Maze.y_coordinate(currentpos);
        if (x_coordinate < 0 || y_coordinate < 0) {
            return false;
        } else if (maze[x_coordinate][y_coordinate] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    static boolean CheckDown(String currentpos) {
        x_coordinate = Maze.x_coordinate(currentpos) + 1;
        y_coordinate = Maze.y_coordinate(currentpos);
        if (x_coordinate < 0 || y_coordinate < 0) {
            return false;
        } else if (maze[x_coordinate][y_coordinate] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    static int x_coordinate(String string) {
        char value = string.charAt(0);
        int x_coordinate = Integer.parseInt(Character.toString(value));
        return x_coordinate;
    }

    static int y_coordinate(String string) {
        char value = string.charAt(2);
        int y_coordinate = Integer.parseInt(Character.toString(value));

        return y_coordinate;
    }

    public static void main(String[] args) {
        Maze.MazePad();
        Maze.Rat();
    }
}
