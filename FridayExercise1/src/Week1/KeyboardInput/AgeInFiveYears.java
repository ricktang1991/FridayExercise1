package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");
        String name = answer.next();
        System.out.println("\nHi, " + name +"!  How old are you? ");
        int age = answer.nextInt();
        int age1 = age + 5;
        int age2 = age - 5;
        System.out.println("Did you know that in five years you will be " + age1 + " years old?\n" +
                "And five years ago you were "+ age2 +"! Imagine that!");
    }
}
