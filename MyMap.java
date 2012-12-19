import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** implement constructor, get, push, ensureCap, size, remove, keySet */

public class MyMap<K, V> {
    
    private static final DEFAULT_SIZE = 10;
    private MyEntry<K, V> values = new MyEntry[DEFAULT_SIZE];
    private int size = 0;
    
    public V get(K key) {
	for (int i = 0; i < values.length; i++) {
	    if (values[i] != null) {
		if (values[i].getKey().equals(key)) {
		    return values[i].getValue();
		}
	    }
	}
	return null;
    }

    public void put(K key, V value) {
	boolean insert = true;
	for (int i = 0; i < values.length; i++) {
	    if (values[i].getKey().equals(key)) {
		values[i].setValue(value);
		insert = false;
	    }
	}
	if (insert) {
	    ensureCap();
	    values[size++] = new MyEntry<K, V>(key, value);
	}
    }

    public void ensureCap() {
	if (size == values.length) {
	    values = Arrays.copyOf(values, size * 2);
	}
    }

    public int size() {
	return size;
    }
    
    public void remove(K key) {
	for (int i = 0; i < values.length; i++) {
	    if (values[i].getKey().equals(key)) {
		for (int start = i; start < values.length; start++) {
		    values[start] = new MyEntry<K, V>(values[start+1].getKey(), values[start+1].getValue());
		}
		size--;
	    }
	}
    }

    public Set<K> keySet() {
	Set<K> mySet = new HashSet<K>;
	for (int i = 0; i < values.length; i++) {
	    mySet.add(values[i].getKey());
	}
	return mySet;
    }
}
    
    