package com.sys.appointmentsystemv0.model;

import javax.persistence.*;

@Entity

public class AppointmentData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String sortedDate;
    private String approvedWorkFlow;
    private String dateStatus;
    private String reason;
    private String date;
    private String newDate;
//    @OneToMany(mappedBy = "dateId")
//    Set<AppointmentData> appData= new HashSet<>();
@ManyToOne
@JoinColumn(name = "operator_Id")
private OperatorData operatorData;

    @ManyToOne
    @JoinColumn(name = "employee_Id")
    private EmployeeData employeeData;
    @ManyToOne
    @JoinColumn(name = "representative_Id")
    private RepresentativeData representativeData;

    public AppointmentData(Long id, String sortedDate, String approvedWorkFlow, String dateStatus, String reason, String date, String newDate) {
        this.id = id;
        this.sortedDate = sortedDate;
        this.approvedWorkFlow = approvedWorkFlow;
        this.dateStatus = dateStatus;
        this.reason = reason;
        this.date = date;
        this.newDate = newDate;
    }

    public AppointmentData() {

    }

    public Long getDate_id() {
        return id;
    }

    public void setDate_id(Long id) {
        this.id = id;
    }

    public String getSortedDate() {
        return sortedDate;
    }

    public void setSortedDate(String sortedDate) {
        this.sortedDate = sortedDate;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public String DeclineReason(String acceptedSortedDate){
    return "Approve the "+acceptedSortedDate+"Date";
    }
    public EmployeeData getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public RepresentativeData getRepresentativeData() {
        return representativeData;
    }

    public void setRepresentativeData(RepresentativeData representativeData) {
        this.representativeData = representativeData;
    }

    public OperatorData getOperatorData() {
        return operatorData;
    }

    public void setOperatorData(OperatorData operatorData) {
        this.operatorData = operatorData;
    }

    public String getApprovedWorkFlow() {
        return approvedWorkFlow;
    }

    public void setApprovedWorkFlow(String approvedWorkFlow) {
        this.approvedWorkFlow = approvedWorkFlow;
    }

    public String getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(String dateStatus) {
        this.dateStatus = dateStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNewDate() {
        return newDate;
    }

    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }

    @Override
    public String toString() {
        return "AppointmentData{" +
                "date_id=" + id +
                ", sortedDate='" + sortedDate + '\'' +
                ", approvedWorkFlow='" + approvedWorkFlow + '\'' +
                ", dateStatus='" + dateStatus + '\'' +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                ", newDate='" + newDate + '\'' +
                '}';
    }

}
