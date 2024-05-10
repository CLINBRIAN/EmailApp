/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.emailapp;

import java.util.Scanner;

/**
 *
 * @author kamau
 */
public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLength = 10;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = ".elgey.company.com";
    //set the constructor for firstname and lastname

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED FOR : " + this.firstName + " " + this.lastName);

        //call amethod asking for department return department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        //call a method that retuurns a random password
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("Your password is :" + this.password);

        //generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        //System.out.println("Your emmail is : " + email);

    }

    //ask for departments
    private String setDepartment() {
        System.out.println("New Worker: "+firstName+"."+" DEPARTMENT CODES: \n 1.sales\n 2.Development\n 3.Accounting \n 0.for none\n Enter department code:");
        Scanner sc = new Scanner(System.in);
        int choices = sc.nextInt();
        if (choices == 1) {
            return "sales";
        } else if (choices == 2) {
            return "development";
        } else if (choices == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!@.";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }
    //set the mailbox capaccity mtd

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set the alternate email address
    public void setAternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    
    //change password methd, 
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    public String showInfo(){
    return "YOUR NAME IS: "+firstName+" "+lastName+
            "\nEMAIL: "+email+
            "\nEMAIL CAPACITY: "+ mailboxCapacity+" mbs";
    
    }
    
    

}
