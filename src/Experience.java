public class Experience extends Employee implements IEmployee {
    private int ExplnYear;
    private String ProSkill;

    public Experience(int ID, String FullName, int Phone, int BirthDay, String Email, String Employee_type, int ExplnYear, String ProSkill) {
        super(ID,FullName,Phone, BirthDay, Email);
        setEmployee_type("Experience");
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
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
        System.out.println("ExplnYear : " +ExplnYear);
        System.out.println("ProSkill : "+ ProSkill);
    }
}
