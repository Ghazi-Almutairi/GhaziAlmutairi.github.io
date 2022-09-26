package com.sys.appointmentsystemv0.model;

import javax.persistence.*;
import java.util.*;
import java.util.Set;


@Entity
public class RepresentativeData {
    @Id
    @Column(name = "representativeId", nullable = false)
    private Long representativeId;
    private String firstName;
    private String lastName;
    private String email;
    private String userRole="Representative";
    private String userName;
    private String dateOfBirth;
    private String password;
    @OneToMany( mappedBy ="representativeData" ,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<AppointmentData> dateOfAppointments= new HashSet<>();;

    public RepresentativeData(Long representativeId, String firstName, String lastName,String userName, String email, String userRole, String dateOfBirth, String password) {
        this.representativeId = representativeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email= email;
        this.userRole = userRole;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.userName=userName;
    }

    public RepresentativeData() {
    }

    public Long getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(Long representativeId) {
        this.representativeId = representativeId;
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
        this.lastName = lastName;
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

    public String getUserName() {
        return userName;
    }

    public void getUserName(String userName) {
        this.userName = userName;
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

    public Set<AppointmentData> getDateOfAppointments() {
        return dateOfAppointments;
    }

    public void setDateOfAppointments(Set<AppointmentData> dateOfAppointments) {
        this.dateOfAppointments = dateOfAppointments;
    }

    @Override
    public String toString() {
        return "RepresentativeData{" +
                "representativeId=" + representativeId +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", UserRole='" + userRole + '\'' +
                ", Username='" + userName + '\'' +
                ", DateOfBirth='" + dateOfBirth + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}

