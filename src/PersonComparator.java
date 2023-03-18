import java.util.*;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int person1 = p1.getNumberWords();
        int person2 = p2.getNumberWords();
        if(person1 > p1.getMaxWord()){
            person1 = p1.getMaxWord();
        }
        if(person2 > p2.getMaxWord()){
            person2 = p2.getMaxWord();
        }
        if(person1 != person2){
            return Integer.compare(person1, person2);
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
}
