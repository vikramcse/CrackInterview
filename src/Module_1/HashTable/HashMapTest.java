package Module_1.HashTable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {

    HashMap map;
    @Before
    public void createInstanceOfHashMap() {
        System.out.println("created a new Hash Map");
        map = new HashMap();
    }

    @Test
    public void insertDataAndGet() {
        map.put(1001, 800);
        map.put(1002, 955);
        map.put(1008, 999);
        assertEquals("Check the key value is right", 955, map.get(1002));
    }

    @Test
    public void checkForTheUnknownValue() {
        assertEquals("The Value must be -1", -1, map.get(1010));
    }
}