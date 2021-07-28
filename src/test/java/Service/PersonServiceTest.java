package Service;

import Entity.Person;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Евгений
 * @project dit
 */
public class PersonServiceTest {

    private void yourInputFromConsole(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }



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
    public void fillEntityFromCommandLineSuccess( ){

        yourInputFromConsole(" First Second");
        Person person=new Person("E","G");
        personService.fillEntityFromCommandLine(person);
        assertEquals(new Person("First","Second"),person);
    }

    @Test
    public void fillEntityFromCommandLineFailed( ){

        yourInputFromConsole(" 1 1");
        Person person=new Person("E","G");
        personService.fillEntityFromCommandLine(person);
        assertNotEquals(new Person("First","Second"),person);
    }




}
