/** Tuesday, November 13 2012
 *  Given a source string, find a sequence to get to a destination string by changing only one character per turn.
 *  Ex. Given source = CAT, destination = DOG, a valid sequence is CAT->COT->DOT->DOG. Any intermediate word must be in the dictionary, which is given.
 */
public static List<String> getSequence(Set<String> dictionary, String start, String goal) {
    Map<String, String> parent = new HashMap<String, String>();
    List<String> queue = new LinkedList<String>();
    queue.add(start);
    while (queue.notEmpty()) {
	String curr = queue.removeFirst();
	for (int i = 0; i < curr.length(); i++) {
	    for (char ch = 'a'; ch <= 'z'; ch++) {
		String next = curr.substring(0, i) + ch + curr.substring(i+1);
		if (dictionary.contains(next) && !parent.containsKey(next)) {
		    queue.addLast(next);
		    parent.put(next, curr);
		}
	    }
	}
    }
    if (!parent.containsKey(goal))
	return null;
    LinkedList<String> sequence = new LinkedList<String>();
    sequence.addLast(end);
    String curr = end;
    while (!curr.equals(start)) {
	curr = parent.get(curr);
	sequence.addFirst(curr);
    }
    return sequence;
}

    
		    