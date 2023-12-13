//Björn Moderatho Winther bjmo4976

import java.util.ArrayList;

public class OwnerCollection {
    private Owner[] ownerRegistry = new Owner[0];
    private int length;

    public boolean addOwner(Owner owner) {

        if(length == 0){
            length++;
            ownerRegistry = new Owner[]{owner};
            return true;
        } else if (!containsOwner(owner) && !containsOwner(owner.getName())){
            length++;
            Owner[] tempArray = ownerRegistry;
            ownerRegistry = new Owner[length];
            for(int i = 0; i < tempArray.length; i++){
                ownerRegistry[i] = tempArray[i];
            }
            ownerRegistry[length-1] = owner;
            return true;
        }
        return false;
    }
    public boolean removeOwner(String ownerName) {
        if(length == 0){
            return false;
        } else if (ownerRegistry.length == 1) {
            length--;
            ownerRegistry = new Owner[0];
            return true;
        } else if (containsOwner(ownerName) && containsOwner(getOwner(ownerName))){
            int indexOfNull = getIndex(ownerName);
            length--;

            ownerRegistry[indexOfNull] = null;                          // Ser till att elementet som är null alltid är sist med min metod.
            Owner[] tempArray = getRearrangedArray(indexOfNull);        // Skapar ny instans av ownerRegister med ett index mindre.
            ownerRegistry = new Owner[length];                          // Itererar från index 0 till length - 1, eftersom det sista indexet alltid är null.
            for(int i = 0; i < tempArray.length - 1; i++){
                ownerRegistry[i] = tempArray[i];
            }
            return true;
        }
        return false;
    }
    public boolean removeOwner(Owner owner) {
        if(length == 0){
            return false;
        } else if (ownerRegistry.length == 1) {
            length--;
            ownerRegistry = new Owner[0];
            return true;
        } else if (containsOwner(owner) && containsOwner(getOwner(owner.getName()))){
            int indexOfNull = getIndex(owner);
            length--;

            ownerRegistry[indexOfNull] = null;                          // Ser till att elementet som är null alltid är sist med min metod.
            Owner[] tempArray = getRearrangedArray(indexOfNull);        // Skapar ny instans av ownerRegister med ett index mindre.
            ownerRegistry = new Owner[length];                          // Itererar från index 0 till length - 1, eftersom det sista indexet alltid är null.
            for(int i = 0; i < tempArray.length - 1; i++){
                ownerRegistry[i] = tempArray[i];
            }
            return true;
        }
        return false;
    }

    public boolean containsOwner(String ownerName) {
        if(ownerRegistry.length == 0) return false;
        for (int i = 0; i < length - 1; i++) {
            if (ownerRegistry[i].getName().equalsIgnoreCase(ownerName)) {
                return true;
            }
        }
        return ownerRegistry[length - 1].getName().equalsIgnoreCase(ownerName);
    }

    public boolean containsOwner(Owner owner) {
        if(ownerRegistry.length > 0) {
            for (int i = 0; i < length; i++) {
                if (ownerRegistry[i] == owner) return true;
            }
        }
        return false;
    }

    public Owner getOwner(String ownerName) {
        if(containsOwner(ownerName)){
            for(int i = 0; i < ownerRegistry.length; i++){
                if (ownerRegistry[i].getName().equalsIgnoreCase(ownerName)) return ownerRegistry[i];
            }
        }

        return null;
    }
    public ArrayList<Owner> getOwners() {
        ArrayList<Owner> clonedRegistry = new ArrayList<>();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                if (ownerRegistry[i] != null) clonedRegistry.add(ownerRegistry[i]);
            }
        }
        return clonedRegistry;
    }
    private int getIndex(Owner owner){
        int indexOfDog = 0;
        if(containsOwner(owner) && ownerRegistry.length > 0){
            for(int i = 0; i < length; i++){
                if(ownerRegistry[i] == owner) {
                    indexOfDog = i;
                    return indexOfDog;
                }
            }
        }
        return indexOfDog;
    }
    private int getIndex(String ownerName) {
        int indexOfDog = 0;
        if(containsOwner(ownerName) && ownerRegistry.length > 0){
            for(int i = 0; i < length; i++){
                if(ownerRegistry[i].getName().equalsIgnoreCase(ownerName)) {
                    indexOfDog = i;
                    return indexOfDog;
                }
            }
        }
        return indexOfDog;
    }
    private Owner[] getRearrangedArray(int indexOfNull){
        Owner temp = new Owner("NAME");
        while((indexOfNull + 1) != (ownerRegistry.length)){
            temp = ownerRegistry[indexOfNull];
            ownerRegistry[indexOfNull] = ownerRegistry[indexOfNull + 1];
            ownerRegistry[indexOfNull + 1] = temp;
            indexOfNull++;
        }
        return ownerRegistry;
    }
}