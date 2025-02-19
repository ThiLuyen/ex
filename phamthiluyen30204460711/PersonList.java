package phamthiluyen30204460711;
import java.util.ArrayList;
public class PersonList {

    ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
        System.out.println("Added successfully!");
    }

    public boolean deletePersonById(String id) {
        for (Person person: people) {
            if (person.id.equals(id)) {
                people.remove(person);
                System.out.println("Deleted successfully");
                return true;
            }
        }
        return false;
    }

    public void editPersonById(String id) {
        for (Person person : people) {
            if (person.id.equals(id)) {
                person.editPerson();
                System.out.println("Edited successfully!");
                return;
            }
        }
        System.out.println("N/a");
    }

    public void displayAll() {
        for (Person person : people) {
            person.displayInfo();
        }
    }

}
