package GenericCustomList;

public interface IMyList<T> extends ICustomList<T>{

    CustomList<T> sublist(int start,int finish);
    boolean contains(T data);

    void set(int index, T data);
    void get(int index);

    int lastIndexOf(T data);

    int indexOf(T data);
    T[] toArray();
}
