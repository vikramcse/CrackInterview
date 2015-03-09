package Module_1.HashTable;

public class HashMap {
    // This will initialize a table size property
    private static final int TABLE_SIZE = 128;

    // Declare a table array which is of type HashEntry
    HashEntry table[];

    // A constructor to initialize table to TABLE_SIZE
    public HashMap() {
        table = new HashEntry[TABLE_SIZE];
    }

    // First the the hashed value of the key
    // If the current key doesn't have a empty slot and the key is already present then move to next slot
    // Else create a new object HashEntry for the current key and value and assign to the table with current hashCode
    public void put(int key, int value) {
        int hashCode = key % TABLE_SIZE;
        while (table[hashCode] != null && table[hashCode].getKey() != key)
            hashCode = (hashCode + 1) % TABLE_SIZE;

        table[hashCode] = new HashEntry(key, value);
    }

    // First the the hashed value of the key
    // If the current key doesn't have a empty slot and the key is already present then move to next slot
    // If the current slot is empty then return -1 else return current value
    public int get(int key) {
        int hashCode = key % TABLE_SIZE;
        while (table[hashCode] != null && table[hashCode].getKey() != key)
            hashCode = (hashCode + 1) % TABLE_SIZE;
        if (table[hashCode] == null)
            return -1;
        else
            return table[hashCode].getValue();
    }
}
