import java.util.Date;

public final class C02ImmutableClass {
    private final String fullName;
    private final Date dob;

    private C02ImmutableClass(String fName,Date dob){
        this.fullName=fName;
        this.dob=new Date(dob.getTime());
    }

    public static C02ImmutableClass getC02ImmutableClass(String fName,Date dob){
        return new C02ImmutableClass(fName, dob);
    }

    public String getFullName(){
        return this.fullName;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    public Date getDob2(){
        return dob;
    }

    @Override
    public String toString() {
        return "C02ImmutableClass [dob=" + dob + ", fullName=" + fullName + "]";
    }

}
