
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person implements Serializable {   //define class person and Serialize it
    private static final long serialVersionUID = 1L;  // initialize static variable of type long
    private String name; //initialize  variable of type String
    private int age;  //initialize  variable of type int

    public Person(String name, int age) {  // constructor
        this.name = name;
        this.age = age;
    } // close constructor

    public String toString() { // method of person class return type String
        return "Name: " + name + ", Age: " + age;
    } //close of method
}

public class UserInputSerialization {
    public static void main(String[] args) {  // initialize main method
        Scanner scanner = new Scanner(System.in); // define scanner object of  Scanner class
        List<Person> peopleList = new ArrayList<>(); // define ArrayList of person type

        try {
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            peopleList = (List<Person>) objIn.readObject();

            objIn.close();
            fileIn.close();

            System.out.println("old data");
            for (Person person : peopleList) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Read input from the user and create objects
        System.out.println("Enter details for people (type 'done' to finish):");
        while (true) { // while loop for taking the data from user
            System.out.print("Name: "); // message to user
            String name = scanner.nextLine(); // taking input form the user/system
            if (name.equalsIgnoreCase("done")) { // checking the condition for name vale is equal to Done or not this is case insenstive
                break;// for breaking the loop
            }

            System.out.print("Age: "); // message to user
            int age = Integer.parseInt(scanner.nextLine()); // taking input form the user/system

            Person person = new Person(name, age); // make the Person class object and initializion
            peopleList.add(person);// adding the data into ArrayList
        } //close the while loop
        scanner.close(); // close the Scanner

        // Store the objects in a file using serialization
        try { //staring the try block
            FileOutputStream fileOut = new FileOutputStream("file.txt"); //making the  file object
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);// making object of file for output

            objOut.writeObject(peopleList);// writing the data into file

            objOut.close();//close the  object
            fileOut.close();// close the file

            System.out.println("Objects serialized and stored in 'file.txt' successfully."); // message for suceess
        } catch (IOException e) {// catch block
            e.printStackTrace(); // message for exception
        }

        // Later, you can read the objects back from the file (deserialize) and use them as needed.
        // Here's how to read the objects back from the file:
        try {
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            List<Person> retrievedPeopleList = (List<Person>) objIn.readObject();

            objIn.close();
            fileIn.close();

            System.out.println("Objects deserialized from 'file.txt':");
            for (Person person : retrievedPeopleList) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    }
