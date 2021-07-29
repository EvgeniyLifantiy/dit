package Operations;

import Entity.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Евгений
 * @project dit
 */
public class Sort implements Operation{
    @Override
    public List execute(List<Person> personList) {
        System.out.println("Sort was selected");
        return personList.stream().sorted().collect(Collectors.toList());
    }
}
