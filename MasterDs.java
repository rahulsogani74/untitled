package random;

public interface MasterDs<T> {

     boolean getElement(T elementToBeSearch);

     void insert(T element);

     void delete(T element);

     T getRandom();


}
