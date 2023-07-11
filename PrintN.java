package array;

public class PrintN {

    public static void main(String[] args) {
        print(7);
    }

    public static void print(int num) {
        if (num == 1)  {
            System.out.print(num + " ");
            return;
        }
        print(num -1);
        System.out.print(num + " ");
    }
}
