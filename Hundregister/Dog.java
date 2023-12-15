//Björn Moderatho Winther bjmo4976
interface Ownership {
    boolean setOwner(Owner owner);
}
public class Dog implements Ownership {
    private static final double DACHSHUND_TAIL = 3.7;
    private  String name;
    private  String breed;
    private int age;
    private int dogId;
    private int weight;

    private boolean isOwned;
    private double tailLength;
    private String ownerToString;

    public Dog(String name, String breedName, int age, int weight){
        this.name = name;
        breed = breedName;
        this.weight = weight;
        tailLength = getTailLength();
        this.age = age;
        owner = null;
    }
    private Owner owner;
    private static void dogTailSorter(Dog[] a){
        for (int i = 0; i < a.length - 1; i++){

            int indexOfMin = i;

            for (int j = 1 + 1; j < a.length; j++ ){

                if(a[indexOfMin].getTailLength() > a[j].getTailLength()){

                    indexOfMin = j;
                }
            }
            Dog temp = a[indexOfMin];
            a[indexOfMin] = a[i];
            a[i] = temp;
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", owner=" + owner.getName() +
                '}';
    }
    public int increaseAge(int a){
        if (a < 0){
            System.out.println("Kan inte minska ålder (1)");
        }
        else if (age == Integer.MAX_VALUE){
            System.out.println("age == MAX");
            return 1;
        }
        else return age = age + a;
        return 0;
    }
    public String getName() {
        boolean doubleName = false;
        name = name.toLowerCase();
        char[] tempName = name.toCharArray();
        tempName[0] = Character.toUpperCase(tempName[0]);
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == '-'){
                tempName[i+1] = Character.toUpperCase(tempName[i+1]);
                doubleName = true;
            }
            else if(doubleName && name.charAt(i) == ' '){
                tempName[i + 1] = Character.toUpperCase(tempName[i+1]);
            }
            else if(!doubleName && name.charAt(i) == ' '){
                tempName[i + 1] = Character.toUpperCase(tempName[i + 1]);
            }

        }
        if (doubleName){
            System.out.println("Dubbelnamn = sant!!");
        }
        else{
            for (int i = 0; i < name.length(); i++){
                if (name.charAt(i) == ' '){
                }
            }
        }
        name = String.valueOf(tempName);
        return name;
    }

    public String getBreed() {
        breed = breed.toLowerCase();
        char[] charArray = breed.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        breed = String.valueOf(charArray);
        return breed;
    }
    public int getAge() {
        if (age == Integer.MAX_VALUE){
            System.out.println("Int MAX är ogiltig ålder getAge()");
            return age;
        }
        else if ( age == Integer.MIN_VALUE)
        {
            System.out.println("Int MIN är ogiltig ålder getAge()");
            return age;
        }
        return age;
    }
    public int getWeight() {
        return weight;
    }

    public double getTailLength() {
        boolean isDachshund = switch (getBreed()) {
            case "Dachshund" -> true;
            case "Tax" -> true;
            case "Mäyräkoira" -> true;
            case "Teckel" -> true;
            default -> false;
        };
        if (!isDachshund) tailLength = age * (weight / 10f);
        else tailLength = DACHSHUND_TAIL;

        return tailLength;
    }
    @Override public boolean setOwner(Owner owner){
        Owner temp;
        if(this.owner != null){
            if(owner == null) {
                this.owner.removeDog(this);
                this.owner = null;
                return true;
            }
            else return false;
        } else if (owner.getDogs().contains(this)) {
            return false;
        }
        this.owner = owner;
        return this.owner.addDog(this);
    }
    public Owner getOwner(){
        Owner clone = new Owner("Hej");
        ownerToString = clone.toString();
        clone = this.owner;
        return clone;
    }

    private boolean getValidSuperclass(Object object){
        Class <?> superClass = object.getClass().getSuperclass();
        boolean A = (superClass == Dog.class);
        boolean B = (superClass == Owner.class);
        boolean C = (superClass.isAssignableFrom(Dog.class));
        boolean D = (superClass.isAssignableFrom(Owner.class));
        
        return A | B | C | D;
    }
}