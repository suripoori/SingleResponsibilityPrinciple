package domain.dao;
import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {
	
	private DatabaseConnectionManager connector;
	private String conn;
	
	public EmployeeDAO(){
		this.connector = DatabaseConnectionManager.getInstance();
		this.conn = this.connector.getConnectionObject(); 
	}
	
	public boolean saveEmployee(Employee emp){
		return true;
	}
	
	public boolean deleteEmployee(Employee emp){
		return true;
	}
}
