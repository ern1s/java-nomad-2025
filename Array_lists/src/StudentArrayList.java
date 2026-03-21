import java.util.Arrays;

public class StudentArrayList {
    private String[] data;
    private int size;

    public StudentArrayList() {
        data = new String[5];
        size = 0;
    }

    public void add(String value) {
        ensureCapacity();
        data[size++] = value;
    }

    public String get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void set(int index, String value) {
        checkIndex(index);
        data[index] = value;
    }

    public String remove(int index) {
        checkIndex(index);
        String removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean contains(String value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
    }
}
