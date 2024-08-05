import java.util.Objects;

public class Employee {
    private static int countre = 0;

    private final String name;

    private int departament;

    private int salary;

    private final int id;

    public Employee(String name, int departament, int salary) {
        this.id = ++countre;
        this.name = name;
        this.departament = departament;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public int getDepartament() {
        return departament;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        if (departament >= 1 && departament <= 5) {
            this.departament = departament;
        } else {
            throw new IllegalArgumentException("Только пять отделов");
        }
    }

    @Override
    public String toString() {
        return "Имя " + this.name + " , отдел " + this.departament + " ,зарплата " + this.salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return employee.departament == departament && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departament, salary, id);
    }

}

