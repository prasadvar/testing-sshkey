package com.test.me.pojo;

import javax.persistence.*;

@Entity

public class baseclass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstname")
    private  String FirstName;

   @Column(name = "lastname")
    private  String  LastName;

    @Column(name = "email")
    private  String Email;

    @Column(name = "mobile")
    private  String Mobile;

    @Column(name = "gender")
    private String Gender;

    @Column(name = "age")
    private String  Age;

    @Column(name = "address")
    private  String Address;

    @Column(name = "nation")
    private  String Nationality;

    public baseclass() {
    }

    public baseclass( String firstName, String lastName, String email, String mobile, String gender, String age, String address, String nationality) {
       this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Mobile = mobile;
       this.Gender = gender;
        this.Age = age;
        this.Address = address;
        this.Nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    @Override
    public String toString() {
        return "baseclass{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age='" + Age + '\'' +
                ", Address='" + Address + '\'' +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }
}
