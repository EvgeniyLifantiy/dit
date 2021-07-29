package Operations;

import Entity.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Евгений
 * @project dit
 */
public class Sort implements Operation{
    @Override
    public List<Person> execute(List<Person> personList) {
        System.out.println("Sort was selected");
        return personList.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());
    }
}
