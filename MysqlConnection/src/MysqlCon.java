import java.sql.*;

public class MysqlCon {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Statement stmt;
		PreparedStatement pstmt;
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/iexceed","root","i18n");  
			
	
   		     stmt=con.createStatement();  
			
//			ResultSet rs=stmt.executeQuery("select * from iempl");
//			
//				while(rs.next())  
//						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//				
			
   		     stmt=con.createStatement();
//   		     stmt.executeUpdate("update iemployee set name='Praveen Gentleman geneous' where id=1");
   		     
   		     
//   		     stmt.executeUpdate("delete from iemployee where id=1");
					
//		  pstmt=con.prepareStatement("insert into iempl values(?,?,?)");
//		  pstmt.setInt(1, 01);
//		  pstmt.setString(2, "Sivam");
//		  pstmt.setString(3, "Peramanur main road salem");
//		  pstmt.executeUpdate();
		  con.close();
	}catch(Exception e){ System.out.println(e);}  

	}

}
