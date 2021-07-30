# Dit for All Teams

## Entity  ##
  ### Person ###
  * FirstName
  * LastName

## Tasks

### 1.Filling person from console args 

#### Class  : PersonService , method fillEntityByCommandLineArgs (Person person, String args[])

#### Test   : src/test/java/Service/PersonServiceTest 

### 2.Filling person from command line
   
#### Class  : PersonService , method fillEntityFromCommandLine (Person person)

#### Test   : src/test/java/Service/PersonServiceTest 

### 3.Filling personList from command line in endless cycle

#### Class  : PersonListService , method fillListFromCommandLine (List<Person> personList)

### 4.Filling personList from command line in endless cycle

#### Class  : PersonListService , method fillAndSortListFromCommandLine(List<Person> personList)

### 5.Interactive Menu 
  
Menu-system from Interactive Menu Tasks developed using oop concepts.
 
 #### Class  : Menu 
  
  ####  To Menu class while creating we must put list with operions 
  
  ####  Client can create own operation map
  
  ####  Operation must implement Operation interface
  
  
  #### Methods 
  
* startMenu()- call help and startOperation in endless cycle
  
* startOperation(List<Person> personList) - starts up operation from operationMap

* help() - show available commands
  
  
#### Test Methods src/test/java/OperationTest.java
   

   
