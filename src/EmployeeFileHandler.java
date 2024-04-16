import java.io.*;

public class EmployeeFileHandler {
    public static void writeToFile(Employee employee, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(employee.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
