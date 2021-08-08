package Models;

import java.sql.Date;

public class User {
    private int id;
    private String userName;
    private String passWord;
    private String email;
    private String address;
    private Date birthday;

    public User(int id, String userName, String passWord, String email, String address, Date birthday) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
