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
    }

    public static int sumTwoIntegers(int firstInt, int secondInt)
    {
        int sum = firstInt + secondInt;
        return sum;
    }





}
