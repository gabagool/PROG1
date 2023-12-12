// Björn Moderatho Winther, bjmo4976
import java.util.ArrayList;
import java.util.Comparator;
public class DogCollection {
    private static Dog genericDog = new Dog("First", "Breed", 1, 2);
    private ArrayList<Dog> dogRegistry = new ArrayList<>();

    public boolean addDog(Dog dog) {
//        if(!searchDogs(dogRegistry, dog).contains(dog)) { // Använder searchDogs
//            dogRegistry.add(dog);
//            return true;
//        }
        //        else{
        //            return false;
        //        }
        if (containsDog(dog)) return false;
        else if (containsDog(dog.getName())) return false;
        else {
            dogRegistry.add(dog);
            return true;
        }
//        if(containsDog(dog)) {
//            return false;
//        } else if (containsDog(dog.getName())) {
//            return false;
//        }
        //        else{
        //            dogRegistry.add(dog);
        //            return true;
        //        }
    }

    public boolean removeDog(String dogName) {
        if (dogRegistry.size() == 0) {
            return false;
        } else if (!containsDog(dogName)) return false;
        else {
            dogRegistry.remove(getDogWithName(dogName));
            return true;
        }

    }

    public boolean removeDog(Dog dog) {
        if (dogRegistry.size() == 0) {
            return false;
        } else if (!containsDog(dog)) return false;
        else if (!containsDog(dog.getName())) {
            return false;

        } else {
            dogRegistry.remove(dog);
            return true;
        }
    }

    public boolean containsDog(String dogName) {
        for (Dog dog : dogRegistry) {
            if (dog.getName().equalsIgnoreCase(dogName)) {
                dogRegistry.indexOf(getDogWithName(dogName));
                return true;
            }
        }
        return false;

//        if (!dogNames.contains(dogName)) {
//            return false;
//        } else {
//            return true;
//        }
    }

    public boolean containsDog(Dog dog) {
        return dogRegistry.contains(dog);
    }

    public Dog getDog(String name) {
        if (containsDog(name)) {
            for (Dog dog : dogRegistry) {
                if (dog.getName().equalsIgnoreCase(name)) {
                    Dog cloneDog = dog;
                    return cloneDog;
                }
            }
        }
        return null;
    }
//////        Optional<Dog> optionalDogNames = getDogWithName(name);
////        ArrayList<Dog> dogNames;
////        if(optionalDogNames.isPresent()) {
////            dogNames = optionalDogNames.get();
////            if(dogNames.isEmpty()){
////                return null;
////            }
//            else return dogRegistry.get(dogNegistry(idnexOf));
//        }
//        else{
//            return null;
//        }


    public ArrayList<Dog> getDogs() {
        ArrayList<Dog> dogArrayList = new ArrayList<>();
        for (Dog dog : dogRegistry) {
            dogArrayList.add(dog);
        }

        return dogArrayList;
    }

    public ArrayList<Dog> getTailLengthOfDogs(double tailLength) {
        ArrayList<Dog> dogTailLengths = new ArrayList<>();

        for (Dog dog : dogRegistry) {
            if (dog.getTailLength() >= tailLength) {
            dogTailLengths.add(dog);
            }
        }
        return dogTailLengths;
    }


    private Dog getDogWithName(String name){
        Dog foundDog = genericDog;
        for (Dog dog : dogRegistry) {
            if (dog.getName().equalsIgnoreCase(name)) {
                foundDog = dog;
            }
        }
        return foundDog;
    }
    private ArrayList<Dog> searchDogs(Comparator<Dog> sortType, ArrayList<Dog> dogs, Dog dog){
//        DogNameComparator dogName = new DogNameComparator();
        ArrayList<Dog> dogsSoughtAfter = new ArrayList<>();
        for(int i = 0; i < dogs.size() - 1; i++){
            if(dogs.get(i).equals(dog)) dogsSoughtAfter.add(dogs.get(i));
        }
        return dogsSoughtAfter;
    }
}