public static void printLevel(Node n) {
    Queue<Node> queue = new Queue<Node>();
    if (n == null) return;
    int nodesincurrentlevel = 1;
    int nodesinnextlevel = 0;
    q.push(n);
    while (!queue.empty()) {
	Node current = queue.pop();
	nodesincurrentlevel--;
	if (current) {
	    System.out.print(current.data);
	    queue.push(current.left);
	    queue.push(current.right);
	    nodesinnextlevel+=2;
	}
	if (nodesincurrentlevel == 0) {
	    System.out.println();
	    nodesincurrentlevel = nodesinnextlevel;
	    nodesinnextlevel = 0;
	}
    }
}