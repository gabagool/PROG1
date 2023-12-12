//Björn Moderatho Winther bjmo4976

import java.util.Comparator;

public class DogTailNameComparator implements Comparator<Dog> {
    private DogTailComparator tailComparator;
    private DogNameComparator nameComparator;
    public DogTailNameComparator(){
        tailComparator = new DogTailComparator();
        nameComparator = new DogNameComparator();

    }
//    private int caseSwitch(int result){
//        if (result == 1) {
//            return 1;
//        } else if (result == 0) {
//            return 0;
//        } else{
//            return -1;
//        }
//    }
//    private int resultCompare(int a){
//        switch (a){
//        }
//
//
//        return 0;
//    }
    public int compare(Dog a, Dog b) {
        int tailResult = tailComparator.compare(a, b);
        if (tailResult == 0) return nameComparator.compare(a, b);
        if (tailResult == 1) return 1;
        else {
            return -1;
        }
    }
}


