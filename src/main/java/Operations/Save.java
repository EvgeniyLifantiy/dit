package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Save implements Operation{
    @Override
    public List execute(List<Person> personList) {
        System.out.println("Save was selected");
        return null;
    }
}
