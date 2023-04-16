package lec1;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        String s = "38";
        System.out.println(s);

        short age = 10;
        int salary = 12345;

        float e = 2.7f;
        double pi = 3.1415;

        char ch = '}';
        System.out.println(ch);

        boolean flag1 = 123 <= 234;
        boolean flag2 = 123 >= 234;
        boolean flag3 = flag1 ^ flag2; // True если только одно значение true

        String msg = "Hello world";

        var i = 123; // int
        var d = 123.345; // double

        int g = 124;
        System.out.println(Integer.MAX_VALUE);

        int w = 23_134_255;
        System.out.println(w);

        int a = 123;
        a = a-- - --a;
        System.out.println(a);

        // Массивы

        int[] arr = new int[]{1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr.length);

        int[] my_arr[] = new int[3][5];
        int[][] new_arr = new int[2][6];

        // Ввод в консоль

//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Hello, %s!", name);
//        iScanner.close();

        Scanner aScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = aScanner.hasNextInt() ;
        System.out.println(flag);
        int r = aScanner.nextInt();
        System.out.println();
        aScanner.close ();

        // Функции и методы

        sayHi();

    }
    static public void sayHi(){
        System.out.println("hi");
    }
}
