// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
        //System.out.println(Gender.values());

        for (Gender g : Gender.values()){
            System.out.println(g);
        }

        System.out.println(Gender.values()[0]);
    }
}

