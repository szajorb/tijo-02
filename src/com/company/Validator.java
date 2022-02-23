package com.company;

public class Validator {
    public boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
