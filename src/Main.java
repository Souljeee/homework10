import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Компьютер", "Книги", "Монитор", "Компьютер","Полка", "Шкаф", "Монитор", "Яблоко","Шкаф","Календарь"));
        //checkSameWords(words);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ваня","53543");
        phoneBook.add("Егор","5434353");
        phoneBook.add("Ваня","6645466");
        System.out.println(phoneBook.get("Ваня"));
    }

    public static void checkSameWords(ArrayList<String> words){
        Set<String> set = new LinkedHashSet<>(words);
        System.out.println(set);
        for(String setIter : set){
            int n = 0;
            for(String wordsIter : words){
                if(setIter.equals(wordsIter)){
                    n++;
                }
            }
            System.out.println(setIter + ": " + n);
        }
    }
}
