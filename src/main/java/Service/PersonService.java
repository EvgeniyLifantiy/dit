package Service;

import com.company.Entity.Person;

/**
 * @author Евгений
 * @project DIT
 */
public class PersonService {

    public void fillEntityByCommandLinaArgs(Person person, String args[]){
        person.setFirstName(args[0]);
        person.setLastName(args[1]);
        System.out.println(person.getFirstName()+person.getLastName());
    }



}
