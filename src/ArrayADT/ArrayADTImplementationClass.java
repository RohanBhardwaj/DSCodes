package ArrayADT;

public class ArrayADTImplementationClass implements ArrayADTInterface {
    private int[] data;
    private int size;
    private int end;

    public ArrayADTImplementationClass(int size) {
        this.size = size;
        data = new int[this.size];
        end = 0;
    }

    public boolean isFull() {
        return end == size;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int element) {
        if (!isFull()) {
            data[end] = element;
            end++;
            return true;
        }
        return false;
    }

    public void traverse() {
        System.out.println("Traversing.....");
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
    }

}
