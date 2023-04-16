package hw1;
import java.util.*;

public class Prog {
    public static void main(String[] args) {
        // Задача 1. Вычислите n-е треугольное число и n!

//        int n = 5;
//        int triangle = 0;
//        int factorial = 1;
//        for (int i = 0; i <= n; i++) {
//            triangle = triangle + i;
//        }
//        for (int i = 1; i <= n; i++) {
//            factorial = factorial*i;
//        }
//        System.out.println(triangle);
//        System.out.println(factorial);

        ////////////////////////////////////////////////////////////////////////////////

        // Задача 2. Вывести все простые числа от 1 до 1000

//        HashMap<Integer, String> dict = new HashMap<>();
//
//        for (int i = 2; i < 1001; i++) {
//            dict.put(i, "yes");
//        }
//
//        for (int i = 2; i < 1001; i++) {
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0){
//                    dict.put(i, "no");
//                }
//            }
//
//        }
//
//        List<Integer> keys = new ArrayList<Integer>(dict.keySet());
//        for(int i = 0; i < keys.size(); i++) {
//            Integer key = keys.get(i);
//            String value = dict.get(key);
//            if(value.equals("yes")){
//                System.out.println(key);
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////

        // Задача 3. Реализовать простой калькулятор

//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        String firstNumber = iScanner.nextLine();
//        System.out.print("Enter operation: ");
//        String operation = iScanner.nextLine();
//        System.out.print("Enter second number: ");
//        String secondNumber = iScanner.nextLine();
//
//        double first = Double.parseDouble(firstNumber);
//        double second = Double.parseDouble(secondNumber);
//
//        if(operation.equals("+")){
//            System.out.println(first + second);
//        }
//        if(operation.equals("-")){
//            System.out.println(first - second);
//        }
//        if(operation.equals("*")){
//            System.out.println(first * second);
//        }
//        if(operation.equals("/")){
//            System.out.println(first / second);
//        }
//        if(operation.equals("%")){
//            System.out.println(first % second);
//        }
//        if(operation.equals("**")){
//            System.out.println(Math.pow(first, second));
//        }
//
//        iScanner.close();

        ////////////////////////////////////////////////////////////////////////////////

//        *Задача 4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут
//        быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
//        выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

//        String q = "2?";
//        String w = "?5";
//        String e = "69";
//        boolean flag = false;
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                int qInt = Integer.parseInt((String.valueOf(q.charAt(0)) + Integer.toString(i)));
//                int wInt = Integer.parseInt((Integer.toString(j) + String.valueOf(w.charAt(1))));
//                int eInt = Integer.parseInt(String.valueOf(e.charAt(0)) + String.valueOf(e.charAt(1)));
//                if(qInt + wInt == eInt) {
//                    flag = true;
//                    System.out.printf("%s + %s = %s", qInt, wInt, eInt);
//                }
//            }
//        }
//        if(!flag){
//            System.out.println("There's no suitable options ¯|_(ツ)_/¯");
//        }
        }
    }
