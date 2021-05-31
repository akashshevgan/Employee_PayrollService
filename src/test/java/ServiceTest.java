import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ServiceTest {
    @Test
    void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        Service employeePayrollService = new Service();
        List<Data> employeePayrollData = employeePayrollService.readData(Service.IOService.DB_IO);
        Assertions.assertEquals(3,employeePayrollData.size());
    }
}