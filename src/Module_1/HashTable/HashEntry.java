package Module_1.HashTable;

// This is the simple Java bean entity that will work as a skeleton of
// Our HashTable
public class HashEntry {
    private int key;
    private int value;

    public HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
