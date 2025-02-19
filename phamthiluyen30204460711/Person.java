package phamthiluyen30204460711;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {

    String id;
    String homeTown;
    Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String homeTown, Date dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID:" + id);
        System.out.println("HomeTown:" + homeTown);
        System.out.println("Date of Birth:" + sdf.format(dateOfBirth));
    }

    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ID:");
            id = scanner.nextLine();
            System.out.println("Nhap hometown:");
            homeTown = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Nhap date of birth:");
            String dateOfBirthString = scanner.nextLine();
            dateOfBirth = sdf.parse(dateOfBirthString);

        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public boolean editPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap hometown:");
            homeTown = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Nhap date of birth(dd/MM/yyyy");
            String dateOfBirthString = scanner.nextLine();
            dateOfBirth = sdf.parse(dateOfBirthString);
            return true;
        } catch (ParseException e) {
            System.out.println(e);
            return false;
        }
    }

    public class Student extends Person {

        String major;

        public Student() {}

    public Student(String id, String homeTown, Date dateOfBirth, String major) {
        super(id, homeTown, dateOfBirth);
        this.major = major;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major:" + major);
    }

    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Major:");
        this.major = scanner.nextLine();
    }

    public boolean editPerson() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit major:");
        major = scanner.nextLine();
        return true;
    }
}

public class Teacher extends Person {

    String department;

    public Teacher() {
    }

    public Teacher(String id, String homeTown, Date dateOfBirth, String department) {
        super(id, homeTown, dateOfBirth);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Departmetn:" + department);
    }

    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Deparment:");
        this.department = scanner.nextLine();
    }

    public boolean editPersoon() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit Department:");
        department = scanner.nextLine();
        return true;
    }
}
}
