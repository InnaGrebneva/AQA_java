import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        System.out.println("Çàäàíèå 1 : " + checkSum(1, 6));
        homeTwo(-6);
        System.out.println("Çàäàíèå 3 : " + number(-5));
        System.out.print("Çàäàíèå 4: ");
        print4("World", 3);
        leapYear(1990);
        massive();
        System.out.print("Çàäàíèå 7: ");
        massive_2();
        System.out.println();
        System.out.print("Çàäàíèå 8: ");
        massive_3();
        System.out.println();
        System.out.print("Çàäàíèå 9: ");
        massive_4();
        System.out.println();
        System.out.println("Çàäàíèå 10: " + Arrays.toString(getArr(5, 2)));

    }

    public static boolean checkSum(int a, int b) {
        if (a + b < 20 && a + b > 10) return true;
        else return false;
    }

    public static void homeTwo(int a) {
        if (a >= 0) {
            System.out.println("Çàäàíèå 2: ×èñëî ïîëîæèòåëüíîå");
        } else {
            System.out.println("Çàäàíèå 2: ×èñëî îòðèöàòåëüíîå");
        }
    }

    public static boolean number(int a) {
        if (a < 0)
            return true;
        else
            return false;

    }

    public static void print4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void leapYear(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Çàäàíèå 5: " + year + " Ãîä âèñîêîñíûé");
        } else {
            System.out.println("Çàäàíèå 5: " + year + " Ãîä íåâèñîêîñíûé");
        }

    }

    public static void massive() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {// çäåñü äîëæíî áûòü int i=0;
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Çàäàíèå 6: " + Arrays.toString(arr));
    }

    public static void massive_2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            System.out.print(((array[i] = i + 1) + ","));
        }
    }

    public static void massive_3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
            System.out.print(array[i] + ",");
        }
    }

    public static void massive_4() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
        }

    }

    public static int[] getArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }
}
