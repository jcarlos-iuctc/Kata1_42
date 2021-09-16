package kata01_42;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar birthdate = GregorianCalendar.getInstance();
        birthdate.set(1980, 1, 1);
        Person person = new Person("Antonio", birthdate);
        
        System.out.println(person.getName()+" tiene " + person.getAge() + " años.");
    }
    
}
