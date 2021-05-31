import java.time.LocalDate;
import java.util.Objects;

public class Data {
    public int id;
    public String name;
    public double salary;
    public LocalDate startDate;

    public Data(int id, String name, double salary, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data that = (Data) o;
        return id == that.id && Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name);
    }
}