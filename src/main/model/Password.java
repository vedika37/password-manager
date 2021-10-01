package model;

public class Password {

    private String password;
    private String emailAddress;
    private String application;
    private boolean isSecure;

    public Password(String password, String emailAddress, String application) {
        this.password = password;
        this.emailAddress = emailAddress;
        this.application = application;
        this.isSecure = false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public boolean isSecure() {
        return isSecure;
    }

    public void setSecure() {
        isSecure = false;
        if (password.length() >= 8) {
            isSecure = true;
        }
    }
}
