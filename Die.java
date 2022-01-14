public class Die {
    private int firstInt;
    private int secondInt;

    public Die() {
        firstInt = (int)(Math.random()*6+1);
        secondInt = (int)(Math.random()*6+1);
    }

    public int getSum() {
        return firstInt+secondInt;
    }

    public int getFirst() {
        return firstInt;
    }

    public int getSecond() {
        return secondInt;
    }
}