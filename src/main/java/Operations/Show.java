package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Show implements Operation{
    @Override
    public List<Person>  execute(List<Person> personList) {
        System.out.println("Show was selected");
        return personList;
    }
}
