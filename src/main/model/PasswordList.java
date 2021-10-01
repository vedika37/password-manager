package model;

import java.util.ArrayList;

public class PasswordList {

    private ArrayList<Password> passwords;

    public PasswordList() {
        this.passwords = new ArrayList<>();
    }

    public ArrayList<Password> getPasswords() {
        return passwords;
    }

    public void addPassword(Password password) {
        passwords.add(password);
    }

    public void removePassword(Password password) {
        passwords.remove(password);
    }

}
