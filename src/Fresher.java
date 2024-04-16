public class Fresher extends Employee implements IEmployee{

    private int Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(int ID, String FullName, int Phone, int BirthDay, String Email, int Graduation_date,String Graduation_rank, String Education) {
        super(ID, FullName, Phone, BirthDay, Email);
        setEmployee_type("Fresher");
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }
    @Override
    public void showInfo(){
        System.out.println("Thông tin nhân viên :");
        System.out.println("ID : " +getID());
        System.out.println("FullName : " +getFullName());
        System.out.println("BirthDay : " +getBirthDay());
        System.out.println("Phone : " +getPhone());
        System.out.println("Email : " +getEmail());
        System.out.println("Employee_Type : " +getEmployee_Type());
        System.out.println("Employee_count : " +getEmployee_count());
        System.out.println("Graduation_rank : " +Graduation_rank);
        System.out.println("Graduation_date : "+ Graduation_date);
        System.out.println("Education : " +Education);
    }
}
