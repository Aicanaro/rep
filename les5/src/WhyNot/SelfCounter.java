package WhyNot;



public class SelfCounter {
    private static int countOf = 0;
    public SelfCounter(){
        SelfCounter.countOf++;

    }
    public static int getCountOf(){
        return countOf;
    }
}
