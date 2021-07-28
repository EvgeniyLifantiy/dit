import com.company.Entity.Person;
import com.company.Service.PersonService;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person();
        PersonService personServic=new PersonService();
        personServic.fillEntityByCommandLinaArgs(person,args);
    }
}
