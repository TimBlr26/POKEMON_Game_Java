/**
 * 
 */
package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtil {
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			// Charger le driver de la BDD MySQL
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			// Etablir la connexion
			connection = DriverManager.getConnection(
					"jdbc:sqlserver://localhost;databaseName=user_manager","sa","Pa$$w0rd"
			);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}