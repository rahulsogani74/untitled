package random;

public class Driver {

    public static void main(String[] args) {

        MasterDs ds = new inO1();
        ds.insert(4);
        ds.insert(4);
        ds.insert(3);
        boolean element = ds.getElement(2);
        System.out.println(" is found " + element);
        ds.insert(2);
        boolean element1 = ds.getElement(2);
        System.out.println(" is found " + element1);
        ds.insert(1);
        System.out.println(ds.getRandom());


    }
}
