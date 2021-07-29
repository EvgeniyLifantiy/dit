package Service;

import Entity.Person;

import java.util.*;

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
        SortedSet sortedSet= new TreeSet(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        while(true){
            Person person=new Person(scanner.next(),scanner.next());
            sortedSet.add(person);
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
