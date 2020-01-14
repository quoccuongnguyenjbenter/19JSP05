package jsp05.cuong.vn.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.security.auth.Subject;

import jsp05.cuong.vn.connect.Connect;
import jsp05.cuong.vn.models.ThiSinh;

public class Main {

	static Statement stm = null;
	static ResultSet rs = null;
//	static Connection con=null;

	public static Vector<ThiSinh> getAllThiSinh()
    {
        Vector<ThiSinh> v=new Vector<ThiSinh>(10,10);
        try {
//        	Connection conn=getConnect("QUOCCUONGJBE-PC", "Examination_T");
//        	Connect conn=new Connect();
//        	conn.getConnect("QUOCCUONGJBE-PC", "Examination_T");
        	
        	Connection con=new Connect().getConnect("QUOCCUONGJBE-PC", "Examination_T");
	        stm=con.createStatement();
	        String sql="SELECT * FROM [Examination_T].[dbo].[ThiSinh]";
	        rs=stm.executeQuery(sql);

	        while(rs.next())
            {
//                String mamt=rs.getString(1);
//                String tenmon=rs.getString(2);
//                Subject mt=new Subject(mamt,tenmon);
//                v.add(mt);
	        	String cmnd=rs.getString(1);
	        	String ho=rs.getString(2);
	        	String ten=rs.getString(3);
	        	ThiSinh ts=new ThiSinh(cmnd, ho, ten);
	        	v.add(ts);
            }
            con.close();
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return v;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main =new Main();
		System.out.println(main.getAllThiSinh());

	}

}
