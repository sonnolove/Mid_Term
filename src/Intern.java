public class Intern extends Employee implements IEmployee{
    private String Majors;
    private int Semester;
    private String University_name;

    public Intern(int ID, String FullName, int Phone, int BirthDay, String Email, String Majors, int Semester, String University_name) {
        super(ID, FullName, Phone, BirthDay, Email);
        setEmployee_type("Intern");
        this.Majors = Majors;
        this.Semester =Semester;
        this.University_name = University_name;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin nhân viên :");
        System.out.println("ID : " +getID());
        System.out.println("FullName : " +getFullName());
        System.out.println("BirthDay : " +getBirthDay());
        System.out.println("Phone : " +getPhone());
        System.out.println("Email : " +getEmail());
        System.out.println("Employee_Type : " +getEmployee_Type());
        System.out.println("Employee_count : " +getEmployee_count());
        System.out.println("Majors : " +Majors);
        System.out.println("Semester : "+ Semester);
        System.out.println("University_name : "+ University_name);
    }
}
