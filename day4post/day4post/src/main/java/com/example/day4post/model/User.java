package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Customer_Id;
    private String Customer_Name;
    private String email;
    private String Password;
    private int Customer_Phonenumber;
    public int getCustomer_Id() {
        return Customer_Id;
    }
    public void setCustomer_Id(int customer_Id) {
        this.Customer_Id = customer_Id;
    }
    public String getCustomer_Name() {
        return Customer_Name;
    }
    public void setCustomer_Name(String customer_Name) {
        this.Customer_Name = customer_Name;
    }
    public String getCustomer_Email() {
        return email;
    }
    public void setCustomer_Email(String email) {
        this.email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public int getCustomer_Phonenumber() {
        return Customer_Phonenumber;
    }
    public void setCustomer_Phonenumber(int customer_Phonenumber) {
        this.Customer_Phonenumber = customer_Phonenumber;
    }
    public User(int customer_Id, String customer_Name, String email, String password,
            int customer_Phonenumber) {
        this.Customer_Id = customer_Id;
        this.Customer_Name = customer_Name;
        this.email = email;
        this.Password = password;
        this.Customer_Phonenumber = customer_Phonenumber;
    }
 

}
