/** Implement three stacks with an array. Fixed length stacks. */
public class ThreeStacks {
    int stackSize = 100;
    int[] buffer = new int[stackSize * 3];
    int[] stackPointer = {-1, -1, -1}; //Keeps track of top element of each stack.

    void push(int stackNum, int value) throws Exception {
	if (stackPointer[stackNum] + 1 >= stackSize) {
	    throws new Exception("Out of space.");
	}

	stackPointer[stackNum]++;
	buffer[realPosition(stackNum)] = value;
    }

    int pop(int stackNum) throws Exception {
	if (stackPointer[stackNum] == -1) {
	    throws new Exception("Nothing to pop.");
	}

	int result = buffer[realPosition(stackNum)];
	buffer[realPosition(stackNum)] = 0;
	stackPointer[stackNum]--;
	return result;
    }

    int peek(int stackNum) {
	return buffer[realPosition(stackNum)];
    }

    boolean isEmpty(int stackNum) {
	return stackPointer[stackNum] == -1;
    }

    int realPosition(int stackNum) {
	return stackNum*stackSize+stackPointer[stackNum];
    }
}