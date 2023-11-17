import java.io.*;

/**
 * File: Lab10Prob01.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Nguyen Pham
 * Created on: November 17, 2023
 * Last Modified: November 17, 2023
 * Description: Program to output a .dat file to binary
 */
public class Lab10Prob02 {
    public static void main(String[] args) {
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
            }

        } catch (EOFException e) {
            //System.out.println("Reached end of file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
