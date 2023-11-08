

import com.workintech.model.Person;
import com.workintech.model.Wall;

public class Main {
    public static void main(String[] args) {
        Person person2 = new Person("John", "Doe", 20);
        Person person = new Person("Deniz", "Demir", 24, true, new String[]{"İng", "Turk"}, "İzmit");

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person);

        System.out.println("------------------");

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
