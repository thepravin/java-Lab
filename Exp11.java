/*import java.sql.*;
public class Login {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant",
"abcd", "abcd");
String username = args[1]; // Replace this with your command-line argument handling
String password = args[2]; // Replace this with your command-line argument handling
String sql = "SELECT * FROM user WHERE id = ? AND password
= ?"; PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, username);
pst.setString(2, password);
ResultSet rs = pst.executeQuery();
if (rs.next()) {
System.out.println("Login successful");
// You can perform further actions for a successful login here.
} else {
System.out.println("Login failed");
// You can handle the failed login scenario here.
}
con.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}*/
import java.util.Scanner; import
java.sql.*;
public class Login {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your username: ");
String username = scanner.nextLine();
System.out.print("Enter your password: ");
String password = scanner.nextLine();
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant",
"abcd", "abcd");
String sql = "SELECT * FROM user WHERE id = ? AND password
= ?"; PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, username);
pst.setString(2, password);
ResultSet rs = pst.executeQuery();
if (rs.next()) {
System.out.println("Login successful");
// You can perform further actions for a successful login here.
} else {
System.out.println("Login failed");
// You can handle the failed login scenario here.
}
con.close();
} catch (Exception e) {
System.out.println(e.getMessage());
} finally {
scanner.close(); // Close the scanner to release resources
}
}
}