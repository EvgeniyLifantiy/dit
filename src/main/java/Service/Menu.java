package Service;

import Entity.Person;
import Operations.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Евгений
 * @project dit
 */
public class Menu {

    Map<String,Operation> operationMap;

    Scanner scanner=new Scanner(System.in);

    public Menu(Map<String,Operation> operationMap) {
        this.operationMap = operationMap;
    }

    public void startMenu()  {
        help();
        while (true){
            if(startOperation(new ArrayList<>())==null){
                System.out.println("Incorrect command");
                startMenu();
            }
        }
    }

    public List<Person> startOperation(List<Person> personList){
        Operation operation=operationMap.get(scanner.next());
        if(operation!=null) {
            return operation.execute(personList);
        }
        return null;
    }

    public void help(){
        System.out.println("Menu");
        System.out.println("List of operations:");
        for (String key : operationMap.keySet()) {
            System.out.println(key);
        }
    }



}

