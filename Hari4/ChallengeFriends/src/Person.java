import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private ArrayList<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {this.name = name;}

    public void addFriend(Person friend){
       this.friends.add(friend);
    }
    public void removeFriend(Person person){
        this.friends.remove(person);
    }

    public ArrayList<Person> getFriends(){
        return this.friends;
    }

    public ArrayList<Person> getMutualFriends(Person person){
        ArrayList<Person> friends = new ArrayList<>();
        for (Person friend: this.friends){
            if (person.getFriends().contains(friend)){
                friends.add(friend);
            }
        }
        return friends;
    }

    public int getFriendCount(){return this.friends.size();}

    public int getMutualFriendCount(Person person){
        int count =0;
        for (Person friend:this.friends){
            if (person.getFriends().contains(friend)){
                count++;
            }
        }
        return count;
    }

    public void  printFriends(ArrayList<Person> friends){
        for (Person friend: friends){
            System.out.println(friend.getName()+" ");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
