package Service;

import Entity.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Евгений
 * @project dit
 */
class PersonListServiceTest {

    PersonListService personListService=new PersonListService();
    @Test
    void fillListFromCommandLineSuccess() {
        personListService.fillListFromCommandLine(Arrays.asList(new Person(),new Person(),new Person()));
    }
}