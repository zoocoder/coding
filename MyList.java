import java.util.Arrays;
/** Implement List using Arrays */

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;
    private Object[] elements;

    public MyList() {
	elements = new Object[DEFAULT_SIZE];
    }

    public void add(E e) {
	if (size == elements.length) {
	    ensureCap()
	}
	elements[size] = e;
	size++;
    }

    public void ensureCap() {
	elements = Arrays.copyOf(elements, size * 2);
    }

    public E get(int i) {
	if (int i >= size || i < 0) {
	    throw new IndexOutOfBoundsException("Invalid index " + i);
	}
	return (E) elements[i];
    }
}
