//selecting or reteriving data from db


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;




class SelectingData
{
   public static void main(String args[])
   {
	try
	{
		//create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/std_marks","root","");
		
		//create statement 
		Statement st = con.createStatement();

		//creting query
		String out = "SELECT * FROM student ";

		//execute query
		ResultSet rs = st.executeQuery(out);

		System.out.println("-------------------------------------------------");
		 System.out.println("|   ID   | FirstName      | lastName    | Marks |");
		 System.out.println("=================================================");

		while(rs.next())
		{
		 System.out.println("|  "+rs.getInt(1)+"   |  "+rs.getString(2)+"\t  |  "+rs.getString(3)+"\t|   "+rs.getInt(4)+"\t|");
		 System.out.println("-------------------------------------------------");
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
   }
}