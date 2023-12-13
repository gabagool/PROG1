// Björn Moderatho Winther bjmo4976
import java.util.ArrayList;
public class Owner implements Comparable<Owner> {
    private String ownerName;
    private String firstName;
    private String lastName;
    private Dog[] dogsOwned = new Dog[0];
    private int length;
    public Owner(String name) {
        ownerName = name;
        lastName = getLastName();
        firstName = getFirstName();
    }
    public int compareTo(Owner other) {
        if (ownerName.compareTo(other.getName()) > 0) return 1;
        if (ownerName.compareTo(other.getName()) < 0) return -1;
        else return 0;
    }
    public String getName() {
        String fullName = getNormalizedName(firstName) + " " + getNormalizedName(lastName);
        return fullName;
    }
    private String getNormalizedName(String name) {
        boolean doubleName = doubleNameCheck(name);
        name = name.toLowerCase();
        char[] charArray = name.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        name = String.valueOf(charArray);
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '-') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            } else if (doubleName && name.charAt(i) == ' ') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            } else if (!doubleName && ownerName.charAt(i) == ' ') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            }
        }
        name = String.valueOf(charArray);
        return name;
    }
    private String getFirstName(){
        String firstName = ownerName;
        for (int i = 0; i < firstName.length(); i++) {
            if (firstName.charAt(i) == ' ') {
                firstName = firstName.substring(0, i);
            }
        }
        return firstName;
    }
    private String getLastName(){
        String lastName = ownerName;
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) == ' ') {
                lastName = lastName.substring(i+1);
            }
        }
        return lastName;
    }
    private boolean doubleNameCheck(String name) {
        boolean doubleName = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '-' && Character.isUpperCase(name.charAt(i + 1))) {
                doubleName = true;
            }
        }
        return doubleName;
    }
    public String toString () {
        return ownerName;
    }
    public boolean addDog(Dog dog){
        if (length == 0){
            dogsOwned = new Dog[] {dog};
            length++;
        }else if(!hasOwner(dog)){
        }
        return false;
    }
    public boolean removeDog(Dog dog){

        return true;
    }
    public ArrayList<Dog> getDogs(){
        return new ArrayList<>();
    }
    private boolean hasOwner(Dog dog){
        return false;
    }
}
