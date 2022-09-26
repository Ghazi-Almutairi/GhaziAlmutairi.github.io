package com.sys.appointmentsystemv0.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OperatorData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String userRole= "Operator";
    private String dateOfBirth;

  @OneToMany(mappedBy = "operatorData")
    Set<AppointmentData> appData= new HashSet<>();
    private String password;

    public OperatorData() {
    }

    public OperatorData(Long id, String firstName, String lastName, String userName, String email, String userRole, String dateOfBirth, String password) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.userRole = userRole;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AppointmentData> getAppData() {
        return appData;
    }

    public void setAppData(Set<AppointmentData> appData) {
        this.appData = appData;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
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
