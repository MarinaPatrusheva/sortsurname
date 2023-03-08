import java.util.*;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int person1 = countElement(p1.getSurname());
        int person2 = countElement(p2.getSurname());
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
    private int countElement(String text){
        int count = 0;
        for(char element : text.toCharArray()){
            if(element == '-'){
                count += 1;
            }
            if(element == ' '){
                count += 1;
            }
        }
        return count;
    }
}
