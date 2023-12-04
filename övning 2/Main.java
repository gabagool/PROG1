//Björn Moderatho Winther, bjmo4976

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hur många tal vill du skriva in: ");

        int userInput = input.nextInt();

        int[] ints = new int[userInput];

        for (int i = 0; i < ints.length; i++){
            System.out.print("Skriv in ett tal: ");
            userInput = input.nextInt();
            ints[i] = userInput;
        }
        IsMinimumQuestion.isMin(5, ints);
        PrintMaximumNumberProgram.printMaxInt(ints);
    }
}