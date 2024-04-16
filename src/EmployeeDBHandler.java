import java.sql.*;

// dùng xampp :v
public class EmployeeDBHandler {
    public static void writeToDatabase(Employee employee) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO employees VALUES (, , , , , , , )");
            statement.setInt(1, employee.getID());
            statement.setString(2, employee.getFullName());
            // Set other parameters...
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void readFromDatabase() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "", "");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("full_name"));
                // Print other fields...
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
