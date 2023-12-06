import java.util.*;
import java.time.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExerciseThree {
    public static void addDate(LocalDate date, ArrayList<LocalDate> dateArrayList) {
        for (LocalDate element : dateArrayList){
            if (!(element.isEqual(date))){
                dateArrayList.add(date);
            }
            else{
                System.out.println("Datumet fanns redan och lades därför inte till i listan.");
            }
        }
    }
    public static void printArray(ArrayList<String> strings){
        System.out.println();
        for (int i = 0; i < strings.size() - 1; i++) {
            if (i == strings.size() - 2) {
                System.out.print(strings.get(i) + ".");
            }
            else {
                System.out.print(strings.get(i) + ", ");
            }
        }
    }
    public static void arrayNumberSort(int[] ints){

        for(int i = 0; i < ints.length - 1; i++){

            int indexOfMin = i;
            int valueOfMin = ints[i];

            for(int j = i + 1; j < ints.length; j++){

                if (ints[i] > ints[j]){
                    indexOfMin = j;
                    valueOfMin = ints[j];
                }
            }
            int temp = ints[i];
            ints[i] = valueOfMin;
            ints[indexOfMin] = temp;

        }
    }
    public static void arrayLengthSort(ArrayList<String> a){
        String temp;
        for (int i = 0; i < a.size() - 1; i++){
            int indexOfMin = i;
            String valueOfMin = a.get(i);
            for (int j = i + 1; j < a.size(); j++){

                if (a.get(i).length() > a.get(j).length()){
                    indexOfMin = j;
                    valueOfMin = a.get(j);
                }
            }
            temp = a.get(i);
            a.set(i, valueOfMin);
            a.set(indexOfMin, temp);
        }
    }
    public void removeAllValuesOf(ArrayList<Object> objects){
        objects.clear();
    }
    public static int sumEvenIndices(ArrayList<Integer> ints){
       int sum = 0;
       if(ints.size() > 1) {
           for (int i = 0; i < ints.size() - 1; i++) {
               if (i % 2 == 0) {
                   sum += ints.get(i);
                   ;
               }
           }
       }
        return sum;
    }
    public static ArrayList<String> getLongWords(ArrayList<String> strings){
        for (String string : strings){
            if (string.length() < 10) strings.remove(string);
        }
        return strings;
    }
    public static String createGreeting(String name){
        return "Hello " + name + "!";
    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        int[] ints = new int[10];
        Random random = new Random();
        for ( int i = 0; i < ints.length -1; i++){
            ints[i] = (random.nextInt(1, 150));
        }
        arrayNumberSort(ints);
        System.out.print("int[] ints: ");
        for (int j = 0; j < ints.length - 1; j++){
            strings.add("" + ints[j]);
            System.out.print(ints[j] + ", ");
        }
        printArray(strings);
        arrayLengthSort(strings);
        printArray(strings);


    }
}