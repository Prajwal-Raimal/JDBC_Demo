import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "root";

        String query = "SELECT id,name,city FROM student";

        try (Connection con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);) {

            System.out.println("MySQL Connection Successfully!");
            System.out.println("ID  |   NAME   |  CITY ");
            System.out.println("------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "   |   " +
                                rs.getString("name") + "  |  " +
                                rs.getString("city"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
