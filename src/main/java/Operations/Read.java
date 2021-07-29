package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Read implements Operation{
    @Override
    public List execute(List<Person> personList) {
        System.out.println("Read was selected");
        return null;
    }
}
