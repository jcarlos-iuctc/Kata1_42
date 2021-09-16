package kata01_42;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Antonio", new Date(80, 0, 1));
        
        System.out.println(person.getName()+" tiene " + person.getAge() + " años.");
    }
    
}
