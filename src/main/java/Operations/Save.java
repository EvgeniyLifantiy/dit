package Operations;

import Entity.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Евгений
 * @project dit
 */
public class Save implements Operation{

    @Override
    public List execute(List<Person> personList) {
        System.out.println("Save was selected");
        try ( Writer writer=new FileWriter(new File("src/main/resources/file.txt"))){
            for (Person p:personList) {
                writer.write(p.getFirstName()+" "+p.getLastName()+"\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
