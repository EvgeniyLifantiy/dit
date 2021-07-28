package Service;

import Entity.Person;

import java.util.Scanner;


/**
 * @author Евгений
 * @project DIT
 */
public class PersonService {
    private Scanner scanner;

    public void fillEntityByCommandLineArgs(Person person, String args[]){
        if(args.length>1){
            person.setFirstName(args[0]);
            person.setLastName(args[1]);
        }

    }

    public void fillEntityFromCommandLine(Person person){
        scanner = new Scanner(System.in);
        person.setFirstName(scanner.next());
        person.setLastName(scanner.next());
    }





}
