package com.sys.appointmentsystemv0.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AdminData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String userRole= "Admin";
    private String dateOfBirth;
    private String password;
    @OneToMany(mappedBy ="adminData",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<EmailOfRepresentativesData> emailOfRep=new HashSet<>();


    public AdminData(Long id, String firstName, String lastName, String userName, String email, String userRole, String dateOfBirth, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.userRole = userRole;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public AdminData() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<EmailOfRepresentativesData> getEmailOfRep() {
        return emailOfRep;
    }

    public void setEmailOfRep(Set<EmailOfRepresentativesData> emailOfRep) {

        this.emailOfRep = emailOfRep;
    }

    @Override
    public String toString() {
        return "AdminData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", userRole='" + userRole + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
