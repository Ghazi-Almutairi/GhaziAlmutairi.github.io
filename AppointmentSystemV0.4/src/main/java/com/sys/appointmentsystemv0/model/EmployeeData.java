package com.sys.appointmentsystemv0.model;

import com.sys.appointmentsystemv0.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class EmployeeData {
    @Id
    @Column(name = "id", nullable = false)
    private Long employee_id;
    private String firstName;
    private String lastName;
    private String userName;
//    private String userName=" A  ";
    private String email;
    private String userRole= "Employee";
    private String dateOfBirth;
    private String password;
    @OneToMany(mappedBy ="employeeData" ,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<EmailOfRepresentativesData> emailOfRep=new HashSet<>();
    @OneToMany( mappedBy ="employeeData" ,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<AppointmentData> appointmentData = new java.util.LinkedHashSet<>();;


    public EmployeeData(){};

    public EmployeeData( Long employee_id,String firstName, String lastName, String userName, String email, String userRole, String dateOfBirth, String password ) {
        this.employee_id=employee_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.userRole = userRole;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<AppointmentData> getAppointmentData() {
        return appointmentData;
    }

    public void setAppointmentData(Set<AppointmentData> appointmentData) {
        this.appointmentData = appointmentData;
    }
    public void addAppointmentData(AppointmentData appointmentData) {
        this.appointmentData.add(appointmentData);
    }

    public Set<EmailOfRepresentativesData> getEmailOfRep() {
        return emailOfRep;
    }

    public void setEmailOfRep(Set<EmailOfRepresentativesData> emailOfRep) {
        this.emailOfRep = emailOfRep;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "Employee id=" + employee_id +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", UserName='" + userName + '\'' +
                ", Email='" + email + '\'' +
                ", UserRole='" + userRole + '\'' +
                ", DateOfBirth='" + dateOfBirth + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
