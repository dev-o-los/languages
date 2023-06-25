package Java;

public class SliderSort {

    public static void shiftArrayToleft(double[] arr, int pos, double elementToInsert) {
        double temp = Double.NaN;
        for (int i = pos; i >= 0; i--) {
            if (Double.isNaN(arr[i])) {
                arr[i] = elementToInsert;
                return;
            } else {
                temp = arr[i];
                arr[i] = elementToInsert;
                elementToInsert = temp;
            }
        }
    }

    public static int findpos(double[] arr, double ele) {
        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] < ele || Double.isNaN(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void display(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void slidersort(double[] array) {
        double[] narray = new double[array.length];

        for (int i = 0; i < narray.length; i++) {
            narray[i] = Double.NaN;
        }

        for (int i = 0; i < array.length; i++) {
            double ele = array[i];
            int pos = (int) ele - 1;

            if (pos >= array.length) {
                int lastpos = narray.length - 1;

                if (narray[lastpos] <= ele) {
                    shiftArrayToleft(narray, lastpos, ele);
                } else if (narray[lastpos] > ele) {
                    int findpos = findpos(narray, ele);
                    if (Double.isNaN(narray[findpos])) {
                        narray[findpos] = ele;
                    } else {
                        shiftArrayToleft(narray, findpos, ele);
                    }
                } else {
                    narray[lastpos] = ele;
                }

            } else if (Double.isNaN(narray[pos])) {
                narray[pos] = ele;
            } else {
                if (narray[pos] <= ele) {
                    shiftArrayToleft(narray, pos, ele);
                } else {
                    int findpos = findpos(narray, ele);
                    shiftArrayToleft(narray, findpos, ele);
                }
            }

        }

        // display(narray);
    }

    public static void main(String[] args) {
        // double[] array = { 6, 5, 3, 1, 9, 8 };
        double[] array = { 13, 1, 9, 10, 10, 5, 5, 7, 6, 7, 2, 52, 99, 99, 99, 99 };

        slidersort(array);
    }
}