import java.util.List;

public class Service {
    public enum IOService {DB_IO}

    private List<Data> employeePayrollList;

    public Service() {}

    public List<Data> readData(IOService iOservice) {
        if (iOservice.equals(IOService.DB_IO))
            this.employeePayrollList = new Employee_PayrollDBService().readData();
        return this.employeePayrollList;
    }
}