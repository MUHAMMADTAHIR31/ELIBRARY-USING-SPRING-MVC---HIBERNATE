/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elibrary.entity;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="e_issuebook")
public class IssueBookBean implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private String studentId;
    
    @Column(name="studentName")
    private String studentName;
    
    @Column(name="studentMobile")
    private int studentMobile;
    
    @Column(name="issuedDate")
    private Date issuedDate;
    
    @Column(name="returnStatus")
    private String returnStatus;
    
    public IssueBookBean(){
    
    }
    
    public IssueBookBean( String studentId, String studentName, int studentMobile,Date issuedDate,String returnStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMobile = studentMobile;
        this.issuedDate = issuedDate;
        this.returnStatus = returnStatus;
    }
        
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(int studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    @Override
    public String toString() {
        return "IssueBookBean{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile + ", issuedDate=" + issuedDate + ", returnStatus=" + returnStatus + '}';
    }
    
}
