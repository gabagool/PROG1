// Björn Moderatho Winther bjmo4976
import java.util.ArrayList;
import java.util.Comparator;

public class DogSorter {
    private static void swapDogs(ArrayList<Dog> dogArrayList, int a, int b){
        Dog temp = dogArrayList.get(a);
        dogArrayList.set(a, dogArrayList.get(b));
        dogArrayList.set(b, temp);
    }
    public static int sortDogs(Comparator<Dog> sortType, ArrayList<Dog> dogArrayList){
        int swapsPerformed = 0;
        for(int i = 0; i < dogArrayList.size() - 1; i++){
            int indexOfNextDog = nextDog(sortType, dogArrayList, i);
            if(dogArrayList.get(i) != dogArrayList.get(indexOfNextDog))
            {
                swapsPerformed++;
            }
            swapDogs(dogArrayList, indexOfNextDog, i);
        }
        return swapsPerformed;
    }
    public static void sortDogList(Comparator<Dog> sortType, ArrayList<Dog> dogArrayList){
        int swapsPerformed = 0;
        for(int i = 0; i < dogArrayList.size() - 1; i++){
            int indexOfNextDog = nextDog(sortType, dogArrayList, i);
            if(dogArrayList.get(i) != dogArrayList.get(indexOfNextDog))
            {
                swapsPerformed++;
            }
            swapDogs(dogArrayList, indexOfNextDog, i);
        }
//        return swapsPerformed;
    }

    private static int nextDog(Comparator<Dog> sortType , ArrayList<Dog> dogArrayList, int indexOfMin){
        for (int j = indexOfMin + 1; j < dogArrayList.size(); j++){
            if (sortType.compare(dogArrayList.get(indexOfMin), dogArrayList.get(j)) > 0){
                indexOfMin = j;

            }

        }
        return indexOfMin;
    }
    private static void dogSort(ArrayList<Dog> dogList){
        for(int i = 0; i < dogList.size() - 1; i++){
            int indexOfMin = i;
            for (int j = i + 1; j < dogList.size(); j++){
                if (dogList.get(indexOfMin).getTailLength() > dogList.get(j).getTailLength()){
                    indexOfMin = j;
                }
            }
            Dog temp = dogList.get(indexOfMin);
            dogList.set(indexOfMin, dogList.get(i));
            dogList.set(i, temp);

        }
    }
//    private int swap(){
//    }



}
