package ArrayADT;

public class Main {
    public static void main(String[] args) {
        int size = 4;
        ArrayADTImplementationClass obj = new ArrayADTImplementationClass(size);
        //inserting data
        obj.insert(3);
        obj.insert(2);
        obj.insert(1);
        obj.insert(5);
        //traversing
        obj.traverse();
        //searching
        System.out.println(obj.search(2) ? "Found" : "Not Found");
        //delete last element
        System.out.println(obj.delete() ? "Deleted" : "Not deleted");
        obj.traverse();
        //sorting
        int[] arr = obj.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
