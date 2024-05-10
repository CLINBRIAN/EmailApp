/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.emailapp;

/**
 *
 * @author kamau
 */
public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("john","smith");
        System.out.println(email.showInfo());
    }
}
