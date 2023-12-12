// Björn Moderatho Winther bjmo4976
import java.util.Comparator;
public class DogTailComparator implements Comparator<Dog> {
    public DogTailComparator() {

    }
    public int compare(Dog a, Dog b){
        return Double.compare(a.getTailLength(), b.getTailLength());
    }

}
