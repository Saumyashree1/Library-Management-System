import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static void main(String arg[])
{
		@SuppressWarnings("unused")
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tiger");
		}catch(Exception e){System.out.println(e);}
	}

	

}
