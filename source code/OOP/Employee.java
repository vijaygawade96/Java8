package OOP;

import java.util.Date;

public class Employee {
    private long id;
    private String fullName;
    private Date dateOfJoining;
    private Address currentAddress;
    private Address permanentAddress;

    // Default constructor
    public Employee() {
    }

    // Parameter/Custom constructor
    public Employee(long id, String fullName, Date dateOfJoining, Address currentAddress, Address permanentAddress) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public String toString() {
        return "Employee [currentAddress=" + currentAddress + ", dateOfJoining=" + dateOfJoining + ", fullName="
                + fullName + ", id=" + id + ", permanentAddress=" + permanentAddress + "]";
    }

}
