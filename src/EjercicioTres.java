import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {

    public static void main(String[] args) {

        List<Integer> origin = new ArrayList<>();
        for (int i=1; i <=10; i++) {
            origin.add(i);
        }

        List<Integer> evenNumbers= new ArrayList<>();
        for ( int num : origin){
            if (num%2==0 ){
                evenNumbers.add(num);
            }

        }

        System.out.println("Numeros:"+ origin);
        System.out.println("Numeros Pares:"+ evenNumbers);

    }
}
