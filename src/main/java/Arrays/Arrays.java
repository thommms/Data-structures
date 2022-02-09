package Arrays;

public class Arrays {
    private int[] items;
    private int count=0;
    public Arrays(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newArr = new int[count * 2];
            //copy all elements in array to new array
            for (int i = 0; i < count; i++) {
                newArr[i] = items[i];
            }
            items = newArr;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count-1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]) {
//                System.out.format("index of %d: %d",item,i);
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
