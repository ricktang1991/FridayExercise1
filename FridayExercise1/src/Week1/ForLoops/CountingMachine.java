package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int num = input.nextInt();
        for (int j = 0; j <= num; j++) {
            System.out.print(j +" ");
        }
    }
}
