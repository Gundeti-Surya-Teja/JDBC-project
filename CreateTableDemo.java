//	this program is to create table in db


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;



class CreateTableDemo
{
   public static void main(String args[] )
   {
	Connection con = null;
	Statement st = null;
	


	String query = "CREATE TABLE student"+
		       "(  id INTEGER not NULL,    " +
		       "   firstname VARCHAR(255), " + 
		       "   lastname VARCHAR(255),  " + 
		       "   marks INTEGER, 	   " + 
		       "   PRIMARY KEY(id)        )" ; 


     try
     {
	//connection created
	con = DriverManager.getConnection("jdbc:mysql://localhost/std_marks","root", "");

	//create statement
	st = con.createStatement();

	//execute query
	st.execute(query);

	st.close();

	con.close();

	System.out.println("Table sucessfully created");
     }
     catch(Exception e)
     {
	e.printStackTrace();
     }
   }
}


