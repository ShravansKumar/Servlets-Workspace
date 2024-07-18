package Jdbc_Servelets_crud.Jdbc_CrudOperations;

import java.sql.*;

public class Jbdc_Statement_Update {


	public static void main( String[] args ) {
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establishing Connection

			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");

			//Creating Statement


			Statement st=conn.createStatement();
			boolean result=st.execute("UPDATE person_details SET person_name='Jayan',person_age='23',person_number=9539472653");
			//Processing result

			System.out.println(result);
			if(result==false) {
				System.out.println("Data Updated successfully");
			}else {
				System.out.println("Data not Updated");
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
