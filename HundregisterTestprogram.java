import java.time.LocalDateTime;

public class HundregisterTestprogram {

    public static void main(String[] args){
        LocalDateTime a = LocalDateTime.now();
        LocalDateTime b = LocalDateTime.of(2008, 11, 30, 11, 37);
        int ageDiff = a.compareTo(b);
        System.out.println("ageDiff:");
        System.out.println(ageDiff);



//        Scanner userInput = new Scanner(System.in);
//        String name = userInput.nextLine();
//        Owner owner = new Owner(name);
        Dog dog = new Dog("name", "name", Integer.MAX_VALUE, 12);
        System.out.println(dog.getAge());
//        System.out.print("Ägarens namn: ");
//        System.out.println(owner.getName());
//
//
//        System.out.print("HUNDENS namn:");
//
//        System.out.println(dog.getName() + "\nÅlder: " + dog.getAge() + "\nRas: " + dog.getBreed() + "\nHundens vikt: " + dog.getWeight() + "\nSvanslängd: " + dog.getTailLength());
    }
}
