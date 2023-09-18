package com.example.tasks2;

public class User
{
    private String email, userName, phone;

    public User(String email, String userName, String phone) throws IllegalAccessException {
        setEmail (email);
        setUserName (userName);
        setPhone (phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName()  {

        return userName;
    }

    public void setUserName(String userName) throws IllegalAccessException {
        userName = userName.trim(); // remove leading and tralling whitespaces
        if (userName.matches("[A-Z1-9]*"))
            this.userName = userName;
        else
            throw new IllegalAccessException("username must have atleast 1 character and/ or number");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
