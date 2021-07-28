package Service;

import Entity.Person;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Евгений
 * @project dit
 */
public class PersonServiceTest {

    PersonService personService=new PersonService();
    @Test
    public void fillEntityByCommandLinaArgsSuccess(){

        personService.fillEntityByCommandLineArgs(new Person(),new String[]{"Evgeniy","Lifantiy"});
    }

    @Test
    public void fillEntityByCommandLinaArgsNoArgs(){
        assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{ personService.fillEntityByCommandLineArgs(new Person(),new String[]{""}); });
    }

    @Test
    public void fillEntityFromCommandLineSuccess(Person person){
        personService.fillEntityFromCommandLine(new Person());
    }

}
