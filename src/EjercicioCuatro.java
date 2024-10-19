import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {
    public static void main(String[] args) {

        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "Cherry";
        String date4 = "Date";
        String fruit4 = "Elderberry";
        String fruit5 = "Fig";

        List<String> list1= new ArrayList<>();
        list1.add(fruit1);
        list1.add(fruit2);
        list1.add(fruit3);
        list1.add(date4);

        List<String> list2= new ArrayList<>();
        list2.add(fruit2);
        list2.add(date4);
        list2.add(fruit4);
        list2.add(fruit5);

        List<String> commonElements=new ArrayList<>();

        for (String comun : list1){
            if (list2.contains(comun)){
                commonElements.add(comun);
            }

        }

        System.out.println("Elementos Comunes:" + commonElements);


    }
}
