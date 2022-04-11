package OOP;

public class Address {
    private String areaAndStreet;
    private String locality;
    private String pincode;
    private String city;
    private String state;
    private String landmark;
    private AddressType addressType;

    public Address(String areaAndStreet, String locality, String pincode, String city, String state, String landmark,
            AddressType addressType) {
        this.areaAndStreet = areaAndStreet;
        this.locality = locality;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.landmark = landmark;
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "Address [addressType=" + addressType + ", areaAndStreet=" + areaAndStreet + ", city=" + city
                + ", landmark=" + landmark + ", locality=" + locality + ", pincode=" + pincode + ", state=" + state
                + "]";
    }

}
