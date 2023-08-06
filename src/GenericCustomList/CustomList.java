package GenericCustomList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;


public class CustomList<T> implements IMyList<T> {

    private T[] myList;

    public CustomList() {
        myList = (T[]) new Object[10];
    }

    public CustomList(int capacity) {
        myList = (T[]) new Object[capacity];
    }


    @Override
    public int size() {
//        int i= 1;
//       while (Stream.of(myList).iterator().hasNext()){ // Arrays.stream(myList).iterator().hasNext()
//           i+=1;
//       }
//       return i;

        int i = 0;
        for (T item : myList) {
            if (item == null)
                continue;
            i += 1;
        }
        // return myList.length;
        return i;
    }

    @Override
    public int getCapacity() {
        int i = 0;
        for (T item : myList) {
            i += 1;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(T data) {
        if (size() == getCapacity()) {
            T[] tempList = myList;
            myList = (T[]) new Object[getCapacity() * 2];
            for (int i = 0; i < myList.length; i++) {
                myList[i] = tempList[i];
            }
        }
            myList[(size())] = data;
    }


    @Override
    public void remove(int index) {

    }

    @Override
    public CustomList<T> sublist(int start, int finish) {
        return null;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public void set(int index, T data) {

    }

    @Override
    public void get(int index) {

    }

    @Override
    public int lastIndexOf(T data) {
        return 0;
    }

    @Override
    public int indexOf(T data) {
        return 0;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    public T[] getMyList() {
        return myList;
    }

    public void setMyList(T[] myList) {
        this.myList = myList;
    }
}
