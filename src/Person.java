public class Person {
    String name;
    int age;
    String livePlase;

    public Person(String name, int age, String livePlase) {
        this.name = name;
        this.age = age;
        this.livePlase = livePlase;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", livePlase='" + livePlase + '\'' +
                '}';
    }
}
