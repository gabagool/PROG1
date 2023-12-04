public class DogTailComparator {
    public double compare(Dog a, Dog b){
        double max = Math.max(a.getTailLength(), b.getTailLength());
        return max;
    }

}
