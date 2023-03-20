package JavaTest.dbConnection;

public class Connection {
	
	public void connect() {
		//MysqlConnection con = new MysqlConnection();
	ConnectionInterface con = new MysqlConnection();
	con.getDbName();
	}

}
