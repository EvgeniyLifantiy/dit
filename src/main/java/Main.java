import Entity.Person;
import Service.PersonListService;
import Service.PersonService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person();
        PersonService personService=new PersonService();
        PersonListService personListService=new PersonListService();

        System.out.println("Filling fields from args");
        personService.fillEntityByCommandLineArgs(person,args);
        System.out.println(person);


        System.out.println("Filling from console");
        personService.fillEntityFromCommandLine(person);
        System.out.println(person);


        System.out.println("Filling list from console");
        personListService.fillListFromCommandLine(new ArrayList<>());
        System.out.println();
    }
}
