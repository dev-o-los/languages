package Java;

public class Newsort {

    public static void shiftArrayToleft(float[] arr, int pos, float elementToInsert) {
        float temp = Float.NaN;
        for (int i = pos; i >= 0; i--) {
            if (Float.isNaN(arr[i])) {
                arr[i] = elementToInsert;
                return;
            } else {
                temp = arr[i];
                arr[i] = elementToInsert;
                elementToInsert = temp;
            }
        }
    }

    public static void shiftArrayToRight(float[] arr, int pos, float elementToInsert) {
        float temp = Float.NaN;
        for (int i = pos; i < arr.length; i++) {
            if (Float.isNaN(arr[i])) {
                arr[i] = elementToInsert;
                return;
            } else {
                temp = arr[i];
                arr[i] = elementToInsert;
                elementToInsert = temp;
            }
        }
    }

    public static int findpos(float[] arr, float ele) {
        if (ele > 0) {
            for (int i = arr.length - 2; i > 0; i--) {
                if (arr[i] < ele || Float.isNaN(arr[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > ele || Float.isNaN(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void display(float arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // float[] array = { 6, 5, 3, 1, 9, 8 };
        // float[] array = { 13, 9, 10, 5, 6, 7 };
        float[] array = { 8, 1, 2, 7, -1, -2, 9, 9, 6, 4, 0 };

        float[] narray = new float[array.length];

        for (int i = 0; i < narray.length; i++) {
            narray[i] = Float.NaN;
        }

        for (int i = 0; i < array.length; i++) {
            float ele = array[i];
            int pos = (int) ele - 1;

            if (pos >= array.length) {
                int lastpos = narray.length - 1;

                if (narray[lastpos] < ele) {
                    shiftArrayToleft(narray, lastpos, ele);
                } else if (narray[lastpos] > ele) {
                    int findpos = findpos(narray, ele);
                    if (Float.isNaN(narray[findpos])) {
                        narray[findpos] = ele;
                    } else {
                        shiftArrayToleft(narray, findpos, ele);
                    }
                } else {
                    narray[lastpos] = ele;
                }

            } else if (pos < 0) {
                if (Float.isNaN(narray[0])) {
                    narray[0] = ele;
                } else if (narray[0] > ele) {
                    shiftArrayToRight(narray, 0, ele);
                } else {
                    int findpos = findpos(narray, ele);
                    shiftArrayToRight(narray, findpos, ele);
                }
            } else if (Float.isNaN(narray[pos])) {
                narray[pos] = ele;
            } else {
                if (narray[pos] < ele) {
                    shiftArrayToleft(narray, pos, ele);
                } else {
                    int findpos = findpos(narray, ele);
                    shiftArrayToleft(narray, findpos, ele);
                }
            }

        }

        display(narray);
    }
}