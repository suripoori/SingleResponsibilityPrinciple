package reporting;
import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{
	
	public EmployeeReportFormatter(Employee emp, FormatType format){
		super(emp, format);
	}
	
	public String getFormattedEmployee(){
		return getFormattedValue();
	}
}
