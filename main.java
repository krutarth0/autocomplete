import java.util.ArrayList;
public class Main {
    public static <e> void main(String[] args) {
        Tries contacts = new Tries();
        contacts.add("apple");
        contacts.add("app");
        contacts.add("angle");
        contacts.add("ball");
        contacts.add("bell");
        contacts.add("balcony");
        contacts.add("cat");
        contacts.add("catalyst");
        contacts.add("coco");

//        TrieNode crr = contacts.root;
//        contacts.printTries(crr);

        ArrayList<StringBuilder>  result1 = contacts.lookup("ba");
        System.out.println(result1.size());
        for(StringBuilder s : result1) System.out.printf("->%s ",s);


    }




}
