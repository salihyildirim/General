package GenericCustomList;

public interface ICustomList<T> {
    int size();
    int getCapacity();
    boolean isEmpty();
    void clear();
    void add(T data);
    T remove(int index);
    String toString();
}
