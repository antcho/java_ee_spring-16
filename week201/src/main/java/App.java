
import java.sql.*;

import org.sqlite.SQLiteDataSource;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("___ App ___");

		//SQLiteDataSource ds = new SQLiteDataSource();
		//ds.setUrl("jdbc:sqlite:data.db");

		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");

		// TODO : select all users.
		// ...

		ResultSet rs = conn
			.createStatement()
			.executeQuery("select * from user");

		System.out.println(String.format("%-30s | %-30s | %-80s", "nom", "prenom", "email"));

		while (rs.next() ) {
			System.out.println(String.format("%-30s | %-30s | %-80s", rs.getString("lastname"), rs.getString("firstname"), rs.getString("email")));
		}

		conn.close();
	}
}
