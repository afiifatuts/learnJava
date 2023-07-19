import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<String> trainees = new ArrayList<>();

        trainees.add("Ian");
        trainees.add("Tsaqif");
        trainees.add("Ryan");
        trainees.add("Aurel");
        trainees.add("Arum");
        System.out.println(trainees.size());
        for (String trainee : trainees){
            System.out.println(trainee);
        }
        trainees.set(0,"Tsaani");
        System.out.println(trainees.get(0));
        System.out.println(trainees.contains("Tsaani"));


    }
}

//    Set<Rectangle> rectangles = new HashSet<>();
//       rectangles.add(new Rectangle(6.7,6.6));
//               rectangles.add(new Rectangle(6.0,6.1));
//               rectangles.add(new Rectangle(6.8,6.3));
//               rectangles.add(new Rectangle(6.6,6.4));
//               rectangles.add(new Rectangle(6.5,6.5));
//               rectangles.add(new Rectangle(6.5,6.5));
//
//               for (Rectangle r : rectangles){
//               System.out.println(r);
//               }