public interface Deque<Item> {

    /** Adds an item to the front of the Deque. */
    public void addFirst(Item x);

    /** Adds an item to the back of the Deque. */
    public void addLast(Item y);

    /** Returns true if deque is empty, false otherwise. */
    public boolean isEmpty();

    /** Returns the number of items in the Deque. */
    public int size();

    /** Prints the items in the Deque from first to last, separated by a space. */
    public void printDeque();

    /** Removes and returns the item at the front of the Deque.
     * If no such item exists, returns null. */
    public Item removeFirst();

    /** Removes and returns the item at the back of the Deque.
     * If no such item exists, returns null. */
    public Item removeLast();

    /** Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth.
     * If no such item exists, returns null.
     * Must not alter the deque! */
    public Item get(int index);

}
