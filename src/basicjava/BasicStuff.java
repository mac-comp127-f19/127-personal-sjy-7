package basicjava;
import java.util.Random;
import java.util.Scanner;

public class BasicStuff {
    public static void main(String[] args) {
        double sumOfAges;
        double age0 = 19;
        double age1 = 20;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is "+ sumOfAges+ "!");
        System.out.println("sum of our ages is" + age0+age1);
        System.out.println("The sum of our ages is "+ (age0+age1)+ "!");

        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(6.0/4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE - 1);

        int hrs = 1600;
        int days = hrs/24;
        int weeks = days/7;
        System.out.println("1600 hours is " + days + " or " + weeks+" weeks.");

        Random generator = new Random();
        int num, num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        num = scan.nextInt();
        num1 = generator.nextInt(num);
        System.out.println("A random integer: "+ num1);










    }
}


