package GenericCustomList;


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
                break;
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
        return size() == 0;
//        boolean value = false;
//
//        for (int i = 0; i < size(); i++) {
//            if (myList[i] != null) {
//                value = true;
//                break;
//            }
//
//        }
//        return value;
    }

    @Override
    public void clear() {
        for(int i = 0; i<size(); i++){
            myList[i]=null;
        }
    }

    @Override
    public void add(T data) {
        if (size() == getCapacity()) {
            T[] tempList = myList;
            myList = (T[]) new Object[getCapacity() * 2];
            for (int i = 0; i < tempList.length; i++) {
                myList[i] = tempList[i];
            }
        }
        myList[(size())] = data;
    }


    @Override
    public T remove(int index) {
        if (index >= 0 && index < size()) {
            T removedElement = myList[index];

            while (index < size() - 1) {
                myList[index] = myList[index + 1];
                index += 1;
            }
            myList[size() - 1] = null;
            return removedElement;
        }
        return null;
    }

    @Override
    public CustomList<T> sublist(int start, int finish) {
        if (start<0 && finish>=size() || start>=finish) return null;

        CustomList<T> customList = new CustomList<>();

        for(int i= start ; i<finish; i++){
            customList.add(myList[i]);
        }
        return customList;
    }

    @Override
    public boolean contains(T data) {
        boolean value = false;
        for(int i = 0 ;i<size();i++) {
            if(myList[i]==data) { value = true; break;}
        }
        return value;
    }

    @Override
    public T set(int index, T data) {
        if (index >= 0 && myList[index] != null) {
            myList[index] = data;
            return myList[index];
        } else return null;
    }

    @Override
    public T get(int index) {
//        if(index > size()) return null;
//        return myList[index];
        return (index >= 0 && index < size()) ? myList[index] : null; //ternary operator

    }

    @Override
    public int lastIndexOf(T data) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (myList[i].equals(data)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (myList[i].equals(data)) {
                index = i;
                break; // differince row of lastIndexOf
            }
        }
        return index;
    }

    @Override
    public T[] toArray() {
        T[] newArray = myList;
        for (int i= 0; i<size(); i++){
            newArray[i]=myList[i];
        }
        return newArray;
    }

    public T[] getMyList() {
        return myList;
    }

    public void setMyList(T[] myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            result.append(myList[i]);
            if (i < size() - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
