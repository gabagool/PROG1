import java.time.LocalDateTime;
import java.util.ArrayList;

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

        //Test case för Dog-klassen
        var fido = new Dog("1", "Shih tzu", 3, 2); // svans=0,6
        var devil = new Dog("2", "Dvärgschnauzer, peppar & salt", 2, 11); // svans=2,2
        var molly = new Dog("3", "Dobermann", 11, 3); // svans=3,3
        var milou = new Dog("4", "Vinthund", 3, 13); // svans=3,9
        var ronja = new Dog("5", "Cocker spaniel", 6, 7); // svans=4,2
        var lassie = new Dog("6", "Bulldogg", 5, 11); // svans=5,5
        var ratata = new Dog("7", "Golden retriever", 8, 7); // svans=5,6
        var charlie = new Dog("8", "Border collie", 5, 18); // svans=9,0
        var sigge = new Dog("9", "Bulldogg", 6, 20); // svans=12,0
        var karo = new Dog("10", "Yorkshireterrier", 18, 11); // svans=19,8

        DogCollection collection = new DogCollection();
        collection.addDog(fido);
        collection.addDog(devil);
        collection.addDog(molly);
        collection.addDog(milou);


        Dog[] expected = { fido, devil, molly, milou, ronja, lassie, ratata, charlie, sigge, karo };

        Dog[] actual = { lassie, ratata, fido, devil, ronja, milou, charlie, sigge, molly, karo };

        Dog[] test = { lassie, ratata, fido, devil, ronja, milou, charlie, sigge, molly, karo };

        ArrayList<Dog> actually = new ArrayList<>();
        for (Dog x : actual) {
            actually.add(x);
        }
        System.out.println("___Innan sortering___");
        for (Dog x : actually) {
            System.out.println(x.getName());
        }
        Dog[] dogArray = new Dog[actually.size()];
//        Dog.dogTailSorter(actually.toArray(dogArray));
//        DogNamecomparator namecomparator = new DogNameComparator();
//        DogSorter.sortDogs(namecomparator, actually);
        System.out.println("___EFTER sortering___");
//        DogSorter.dogSort(actually);

        for (Dog x : actually) {
            System.out.println(x.getName());
        }
//        System.out.println(actual[0].getName());
//        DogTailComparator tailSort = new DogTailComparator();
//        Dog sortDogs = new Dog();

//        Arrays.sort(test, tailSort);
////
//        System.out.println("Array.sort(test[]): ");
//        for (int i = 0; i < test.length - 1; i++){
//            System.out.println(test[i].getName());
//        }
////        System.out.println("tailSort(actual[]): ");
//        for (int i = 0; i < test.length - 1; i++){
//            System.out.println(actual[i].getName());
//        }
//        ArrayList<Dog> dogs = new ArrayList<>();
//        for (Dog hound : actual) {
//
//            for(int i = 0; i < test.length - 1; i++){
//                if(test[i].getName().equals(hound.getName())){
//                    dogs.add(hound);
//                }
//            }
//
//        }
//        System.out.println("ArrayList dogs: ");
//        for(Dog hound : dogs){
//            System.out.println(hound.getName());
//        }
//
//        //  TESTER FÖR Owner-klassen
//        Owner ann = new Owner("Ann-Kristin Winther");
//        var cecilia = new Owner("Cecilia");
//        var gustav = new Owner("Gustav");
//        var helga = new Owner("Helga");
//        var henrik = new Owner("Henrik");
//        var jenny = new Owner("Jenny");
//        var johanna = new Owner("Johanna");
//        var kalle = new Owner("Kalle");
//        var louise = new Owner("Louise");
//        var ulla = new Owner("Ulla");
////        System.out.println("Efternamn: " + ann.getLastName());
////        System.out.println("Förnamn: " + ann.getFirstName());
//        System.out.println(ann.getName());
//

        //        System.out.print("Ägarens namn: ");
//        System.out.println(owner.getName());
//
//
//        System.out.print("HUNDENS namn:");
//
//        System.out.println(dog.getName() + "\nÅlder: " + dog.getAge() + "\nRas: " + dog.getBreed() + "\nHundens vikt: " + dog.getWeight() + "\nSvanslängd: " + dog.getTailLength());
    }
}
