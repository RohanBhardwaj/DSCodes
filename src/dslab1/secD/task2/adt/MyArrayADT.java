package dslab1.secD.task2.adt;

import dslab1.secD.task2.interface_package.MyArrayInterface;

public class MyArrayADT implements MyArrayInterface {
    private int size;
    private int[] data;
    private int elementCount; //index for insert delete traverse

    public MyArrayADT(int size) {
        this.size = size;
        data = new int[this.size];
        elementCount = 0;
    }

    @Override
    public void traverse() {
        System.out.println("printing the array");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(data[i]);
            if (i != elementCount - 1) {
                System.out.print(",");
            }
        }
    }

    @Override
    public boolean insert(int element) {
        boolean response = false;
        if (isFull()) {
            data[elementCount] = element;
            elementCount++;
            response = true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response = false;
        if (elementCount == size) {
            response = true;
        }
        return response;
    }

    @Override
    public int delete() {
        int response = 0;
        if (!isEmpty()) {
            elementCount--;
            response = data[elementCount];
        }
        return response;

    }

    @Override
    public boolean search(int element) {
        for (int i = 0; i < elementCount; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] sort() {
        int[] response = data;
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }

        }
        return response;
    }

    private boolean isEmpty() {
        boolean response = false;
        if (elementCount == 0) {
            response = true;
        }
        return response;
    }
}
