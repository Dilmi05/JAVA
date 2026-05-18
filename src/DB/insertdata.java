package DB;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class insertdata {


    public void insert(){

        try{
            Connection con =dbconnection.getconnection();
            Statement st = con.createStatement();
            String sql="Insert into basicdata values"+
                    "('101','kamal','Galle')";

            st.executeUpdate(sql);

            System.out.println("Data Inserted Successfully");

        }catch(Exception e){
            System.out.println(e);

        }
    }


    public void display(){

        try{
            Connection con =dbconnection.getconnection();
            Statement st = con.createStatement();
            String sql="Select * from basicdata";


            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getString("stu_id") + " "
                                + rs.getString("stu_name") + " "
                                + rs.getString("stu_address")
                );
            }

        }catch(Exception e){
            System.out.println(e);

        }
    }
}
