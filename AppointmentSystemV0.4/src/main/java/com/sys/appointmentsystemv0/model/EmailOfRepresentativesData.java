package com.sys.appointmentsystemv0.model;

import javax.persistence.*;

@Entity
public class EmailOfRepresentativesData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String emailOfRep;
    private String nameOfRep;
    private String adminApproved;
    @ManyToOne
    @JoinColumn(name = "admin_Id")
    private AdminData adminData;
    @ManyToOne
    @JoinColumn(name = "employee_Id")
    private EmployeeData employeeData;

    public EmailOfRepresentativesData() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmailOfRepresentativesData(Long id, String emailOfRep, String nameOfRep, String adminApproved) {
        this.id = id;
        this.emailOfRep = emailOfRep;
        this.nameOfRep = nameOfRep;
        this.adminApproved = adminApproved;
    }

    public String getEmailOfRep() {
        return emailOfRep;
    }

    public void setEmailOfRep(String emailOfRep) {
        this.emailOfRep = emailOfRep;
    }

    public String getNameOfRep() {
        return nameOfRep;
    }

    public void setNameOfRep(String nameOfRep) {
        this.nameOfRep = nameOfRep;
    }

    public String getAdminApproved() {
        return adminApproved;
    }

    public void setAdminApproved(String adminApproved) {
        this.adminApproved = adminApproved;
    }

    public AdminData getAdminData() {
        return adminData;
    }

    public void setAdminData(AdminData adminData) {
        this.adminData = adminData;
    }

    public EmployeeData getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    @Override
    public String toString() {
        return "EmailOfRepresentativesData{" +
                "id=" + id +
                ", emailOfRep='" + emailOfRep + '\'' +
                ", nameOfRep='" + nameOfRep + '\'' +
                ", adminApproved='" + adminApproved + '\'' +
                '}';
    }
}
