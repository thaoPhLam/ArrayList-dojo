import java.util.Arrays;

public class ArrayList {

    private String[] storage;
    private int position;

    public ArrayList() {
        storage = new String[10];
    }

    public void addItem(String item) {
        storage[position++] = item;
    }

    public void removeItem(int index) {
        System.out.println("The removed item: " + storage[index]);
        storage[index] = null;
        int tmpIndex = index;
        while (tmpIndex < 9) {
            storage[tmpIndex] = storage[tmpIndex + 1];
            storage[tmpIndex + 1] = null;
            tmpIndex++;
        }
    }

    public String getItem(int index) {
        return storage[index];
    }

    public void size() {
        System.out.println(storage.length);
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "storage=" + Arrays.toString(storage) +
                '}';
    }
}
