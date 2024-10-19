import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
            System.out.println(numbers);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Object num:numbers) {
            System.out.println(num);
        }

        int index = numbers.size() - 1;
        while (index >= 0) { System.out.println(numbers.get(index));
            index--;
        }

    }

}
