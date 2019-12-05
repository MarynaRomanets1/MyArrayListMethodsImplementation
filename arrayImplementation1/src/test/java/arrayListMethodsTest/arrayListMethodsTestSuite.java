package arrayListMethodsTest;

import arrayListMethods.myArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;


public class arrayListMethodsTestSuite {
    myArrayList result = new myArrayList();

    @Test
    public void toArrayConvert() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        assertNotNull(myArrayTest);
    }

    @Test (expected = NullPointerException.class)
    public void toArrayConvertNegative() throws NullPointerException {
        List<String> stringArrayList = result.startArrayList(0);
        assertNull(result.toArrayConvert(stringArrayList));
    }

    @Test
    public void getSizeArray() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        assertNotNull(result.getSizeArray(myArrayTest));
    }

    @Test
    public void getSizeArrayNegative() {
        String[] myArrayTest = new String[0];
        assertEquals(0, result.getSizeArray(myArrayTest));
    }

    @Test
    public void addMyArray() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        assertNotNull(result.addMyArray(myArrayTest, "elemTest"));
    }

    @Test
    public void removeMyArray() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        int indexRemove = myArrayTest.length - 1;
        assertNotNull(result.removeMyArray(myArrayTest, indexRemove));
    }

    @Test
    public void removeMyArrayNegative() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        int indexRemove = myArrayTest.length + 1;
        assertNull(result.removeMyArray(myArrayTest, indexRemove));
    }

    @Test (expected = NullPointerException.class)
    public void clearMyArray() throws NullPointerException {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        myArrayTest = result.clearMyArray(myArrayTest.length);
        for (String elem: myArrayTest) {
            elem.hashCode();
        }
    }

    @Test
    public void containsMyArray() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        String elemTest = "elem0";
        assertTrue(result.containsMyArray(myArrayTest, elemTest));
    }

    @Test
    public void containsMyArrayNegative() {
        int capacity = result.getArrayListCapacity();
        List<String> stringArrayList = result.startArrayList(capacity);
        stringArrayList = result.initArrayList(stringArrayList, capacity);
        String[] myArrayTest = result.toArrayConvert(stringArrayList);
        String elemTest = "elemNegative";
        assertFalse(result.containsMyArray(myArrayTest, elemTest));
    }
}
