import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> phoneList = phoneBook.get(name); 
        if (phoneList == null) {
            phoneList = new ArrayList<>();
        }
        phoneList.add(tel);
        phoneBook.put(name, phoneList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public void info() {
        System.out.println(phoneBook);
    }

}
