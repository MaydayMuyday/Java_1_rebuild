package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println((trueOrFalse(3, 8)));
        checkNumber(-1);
        System.out.println((numberBoolean(0)));
        printString("hello", 10);
        System.out.println((leapYear(1900)));

    }

    public static boolean trueOrFalse(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean numberBoolean(int a) {
        return a<0;
    }
    public static void printString(String s, int a){

        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
    public static boolean leapYear(int a){
        if (a%4==0 && a%100 !=0 || a%400==0){
            return true;
        }else{
            return false;
        }
    }
}
