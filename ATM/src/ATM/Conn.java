package ATM;
import java.sql.*;

public class Conn {

	Connection c;
  public  Statement s;
public Object Conn;

	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///ATM","root","Saranya");
			s=c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void close() {
		try {
			s.close();
			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Statement getStatement() {
		return s;
	}
}

