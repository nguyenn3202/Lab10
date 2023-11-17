import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * File: Lab10Prob03.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Nguyen Pham
 * Created on: November 17, 2023
 * Last Modified: November 17, 2023
 * Description: Program to output a .dat file to binary and testing person's class.
 */
public class Lab10Prob03 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        try (
                DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
                DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"));
        ) {
            while (true) {

                int age = input.readInt();
                String name = input.readUTF();
                String address = input.readUTF();
                int zip = input.readInt();
                double salary = input.readDouble();
                System.out.printf("%s %d %s %d %.2f%n", name, age, address, zip, salary);
                output.writeUTF(name);
                output.writeInt(age);
                output.writeUTF(address);
                output.writeInt(zip);
                output.writeDouble(salary);
                persons.add(new Person(name, age, address, zip, salary));
            }

        } catch (EOFException e) {
            //System.out.println("Reached end of file");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(persons);

        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-salary-sorted.dat"));
        ) {
            for (Person personsList : persons) {
                output.writeUTF(personsList.toString());
            }
        } catch (Exception e) {

        }
    }
}
