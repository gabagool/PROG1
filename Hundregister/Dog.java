//Björn Moderatho Winther bjmo4976
public class Dog {
    private static final double DACHSHUND_TAIL = 3.7;
    private String name;
    private String breed;
    private int age;
    private int weight;
    private int dogId;
    private boolean isOwned;
    private double tailLength;
    public Dog(String name, String breedName, int age, int weight){
        this.name = name;
        breed = breedName;
        this.weight = weight;
        tailLength = getTailLength();
        this.age = age;


    }
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

    public String toString() {
        String tailLength = Double.toString(getTailLength());
        String age = Integer.toString(getAge());
        String weight = Integer.toString(getWeight());
        String firstString = name + ", " + breed + ", " + age;
        String secondString = ", " + weight + ", " + tailLength;
        return firstString + secondString;

    }
    public boolean setOwner(Owner owner){
        return isOwned;
    }
    public Owner getOwner(){
        return new Owner("this.owner");
    }
//    private boolean getOwnershipStatus(Owner owner){
//        return isOwned;
//    }
//    private boolean setOwnershipStatus(Owner owner){
//        return isOwned;
//    }
}
