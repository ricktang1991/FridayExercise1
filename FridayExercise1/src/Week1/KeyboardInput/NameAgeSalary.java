package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = answer.nextLine();
        System.out.println("Hi, " + name +"!  How old are you?");
        int age = answer.nextInt();
        System.out.println("So you're " + age +", eh?  That's not old at all!\n" +
                "How much do you make, " + name +"?");
        int income = answer.nextInt();
        System.out.println(income +"!  I hope that's per hour and not per year! LOL!");

    }
}
