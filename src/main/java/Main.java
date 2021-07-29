import Entity.Person;
import Operations.*;
import Service.Menu;
import Service.PersonListService;
import Service.PersonService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Person person=new Person();
//        PersonService personService=new PersonService();
//        PersonListService personListService=new PersonListService();
//
//        System.out.println("Filling fields from args");
//        personService.fillEntityByCommandLineArgs(person,args);
//        System.out.println(person);
//
//
//        System.out.println("Filling from console");
//        personService.fillEntityFromCommandLine(person);
//        System.out.println(person);
//
//
//        System.out.println("Filling list from console");
//        System.out.println(personListService.fillListFromCommandLine(new ArrayList<>()));
//
//
//        System.out.println("Filling list from console and sort");
//        System.out.println(personListService.fillAndSortListFromCommandLine(new ArrayList<>()));


        Menu menu=new Menu(new HashMap<String,Operation>(
                Map.of( "Add",new Add(),
                        "Show",new Show(),
                        "Sort",new Sort(),
                        "Save",new Save(),
                        "Read",new Read(),
                        "Exit",new Exit()
        )));
        menu.startMenu();

    }
}
