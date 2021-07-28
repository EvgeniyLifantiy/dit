import Entity.Person;
import Service.PersonService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person();
        PersonService personServic=new PersonService();
        personServic.fillEntityByCommandLineArgs(person,new String[]{"1","2"});


        personServic.fillEntityFromCommandLine(person);
    }
}
