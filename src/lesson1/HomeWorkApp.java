package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-5, 4);
        printColor(101);
        compareNumbers(0, 5);

    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b <= 0) {
            System.out.println("сумма отрицательная");
        } else {
            System.out.println("сумма положительная");
        }

    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("RED");

        } else if (value <= 100) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");

        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }



}
