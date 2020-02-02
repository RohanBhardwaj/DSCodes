package ArrayADT;

public interface ArrayADTInterface {
    boolean insert(int element);

    int delete();

    void traverse();

    boolean search(int element);

    int[] sort();

    boolean isEmpty();

    boolean isFull();
}
