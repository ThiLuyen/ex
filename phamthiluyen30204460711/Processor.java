package phamthiluyen30204460711;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:"
                    + "\n0. Exit"
                    + "\n1. Add Student"
                    + "\n2. Add Teacher"
                    + "\n3. Display All"
                    + "\n4. Edit Person by ID"
                    + "\n5. Delete Person by ID"
                    + "\nYour choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                        System.out.println("Exiting");
                        break;
                case 1: {
                    Student student = new Student();
                    student.addPerson(scanner);
                    personList.addPerson(student);
                    break;
                }
                case 2: {
                    Teacher teacher = new Teacher();
                    teacher.addPerson(scanner);
                    personList.addPerson(teacher);
                    break;
                }
                case 3: {
                    personList.displayAll();
                    break;
                }
                case 4: {
                    System.out.println("Enter ID to edit: ");
                    String editId = scanner.nextLine();
                    personList.editPersonById(editId);
                    break;
                }
                case 5: {
                    System.out.println("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                }
                default: {
                    System.out.println("Try again!");
                }
            }
        } while (choice != 0);
        scanner.close();
    }

}
