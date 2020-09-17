import lombok.Data;

public class LombokTest {
    public static void main(String[] args) {
        Person person = new Person("cisodsn","18","001");
        System.out.println(person.getAge());

    }
}


@Data
class Person {
    private String name;

    private String age;
    private String id;

    public Person(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
