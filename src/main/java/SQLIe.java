import java.sql.*;

public class SQLIe {
    public static void main(String[] args) throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "uuu", "ppp");
        String uname = args[1];
        String q = "SELECT * FROM users WHERE username = '" + uname + "';";
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(q);
    }
}
