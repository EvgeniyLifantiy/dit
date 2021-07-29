package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Exit implements Operation{
    @Override
    public List execute(List<Person> personList) {
        System.out.println("Exit was selected");
        System.exit(0);
        return null;
    }
}
