public class Person {
    private String name;
    private String surname;
    private int age;
    private int maxWord;
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname, int age, int maxWord){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.maxWord = maxWord;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public int getMaxWord(){return maxWord;}

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
