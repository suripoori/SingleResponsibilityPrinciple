package database;

public class DatabaseConnectionManager {
	public static DatabaseConnectionManager instance = null;
	
	public static DatabaseConnectionManager getInstance() {
		if (instance == null){
			instance = new DatabaseConnectionManager();
		}
		return instance;
	}
	
	public String getConnectionObject() {
		return null;
	}
	
	private DatabaseConnectionManager(){
		
	}
	
	private boolean connectToDatabase(){
		return true;
	}
	
	
}
