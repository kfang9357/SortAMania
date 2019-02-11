public class Thingy {
    private int value;
    public Thingy(int value)
    {
        this.value = (int)(Math.random()*10000);
    }

    @Override
    public int compareTo(Thingy other)
    {
        return this.value - other.value;
    }
}
