import java.util.Arrays;

public class MyStack<E> {
    
    private int size = 0;
    private static final DEFAULT_SIZE = 10;
    private Object[] elements;
    
    public MyStackArray() {
	elements = new Object[DEFAULT_SIZE];
    }

    public void push(E e) {
	if (size == elements.length) {
	    ensureCap();
	}
	elements[size] = e;
	size++;
    }

    public void ensureCap() {
	elements = Arrays.copyOf(elements, size * 2);
    }

    public E pop() {
	E e = (E) elements[size-1];
	elements[size-1] = null;
	size--;
	return e;
    }
}