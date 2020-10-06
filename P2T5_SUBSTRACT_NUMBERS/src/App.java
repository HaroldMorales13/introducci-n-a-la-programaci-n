import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("SUBSTRACT BETWEEN TWO NUMBERS MADE BY HAROLD MORALES");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the first number");
        int num1 = keyboard.nextInt();

        System.out.println("imput the second number");
        int num2 = keyboard.nextInt();

        int resu= num1- num2;
        
        System.out.println("The substract is:"+resu);
    }
}
