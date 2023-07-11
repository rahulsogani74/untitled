import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Address {

    private String zipCode;
    private String state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(zipCode, address.zipCode) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, state);
    }

    public static void main(String[] args) {
        List<Character> specialChars = Arrays.asList('!', '@');
        String s = "abc!d@gf@";
        //output - fgd!c@ba@
        char[] chars = s.toCharArray();
        int fPoint = 0;
        int bPoint = chars.length - 1;

        for (int i =0 ; i < chars.length ; i++) {

            if (bPoint < 0 || fPoint > chars.length - 1 || fPoint == bPoint) {
                System.out.println(new String(chars));
                return;
            }

            if (specialChars.contains(chars[fPoint])) {
                fPoint++;
            }

            if (specialChars.contains(chars[bPoint])) {
                bPoint--;
            }

            if (!specialChars.contains(chars[fPoint]) &&
                    !specialChars.contains(chars[bPoint])) {
                swap(chars, fPoint,bPoint);
                fPoint++;
                bPoint--;
            }
        }

    }

    private static void swap(char[] chars, int fPoint, int bPoint) {
        char temp = chars[fPoint];
        chars[fPoint] = chars[bPoint];
        chars[bPoint] = temp;
    }
}
