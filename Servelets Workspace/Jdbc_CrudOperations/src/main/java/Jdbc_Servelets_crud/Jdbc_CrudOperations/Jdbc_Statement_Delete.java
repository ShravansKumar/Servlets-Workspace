package Jdbc_Servelets_crud.Jdbc_CrudOperations;

import java.sql.*;

public class Jdbc_Statement_Delete {
	public static void main( String[] args ) {
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establishing Connection

			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");

			//Creating Statement


			Statement st=conn.createStatement();
			boolean result=st.execute("DELETE FROM person_details WHERE person_name='Jayan'");
			//Processing result

			System.out.println(result);
			if(result==false) {
				System.out.println("Data Deleted successfully");
			}else {
				System.out.println("Data not Deleted");
			}
			//Clone the Connection
			st.close();
			conn.close();
		}catch (ClassNotFoundException | SQLException e)
		{	  
			e.printStackTrace();

		}
	}


}


