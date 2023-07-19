import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Person devin = new Person("Devin");
    Person josh = new Person("Josh");
    Person jake = new Person("Jake");
    Person jason = new Person("Jason");
    Person alex = new Person("Alex");

    devin.addFriend(josh);
    devin.addFriend(jason);
    devin.addFriend(alex);
    josh.addFriend(alex);
    josh.addFriend(devin);

        System.out.println(devin+" memiliki "+devin.getFriendCount() +" yaitu "+devin.getFriends());
        System.out.println(josh+" memiliki "+josh.getFriendCount() +" yaitu "+ josh.getFriends());
        System.out.println(josh+ " dan " +devin.getName() +" memiliki teman yang sama sebanyak "+
                josh.getMutualFriendCount(devin) + " orang. Yaitu ");
        josh.printFriends(josh.getMutualFriends(devin));
    }
}


//import java.util.ArrayList;
//        import java.util.List;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person("Andi", List.of("Akmal", "Aurel", "Ali"));
//        Person person2 = new Person("Yuli", List.of("Akmal", "Ida", "Yuna"));
//        List<String> commonFriends = findFriends(person1, person2);
//
//        System.out.println("Teman yang sama antara " + person1.getName() + " dan " + person2.getName() + ":");
//        for (String friend : commonFriends) {
//            System.out.println(friend);
//        }
//    }
//    public static List<String> findFriends(Person person1, Person person2){
//        List<String> commonFriends = new ArrayList<>();
//        for (String friend : person1.getFriends()){
//            if(person2.getFriends().contains(friend)){
//                commonFriends.add(friend);
//            }
//        }
//        return commonFriends;
//    }
//
//}


