package pojos;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)



//import org.codehaus.jackson.annotate.JsonIgnoreProperties;


public class MedunnaUsersPojo {

    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String password;



    public MedunnaUsersPojo(String login, String firstName, String lastName, String ssn, String email, String password) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
        this.password = password;
    }

    public MedunnaUsersPojo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MedunnaUsersPojo{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /*
     {
    "id": 5781,
    "login": "doctorcruise",
    "firstName": "Tom",
    "lastName": "Cruise",
    "ssn": "481-15-3553",
    "email": "cruise@gmail.com",
    "imageUrl": null,
    "activated": false,
    "langKey": null,
    "createdBy": null,
    "createdDate": null,
    "lastModifiedBy": null,
    "lastModifiedDate": null,
    "authorities": null
}

   */



}
