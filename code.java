package assignment1;
import java.sql.*; 
/* Name: CHOONG WEN JIAN ISAAC*/
/* Matric number: 207545      */
/* course: SSE4350      */
public class Student {
	public static void main(String[] args) throws SQLException { 
		// Connect to database
		 String URL = "jdbc:mysql://127.0.0.1:3306/db1?serverTimezone = UTC" ;
	     String Username = "root";
	     String password = "Isaac@207545";
		Connection conn = null;
		conn = DriverManager.getConnection(URL, Username, password);
		
		// Create a statement to retrieve objects
		Statement s = conn.createStatement();        

		// Retrieve results from the table
		ResultSet rs = s.executeQuery ("Select * from Student"); 
		
		// Print columns headers
		ResultSetMetaData rsmd =rs.getMetaData(); 
		int i =rsmd.getColumnCount( );
		
		for(int j=1; j<=i; j++) { 
			System.out.print(rsmd.getColumnName(j)+"\t"); 
			System.out.print(" "); 
		} 
		System.out.println();
		// Print records
		while(rs.next( ) ) { 
			for(int j=1; j<=i; j++) 
			{ 
				System.out.print ( rs.getString(j)+"\t\t"+" "); 
				
			}
			System.out.println();
		}
		
	}
}
