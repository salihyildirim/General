package GenericExamples;

public interface IMyGeneric<T extends IBaseModel> {
    void save(T t);
    void update(T t);
}
