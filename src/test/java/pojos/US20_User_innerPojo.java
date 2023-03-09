package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US20_User_innerPojo {

    private String login;
    private Boolean activated;
    private String ssn;

    public US20_User_innerPojo(String login, Boolean activated, String ssn) {
        this.login = login;
        this.activated = activated;
        this.ssn = ssn;
    }

    public US20_User_innerPojo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US20_User_innerPojo{" +
                "login='" + login + '\'' +
                ", activated=" + activated +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}


