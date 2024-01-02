//Björn Moderatho Winther, bjmo4976

import java.util.Scanner;
public class DogRegister {
    private static final int NEW_OWNER = 1;
    private static final int REMOVE_OWNER = 2;
    private static final int NEW_DOG = 3;
    private static final int REMOVE_DOG = 4;
    private static final int LIST_DOGS = 5;
    private static final int LIST_OWNERS = 6;
    private static final int INCREASE_AGE = 7;
    private static final int ASSIGN_DOG_TO_OWNER = 8;
    private static final int REMOVE_DOG_FROM_OWNER = 9;
    private static final int EXIT_COMMAND = 10;
    private int command;
    //    private String[] legalInputs = {" ", " ", " ", " ", "exit"};
    private Scanner userInput = new Scanner(System.in);
//    private DogRegister program = new DogRegister();
    private void start(){
        initialize();
        runCommandLoop();
    }

    private void shutDown() {
        System.out.println("Shutting down.");
        command = 10;
    }

    private void initialize() {
        System.out.println("Welcome to the dog register\n");
    }

    private void runCommandLoop(){
//        System.out.println("Inside command loop.");
//        String inputValue;
        do{
            try {
                command = readCommand();
            } catch (Exception e) {
                System.out.println("Error. No such command.");
            }
            handleCommand(command);
        }while(command != EXIT_COMMAND);
    }

    private void handleCommand(int command) {
        switch(command){
            case 1 -> registerOwner();
            case 2 -> removeOwner();
            case 3 -> registerDog();
            case 4 -> removeDog();
            case 5 -> printDogList();
            case 6 -> printOwnerList();
            case 7 -> increaseDogAge();
            case 8 -> assignOwnership();
            case 9 -> removeDogOwnership();
            case 10 -> exitCommand();
            default -> System.out.println("Error. No such command exists.");
        }
    }

    private void removeDogOwnership() {
        System.out.println("Owner removed from dog.");
    }

    private void assignOwnership() {
        System.out.println("Dog ownership status updated.");
    }

    private void increaseDogAge() {
        System.out.println("Age has been increased.");
    }

    private void printOwnerList() {
        System.out.println("Owner list: \n");
    }

    private void printDogList() {
        System.out.println("Dog list: \n");
    }

    private void removeDog() {
        System.out.println("Dog REMOVED.");
    }

    private void registerDog() {
        System.out.println("DOG registered.");
    }

    private void removeOwner() {
        System.out.println("OWNER removed.");
    }

    private void registerOwner() {
        System.out.println("OWNER registered.");
    }

    private void exitCommand() {
        shutDown();
    }

    private int readCommand() {
        System.out.println("Command?>");
        String command = userInput.nextLine();
        switch(command.toLowerCase()){
            case "register new owner" -> {
                return NEW_OWNER;
            }
            case "remove owner" -> {
                return REMOVE_OWNER;
            }
            case "register new dog" -> {
                return NEW_DOG;
            }
            case "remove dog" -> {
                return REMOVE_DOG;
            }
            case "list dogs" -> {
                return LIST_DOGS;
            }
            case "list owners" -> {
                return LIST_OWNERS;
            }
            case "increase age" -> {
                return INCREASE_AGE;
            }
            case "give dog to owner" -> {
                return ASSIGN_DOG_TO_OWNER;
            }
            case "remove dog from owner" -> {
                return REMOVE_DOG_FROM_OWNER;
            }
            case "exit" -> {
                return EXIT_COMMAND;
            }


        }
        return 0;
    }

    public static void main(String[] args){
        new DogRegister().start();

    }
}
