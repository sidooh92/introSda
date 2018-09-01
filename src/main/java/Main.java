public class Main {
    public static void main(String[] args) {
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


        for(int i = 0; i < 10; i++) {
            System.out.println("TEXT, i = " + i);
        }
        




    }

    public static int sumTwoIntegers(int firstInt, int secondInt)
    {
        int sum = firstInt + secondInt;
        return sum;
    }





}
