import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //formularz znizka
        //https://goo.gl/forms/egDkcxePXLvtJV8O2

        System.out.println("hello world");

        int number = 100;
        String text = "My first text";
        System.out.println(text + " " + number);

        int[] tab =  new int[10];
        tab[0] = 111;
        tab[2] = 222;

        System.out.println(tab[0] + " " + tab[2]);

       int firstNumberToAdd = 9999;
       int secondNumberToAdd = 123;
       int ourResult = sumTwoIntegers(firstNumberToAdd,secondNumberToAdd);
        System.out.println(ourResult);


        for(int i = 1; i <= 10; i++) {
            System.out.println("TEXT, i = " + i);

            if(i % 2 == 0) {
                System.out.println("Our number is even I= " + i);
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj operację");
        String operation = scanner.next();
        String result = calculate(a, b, operation);
        System.out.println("Wynik to: " + result);
    }

    public static int sumTwoIntegers(int firstInt, int secondInt)
    {
        int sum = firstInt + secondInt;
        return sum;
    }


    public static String calculate(int a, int b, String operation) {
        try {
            if (operation.equals("+")) {
                return String.valueOf(a + b);
            } else if (operation.equals("-")) {
                return String.valueOf(a - b);
            } else if (operation.equals("/")) {
                return String.valueOf(a / b);
            } else if (operation.equals("*")) {
                return String.valueOf(a * b);
            }
        } catch (Exception e) {
            return "Błąd";
        }
        return "Zły znak";
    }


}
