// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hero zilong = new Hero("Zilong",200,10,10);
        Hero nana = new Hero("Nana", 250, 5,10);
        Hero kadita = new Hero("Kadita", 250, 5,20);
        Monster monster = new Monster("Monster", 20);

        System.out.println("Before");
        System.out.println(nana);

        zilong.attack(nana);

        System.out.println("After");
        System.out.println(nana);

        kadita.getHeal(nana);

        System.out.println("After heal");
        System.out.println(nana);

        System.out.println(zilong);



    }
}