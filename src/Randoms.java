import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Randoms random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        int min = this.min;
        int max = this.max;
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                Random random = new Random();
                return random.nextInt(min, max + 1);
            }
        };
    }
}
