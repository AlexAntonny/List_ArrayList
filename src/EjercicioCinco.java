
import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);

        }

        Integer[] numArray = numbers.toArray(new Integer[0]);

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numbers.get(i));
        }


    }

}
