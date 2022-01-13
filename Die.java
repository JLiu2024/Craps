public class Die {
    private int firstInt;
    private int secondInt;

    public Die() {
        firstInt = Math.random()*6+1;
        secondInt = Math.random()*6+1;
    }

    public int getSum() {
        return firstInt+secondInt;
    }
}