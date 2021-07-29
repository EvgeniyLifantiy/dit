package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Sort implements Operation{
    @Override
    public List execute(List<Person> personList) {
        System.out.println("Sort was selected");
        return null;
    }
}
