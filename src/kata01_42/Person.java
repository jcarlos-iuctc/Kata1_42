package kata01_42;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    int getAge() {
        
        Calendar now = GregorianCalendar.getInstance();
        final long Milliseconds_per_Year = (long) (365.25*24*60*60*1000L);
        return (int) ((now.getTimeInMillis()-birthdate.getTimeInMillis())/Milliseconds_per_Year);
    }



    
    
    
}
