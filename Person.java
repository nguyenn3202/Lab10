public class Person implements Comparable<Person>{
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
        return String.format("%s %d %s %d %,.2f%n", name, age, address, zip, salary);
    }

    @Override
    public int compareTo(Person o) {
        if (this.getSalary() > o.getSalary()) {
            return 1;
        } else if (this.getSalary() < o.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
