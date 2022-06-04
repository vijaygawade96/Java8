public class C04Constructor {
    private int rollNumber;
    private String fullName;

    public static void main(String[] args) {
        C04Constructor c1=new C04Constructor();
        System.out.println("Create object using Default Constructor: "+c1);

        c1=new C04Constructor(105, "Vijay R. Gawade");
        System.out.println("Create Object using Parameterized Constructor: "+c1);

        C04Constructor c2=new C04Constructor(c1);
        System.out.println("Create Object using Copy Constructor: "+c2);
    }

    // No-argument/Default constructor
    C04Constructor(){
        System.out.println("Default Constructor called ...");
    }

    // Parameterized Constructor
    C04Constructor(int rollNumber,String fullName){
        System.out.println("Parameterized Constructor called...");
        this.rollNumber=rollNumber;
        this.fullName=fullName;
    }

    // copy constructor
    C04Constructor(C04Constructor ins){
        System.out.println("Copy Constructor called...");
        this.rollNumber=ins.rollNumber;
        this.fullName=ins.fullName;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "C04Constructor [fullName=" + fullName + ", rollNumber=" + rollNumber + "]";
    }

}
