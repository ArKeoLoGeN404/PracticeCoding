package StreamPractice;

public class Employee {
    private int id;
    private String name;
    private String city;

    // Constructor
    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name +
                "', city='" + city + "'}";
    }
}
