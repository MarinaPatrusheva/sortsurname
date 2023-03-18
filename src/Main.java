import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Жозеф", "Гей-Люссак", 26, 2));
        list.add(new Person("Николай", "Миклухо-Маклай", 32, 2));
        list.add(new Person("Михаил", "Голенищев-Кутузов", 26, 2));
        list.add(new Person("Андрей", "Боголюбский", 47, 2));
        list.add(new Person("Рафаэль", "Ван дер Ваарт", 23, 2));
        list.add(new Person("Антон", "Бируля-Бельшицкий", 14, 2));
        list.add(new Person("Джорж", "Буда-Жемчужников", 15, 2));
        list.removeIf(person -> person.getAge() < 18);
        Collections.sort(list, new PersonComparator());
        System.out.println(list);
    }
}