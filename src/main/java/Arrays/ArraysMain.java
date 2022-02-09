package Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(3);
        System.out.println("for inserting...");
        arrays.insert(4);
        arrays.insert(5);
        arrays.insert(6);
        arrays.insert(7);
        arrays.insert(8);
        arrays.insert(9);
        arrays.print();
        System.out.println("After removing...");
        arrays.removeAt(2);
        arrays.print();
        System.out.format("index of %d is %d\n",8,arrays.indexOf(8));
        System.out.println(arrays.indexOf(10));
    }
}
