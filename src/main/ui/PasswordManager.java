package ui;

import model.PasswordList;

import java.util.Scanner;

public class PasswordManager {
    private PasswordList passwordList;

    public PasswordManager() {
        this.passwordList = new PasswordList();
    }

    public PasswordList getPasswordList() {
        return passwordList;
    }

    public void runPasswordManager() {
        Scanner scanner = new Scanner(System.in);

    }
}

