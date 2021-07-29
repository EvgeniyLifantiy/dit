package Operations;

import Entity.Person;

import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public interface Operation {
    List execute(List<Person> personList);
}
