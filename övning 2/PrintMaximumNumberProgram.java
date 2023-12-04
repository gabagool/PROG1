//Björn Moderatho Winther, bjmo4976

import java.util.Scanner;

public class PrintMaximumNumberProgram {
    public static void arraySort(int[] b){

        for (int i = 0; i < b.length - 1; i++){
            int min = b[i];
            int indexOfMin = i;

            for (int j = i + 1; j < b.length; j++ ){
                if (b[j] < min){
                    min = b[j];
                    indexOfMin = j;
                }
            }
            int temp = b[i];
            b[i] = b[indexOfMin];
            b[indexOfMin] = temp;
        }

    }

    public static void printMaxInt(int[] array){
        System.out.println("\nDet största talet i din array är: " + array[array.length - 1]);
    }
    public static void inputArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print("Skriv in ett tal: ");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            array[i] = userInput;
        }
        //return array;
        
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            
            if (i != (array.length - 1)) {
                System.out.println("Tal " + (i + 1) + " av " + array.length + ": " + array[i]);
            }
            else{
                System.out.print("Tal " + (i + 1) + " av " + array.length + ": " + array[i]);
            }
        }
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hur många tal vill du skriva in: ");

        int userInput = input.nextInt();
        int[] ints = new int[userInput];
        
        inputArray(ints);
        
        arraySort(ints);

        printArray(ints);
        
        printMaxInt(ints);
    }
}