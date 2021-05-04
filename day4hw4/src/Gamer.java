import java.util.Date;

public class Gamer {
    private String tcId;
    private String firstName;
    private String lastName;
    private Date birthOfYear;

    public Gamer() {

    }

    public Gamer(String tcId, String firstName, String lastName, Date birthOfYear) {

        this.tcId = tcId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(Date birthOfYear) {
        this.birthOfYear = birthOfYear;
    }


}