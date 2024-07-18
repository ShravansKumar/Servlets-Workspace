package Jdbc_Servelets_crud.Jdbc_CrudOperations;

import java.sql.*;



class Jdbc_Statetment_Insert {

	public static void main( String[] args ) {
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establishing Connection

			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");

			//Creating Statement


			Statement st=conn.createStatement();
			boolean result=st.execute("INSERT INTO person_details VALUES (102,'Ajay','21','9539472653')");

			//Processing result

			System.out.println(result);
			if(result==false) {
				System.out.println("Data Inserted successfully");
			}else {
				System.out.println("Data not inserted");
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


