package DB;
import java.sql.Connection;
import java.sql.Statement;

public class basicdata {

    public void createtable() {

        try{
            Connection con = dbconnection.getconnection();
            Statement st=con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS basicdata ("
                    + "stu_id VARCHAR(50), "
                    + "stu_name VARCHAR(50), "
                    + "stu_address VARCHAR(50))";

            st.executeUpdate(sql);

            System.out.println("Table Created Successfully");



        }catch(Exception e){
            System.out.println(e);
        }

    }

}
