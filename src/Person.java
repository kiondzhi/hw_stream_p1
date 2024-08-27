public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return super.toString();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
