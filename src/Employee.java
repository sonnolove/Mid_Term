import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee implements IEmployee{
    private int ID;
    private String FullName;
    private int Phone;
    private  int BirthDay;
    private  String Email;
    private static int Employee_count;

    private String Employee_type;

    public Employee(int ID, String FullName, int Phone, int BirthDay, String Email, String Employee_type) {
        this.ID = ID;
        this.FullName = FullName;
        this.Phone = Phone;
        this.BirthDay = BirthDay;
        this.Email = Email;
        this.Employee_type = Employee_type;
        Employee_count++;
    }

    public Employee(int ID, String FullName, int Phone, int BirthDay, String Email) {
        this.ID = ID;
        this.FullName = FullName;
        this.Phone = Phone;
        this.BirthDay = BirthDay;
        this.Email = Email;
        Employee_count++;
    }
    public int getID() {
        return  ID;
    }
    public String getFullName() {
        return  FullName;
    }
    public int getBirthDay() {
        return  BirthDay;
    }
    public int getPhone() {
        return  Phone;
    }
    public String getEmail() {
        return  Email;
    }

    public int getEmployee_count() {
        return  Employee_count;
    }
    public String getEmployee_Type() {
        return  Employee_type;
    }
    public void setEmployee_type(String Employee_Type) {
        this.Employee_type =Employee_Type;
    }
    @Override
    public void showInfo() {
        System.out.println("Thông tin nhân viên :");
        System.out.println("ID : " +ID);
        System.out.println("FullName : " +FullName);
        System.out.println("BirthDay : " +BirthDay);
        System.out.println("Phone : " +Phone);
        System.out.println("Email : " +Email);
        System.out.println("Employee_Type : " +Employee_type);
        System.out.println("Employee_count : " +Employee_count);
    }

}
