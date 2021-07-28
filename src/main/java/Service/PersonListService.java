package Service;

import Entity.Person;

import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Евгений
 * @project dit
 */
public class PersonListService {

    private Scanner scanner=new Scanner(System.in);

    public List fillListFromCommandLine(List<Person> personList){
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

    public List fillAndSortListFromCommandLine(List<Person> personList){
        SortedSet sortedSet= new TreeSet();
        while(true){
            Person person=new Person(scanner.next(),scanner.next());
            sortedSet.add(person);
            personList.add(person);
            System.out.println(person);
            System.out.println("Do you want continue adding?");
            if(!scanner.next().equals("Yes")){
                System.out.println("Added successful");
                personList.addAll(sortedSet);
                return personList;
            }
        }
    }


}
