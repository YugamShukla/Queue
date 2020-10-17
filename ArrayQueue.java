package Queue;

public class ArrayQueue {
    private int size;
    private int capacity = 100;
    private int[] data;
    int front = 0;
    int back = 0;

    public ArrayQueue() {
        size = 0;
        data = new int[5];
    }

    public void Enque(int value) {
        if (size >= capacity) {
            System.out.println("Queue is full.");
           
        } 
        else {
            size++;
            data[back] = value;
            back = (++back) % (capacity - 1);
        }
    }

    public void  Deque() {
        int value;
        if (size <= 0) {
            System.out.println("Queue is empty.");
        } 
        else {
            size--;
            value = data[front];
            front = (++front) % (capacity - 1);
        }
    }

    public void print(){
        for (int i =front; i <back; i++) {
            System.out.println(" "+data[i]);
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue que = new ArrayQueue();
        que.Enque(10);
        que.Enque(20);
        que.print();
        que.Deque();
        que.print();
    }
}