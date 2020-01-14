package jsp05.cuong.vn.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	static Statement stm = null;
	static ResultSet rs = null; 
	
	public static Connection getConnect(String strServer,String strDatabase)
	{
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl=
					"jdbc:sqlserver://"+strServer+":1433;databaseName="+strDatabase+";integratedSecurity=true;";
			conn= DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			System.out.println("SQL Exception: "+ e.toString());
		} catch (ClassNotFoundException cE) {
			System.out.println("Class Not Found Exception: "+ cE.toString());
		}
		return conn;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=getConnect("QUOCCUONGJBE-PC", "Examination_T");
		if(conn!=null)
		{
			System.out.println("Đã kết nối tới CSDL SQL Server thành công");
		}
		else
		{
			System.out.println("Kết nối tới CSDL SQL Server thất bại");
		}

	}

}
