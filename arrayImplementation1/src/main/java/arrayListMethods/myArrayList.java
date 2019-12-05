package arrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class myArrayList {
    public static void main(String args[]) {
        myArrayList elem = new myArrayList();
        try {
            int capacity = elem.getArrayListCapacity();
            List<String> stringArrayList = elem.startArrayList(capacity);
            stringArrayList = elem.initArrayList(stringArrayList, capacity);
            elem.viewArrayList(stringArrayList, "1) ArrayList:");

            String[] myArray = elem.toArrayConvert(stringArrayList);
            elem.viewMyArray(myArray, "2) Method toArray():");

            int size = elem.getSizeArray(myArray);
            System.out.println("3) Method size(): " + size);

            String elemMyArray = "elemNew";
            String[] newMyArray = elem.addMyArray(myArray, elemMyArray);
            elem.viewMyArray(newMyArray, "4) Method add():");

            int indexRemove = elem.getIndexRemove();
            newMyArray = elem.removeMyArray(myArray, indexRemove);
            elem.viewMyArray(newMyArray, "5) Method remove() - remove [" + indexRemove +"] element:");

            newMyArray = elem.clearMyArray(myArray.length);
            elem.viewMyArray(newMyArray, "5) Method clear():");

            elemMyArray = "elem6";
            boolean flag = elem.containsMyArray(myArray, elemMyArray);
            elem.viewMyArray(myArray, "6) Method contains():");
            System.out.println("myArray.contains(" + elemMyArray + ") = " + flag);

        }  catch (NullPointerException e) {
            System.out.println("Method main: Exception " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Method main: Exception " + e);
        }
    }

    public int getArrayListCapacity() {
        int capacity = 10;
        return capacity;
    }

    public List<String> startArrayList (int capacity) throws NullPointerException {
        if (capacity > 0) {
            List<String> stringArrayList = new ArrayList<String>(capacity);
            return stringArrayList;
        } else {
            if (capacity < 0) {
                System.out.println("Method startArrayList: Negative capacity of ArrayList is not possible");
                return null;
            } else {
                System.out.println("Method startArrayList: Capacity of ArrayList must be > 0");
                return null;
            }
        }
    }

    public List<String> initArrayList(List<String> stringArrayList, int capacity) throws NullPointerException {
        if (capacity > 0) {
            for (int i = 0; i < capacity; i++ ) {
                stringArrayList.add("elem" + i);
            }
            return stringArrayList;
        } else {
            if (capacity < 0) {
                System.out.println("Method initArrayList: Not possible to initialize stringArrayList");
                return null;
            } else {
                System.out.println("Method initArrayList: Capacity of stringArrayList is 0");
                return null;
            }
        }
    }

    public void viewArrayList(List<String> stringArrayList, String message) {
          System.out.println(message);
          System.out.print(stringArrayList);
          System.out.println();
    }

    public void viewMyArray(String[] myArray, String message) {
        if (myArray.length > 0) {
            System.out.println(message);
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println();
    }

    public String[] toArrayConvert (List<String> stringArrayList) throws NullPointerException {
         if (stringArrayList.size() > 0 ) {
            String[] myArray = new String[stringArrayList.size()];
            for (int i = 0; i < stringArrayList.size(); i++) {
                myArray[i] = stringArrayList.get(i);
            }
            return myArray;
        } else {
             if (stringArrayList.size() == 0) {
                throw new NullPointerException("Method toArrayConvert: Not possible to create myArray, no elements in stringArrayList");
             } else {
                 throw new ArrayIndexOutOfBoundsException("Method toArrayConvert: Negative capacity of myArray is not possible");
             }
        }
    }

    public int getSizeArray(String[] myArray) {
        if (myArray.length == 0) {
            return myArray.length;
        } else {
            int sizeArray = 0;
            for (String elem: myArray) {
                sizeArray++;
            }
            return sizeArray;
        }
    }

    public String[] addMyArray(String[] myArray, String elemMyArray) {
        if (myArray.length >= 0) {
            String[] newMyArray = new String[(myArray.length * 3) / 2 + 1];
            int i;
            for (i = 0; i < myArray.length; i++) {
                newMyArray[i] = myArray[i];
            }
            newMyArray[i] = elemMyArray;
        return newMyArray;
        } else {
            return null;
        }
    }

    public int getIndexRemove() {
        int indexRemove = 8;
        return indexRemove;
    }

    public String[] removeMyArray(String[] myArray, int indexRemove) throws ArrayIndexOutOfBoundsException {
        if (myArray.length >= indexRemove) {
            String[] newMyArray = new String[myArray.length - 1];
            int i;
            for (i = 0; i < indexRemove; i++) {
                newMyArray[i] = myArray[i];
            }
            for (i = indexRemove + 1; i < myArray.length; i++) {
                newMyArray[i-1] = myArray[i];
            }
            return newMyArray;
        } else {
            System.out.println("Method remove(): There is no element with such index in array");
            return null;
        }
    }

    public String[] clearMyArray(int length) {
        String[] clearArray = new String[length];
        for (String elem: clearArray) {
            elem = "null";
        }
        return clearArray;
    }

    public boolean containsMyArray(String[] myArray, String elemMyArray) {
        boolean flag = false;
        for (String elem:myArray) {
            if (elem.hashCode() == elemMyArray.hashCode()) {
                flag = true;
            }
        }
        return flag;
    }

}
