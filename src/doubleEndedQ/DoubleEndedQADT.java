package doubleEndedQ;

public interface DoubleEndedQADT {
    void enqueueRear(int item);

    void enqueueFront(int item);

    void dequeueRear();

    void dequeueFront();

    void showQueue();
}
