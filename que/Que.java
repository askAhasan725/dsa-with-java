// ==========================================
// File: ArrayQueue.java (Slides 7-8)
// ==========================================
class ArrayQueue {
    public static final int CAPACITY = 1000;
    private int[] data;
    private int f = 0;
    private int sz = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = new int[capacity];
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return (sz == 0);
    }

    public void enqueue(int e) throws IllegalStateException {
        if (sz == data.length) {
            throw new IllegalStateException("Queue is full.");
        }
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public int first() {
        if (isEmpty()) {
            return -1; // a garbage value.
        }
        return data[f];
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // a garbage value.
        }
        int answer = data[f];
        data[f] = 0;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }
}

// ==========================================
// File: LinkedQueue.java (Slide 9)
// ==========================================
// Note: Requires singlyLinkedList.SinglyLinkedList as shown in the slide
import singlyLinkedList.SinglyLinkedList;

class LinkedQueue {
    private SinglyLinkedList list = new SinglyLinkedList();

    public LinkedQueue() {
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(char element) {
        list.addLast(element);
    }

    public char first() {
        return list.first();
    }

    public char dequeue() {
        return list.removeFirst();
    }
}
