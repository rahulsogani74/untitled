package random;

import java.util.*;

public class inO1 implements  MasterDs<Integer>{

    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    @Override
    public boolean getElement(Integer elementToBeSearch) {
        return map.containsKey(elementToBeSearch);
    }

    /**
     * Insert to the list
     * put the element and index to it
     * @param element
     */
    @Override
    public void insert(Integer element) {
        if (map.containsKey(element)) return;

        int size = list.size();
        list.add(element);
        map.put(element, size);

    }

    /**
     * do the below things
     * @param element
     */
    @Override
    public void delete(Integer element) {
        if (!map.containsKey(element)) return;

        Integer index = map.get(element);
        int size = list.size();
        Integer lastElement = list.get(size - 1);
        Collections.swap(list, index, size -1);
        list.remove(size -1);
        map.put(lastElement, index);
    }

    @Override
    public Integer getRandom() {
        Random random = new Random();
        int index = random.nextInt(list.size() - 1);
        return  list.get(index);
    }
}
