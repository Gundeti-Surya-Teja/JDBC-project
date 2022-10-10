//delecting data from table



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;





class DeletingData
{
 public static void main(String args[])
 {
	try
	{
	//create connection
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/std_marks","root","");

	//create statement
	Statement st = con.createStatement();

	//create query
	String query = "SELECT * FROM student";

	//deleting data
	String dl = "DELETE FROM student WHERE id=105 ";

	//after delecting data must updated
	st.executeUpdate(dl);

	//create result set and execute query
	ResultSet rs = st.executeQuery(query);
	
	System.out.println("Record deleted sucessfully");

		System.out.println("-------------------------------------------------");
		 System.out.println("|   ID   | FirstName      | lastName    | Marks |");
		 System.out.println("=================================================");

		while(rs.next())
		{
		 System.out.println("|  "+rs.getInt("id")+"   |  "+rs.getString("firstname")+"\t  |  "+rs.getString("lastname")+"\t|   "+rs.getInt("marks")+"\t|");
		 System.out.println("-------------------------------------------------");
		}

	st.close();
	con.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
 }
}