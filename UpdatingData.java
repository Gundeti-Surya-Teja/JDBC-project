//  updating data in db


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



class UpdatingData
{
 public static void main(String args[])
 {
    try
    {
	//creating connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/std_marks","root","");

	//create statement
	Statement st = con.createStatement();

	//create query
	String query = "SELECT * FROM student";

	String up = "UPDATE student SET firstname=' Sanjay',lastname='Krishna',marks='30' WHERE id=105"   ;
	
	st.executeUpdate(up);

	ResultSet rs = st.executeQuery(query);

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