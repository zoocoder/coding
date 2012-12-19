/** An entry in a HashMap */

public class MyEntry<K, V> {
    private final K key;
    private V value;
    
    public MyEntry(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public getKey() {
	return key;
    }
    
    public getValue() {
	return value;
    }
    
    public setValue(V value) {
	this.value = value;
    }
}
    