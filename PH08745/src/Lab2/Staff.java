package Lab2;

/**
 *
 * @author os_cntt_gpdn25
 */
public class Staff {
    private int id; 
    
    private String fullName;
    
    private String country;
    
    private int gender;
    
    private boolean status;
    
    private String note;

    public Staff() {
    }

    public Staff(int id, String fullName, String country, int gender, boolean status) {
        this.id = id;
        this.fullName = fullName;
        this.country = country;
        this.gender = gender;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
    
}
