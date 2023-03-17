import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Жозеф", "Гей-Люссак", 26, 2));
        list.add(new Person("Николай", "Миклухо-Маклай", 32, 2));
        list.add(new Person("Михаил", "Голенищев-Кутузов", 26, 2));
        list.add(new Person("Андрей", "Боголюбский", 47, 2));
        list.add(new Person("Рафаэль", "Ван дер Ваарт", 23, 2));

        Comparator<Person> comparator;
        Collections.sort(list, comparator =(Person p1, Person p2) -> {
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
        });
        System.out.println(list);
    }
}