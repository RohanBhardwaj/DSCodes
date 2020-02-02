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
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }

    public boolean delete() {
        if (!isEmpty()) {
            end--;
            System.out.println(data[end]);
            return true;
        }
        return false;
    }

    @Override
    public boolean search(int element) {
        for (int i = 0; i < end; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] sort() {
        int[] sortedArray = data.clone();// cloning the array
        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
