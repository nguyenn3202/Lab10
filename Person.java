import java.io.Serializable;

/**
 * File: Person.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Nguyen Pham
 * Created on: November 17, 2023
 * Last Modified: November 17, 2023
 * Description: Persons class to identify turn a dat file into an object
 */
public class Person implements Comparable<Person>, Serializable {
    int age, zip;
    String name, address;
    double salary;

    public Person() {
        this("John Doe", 21, "22 Spongebob Way", 31410, 99999.99);
    }

    public Person(String name, int age, String address, int zip, double salary) {
        setName(name);
        setAge(age);
        setAddress(address);
        setZip(zip);
        setSalary(salary);
    }

    //Getters
    public int getAge() {
        return age;
    }

    public int getZip() {
        return zip;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    //Setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d $%,.2f", age, name, address, zip, salary);
    }

    @Override
    public int compareTo(Person o) {
        if (this.getSalary() < o.getSalary()) {
            return 1;
        } else if (this.getSalary() > o.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
