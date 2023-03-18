public class Person {
    private String name;
    private String surname;
    private int age;
    private int numberWords;
    private int maxWord;
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberWords = countElement(surname);
    }
    public Person(String name, String surname, int age, int maxWord){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.maxWord = maxWord;
        numberWords = countElement(surname);
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
    public int getNumberWords(){
        return numberWords;
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
