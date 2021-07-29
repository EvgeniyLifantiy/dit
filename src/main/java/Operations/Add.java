package Operations;

import Entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Евгений
 * @project dit
 */
public class Add implements Operation{
    Scanner scanner=new Scanner(System.in);
    @Override
    public List<Person>  execute(List<Person> personList) {
        System.out.println("Add was selected");
        while(true){
            Person person=new Person(scanner.next(),scanner.next());
            personList.add(person);
            System.out.println(person);
            System.out.println("Do you want continue adding?");
            if(!scanner.next().equals("Yes")){
                System.out.println("Added successful");
                return personList;
            }
        }
    }
}
