public class Thingy implements Comparable<Thingy> {
    private int value;
    public Thingy(int value)
    {
        this.value = value;
    }

    public int compareTo(Thingy other)
    {
        return this.value - other.value;
    }
}
