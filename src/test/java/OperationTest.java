import Entity.Person;
import Operations.Add;
import Operations.Clear;
import Operations.Sort;
import Service.PersonService;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Евгений
 * @project dit
 */
public class OperationTest {

    private void yourInputFromConsole(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void AddTestSuccess(){
        yourInputFromConsole("G G Exit");
        assertEquals(new Add().execute(new ArrayList<>()),
                     new ArrayList(Arrays.asList(new Person("G","G"))));

    }

    @Test
    public void AddTestFailed(){
        yourInputFromConsole("G h Exit");
        assertNotEquals(new Add().execute(new ArrayList<>()),
                new ArrayList(Arrays.asList(new Person("G","G"))));
    }

    @Test
    public void ClearTest(){
        ArrayList arrayList=new ArrayList(Arrays.asList(new Person("G","G")));
        assertEquals(new Clear().execute(arrayList),new ArrayList());

    }

    @Test
    public void SortTest(){
        List<Person> arrayList=new ArrayList();
        arrayList.add(new Person("A","A"));
        arrayList.add(new Person("G","G"));
        arrayList.add(new Person("B","B"));
        assertEquals(new Sort().execute(arrayList).get(1).getLastName(),
                        new Person("B","B").getLastName());

    }
}
