public class Vendor {
    private String vendorName;
    private String contactInfo;

    public Vendor(String vendorName, String contactInfo) {
        this.vendorName = vendorName;
        this.contactInfo = contactInfo;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
