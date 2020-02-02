package ArrayADT;

public interface ArrayADTInterface {
    boolean insert(int element);

    boolean delete();

    void traverse();

    boolean search(int element);

    int[] sort();

    boolean isEmpty();

    boolean isFull();
}
