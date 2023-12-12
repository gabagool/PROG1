//Björn Moderatho Winther bjmo4976
import java.util.ArrayList;
public class OwnerCollection {
    private Owner[] dogOwnerRegistry = new Owner[1000];
    public boolean addOwner(Owner owner){
        if(containsOwner(owner)){
            return false;
        }
        else{
            dogOwnerRegistry
            return true;

        }

    }
    public boolean removeOwner(String ownerName){
        return true;
    }
    public boolean removeOwner(Owner owner){
        return true;
    }
    public boolean containsOwner(String ownerName){
        return true;
    }
    public boolean containsOwner(Owner owner){
        return true;
    }
    public Owner getOwner(String ownerName){
        return new Owner("NAME");
    }
    public ArrayList<Owner> getOwners(){
        ArrayList<Owner> ownersAsArrayList = new ArrayList<>();
        for (Owner owner : dogOwnerRegistry){
            ownersAsArrayList.add(owner);
        }
        return ownersAsArrayList;

    }

}
