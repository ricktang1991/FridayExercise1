package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int total = 0;
        System.out.print("I will add up the numbers you give me.\nNumber: ");
        while (true) {
            int num = answer.nextInt();
            total += num;
            if (num != 0) {
                System.out.print("The total so far is " + total +"\nNumber: ");
            } else {
                System.out.print("\nThe total so far is " + total);
                break;
            }
        }

    }
}
