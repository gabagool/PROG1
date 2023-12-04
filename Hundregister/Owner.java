// Björn Moderatho Winther bjmo4976

public class Owner {
    private String ownerName;

    public Owner(String name){
        ownerName = name;

    }

    public String getName(){
        String s1 = "";
        String s2 = "";
        boolean doubleName = false;
        ownerName = ownerName.toLowerCase();
        char[] charArray = ownerName.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        ownerName = String.valueOf(charArray);
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 0; i < ownerName.length(); i++){
            if (ownerName.charAt(i) == '-'){
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
                doubleName = true;
            }
            else if(doubleName && ownerName.charAt(i) == ' '){
                charArray[i + 1] = Character.toUpperCase(charArray[i+1]);
            }
            else if(!doubleName && ownerName.charAt(i) == ' '){
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            }

        }

        if (doubleName){
            System.out.println("Dubbelnamn = sant!!");
        }
        else{
            for (int i = 0; i < ownerName.length(); i++){
                if (ownerName.charAt(i) == ' '){
                }
            }
        }
        ownerName = String.valueOf(charArray);

        return ownerName;
    }
    public String toString(){

        return ownerName;
    }

}

