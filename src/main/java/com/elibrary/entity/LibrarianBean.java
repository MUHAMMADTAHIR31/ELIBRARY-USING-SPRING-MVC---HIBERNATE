/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elibrary.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name="e_librarian")
public class LibrarianBean implements Serializable{
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "libraryId")
    private int libraryId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "mobile")
    private int mobile;
    
    public LibrarianBean(){
    
    }
    
    public LibrarianBean(String name, String email, String password, int mobile) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public LibrarianBean(int libraryId, String name, String email, String password, int mobile) {
        this.libraryId = libraryId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }
    
    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
