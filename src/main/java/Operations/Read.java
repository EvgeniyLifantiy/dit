package Operations;

import Entity.Person;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Евгений
 * @project dit
 */
public class Read implements Operation{



    @Override
    public List execute(List<Person> personList) {
        try ( Scanner scanner = new Scanner(Paths.get("src/main/resources/file.txt"))){

            while (scanner.hasNextLine()) {
                personList.add(new Person(scanner.next(),scanner.next()));
            }

        }catch (Exception e){
            System.out.println("ой");
        }

        System.out.println(personList);
        return personList;
    }
}
