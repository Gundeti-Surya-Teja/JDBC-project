//	inserting data in to db


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


class InsertingData
{
   public static void main(String args[])
   {
	try
	{
		//drivermanager  Class.forName("com.mysql.jdbc.Driver");		

		//Create connection
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/std_marks", "root", "");
	 
	 	//create statements
	 Statement st = con.createStatement(); 

	 System.out.println("Inserting data in table.........");

	 String in = "INSERT INTO student VALUES (101, 'Surya', 'Teja', 65)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (102, 'Vamsi', 'Kumar', 82)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (103, 'karthik', 'Reddy', 74)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (104, 'Venkat', 'Naidu', 58)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (105, 'Zakir', 'Ali', 73)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (106, 'Sanjay', 'Roy', 66)";
	 st.executeUpdate(in);
		in = "INSERT INTO student VALUES (107, 'Rama', 'Roy', 66)";
	 st.executeUpdate(in);


	System.out.println("............Data inserted sucessfully");

	ResultSet rs = st.executeQuery("SELECT * FROM student");
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