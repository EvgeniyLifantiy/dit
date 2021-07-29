package Operations;

import Entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Clear implements Operation {

    @Override
    public List execute(List<Person> personList) {
        personList.clear();
        return personList;
    }
}
