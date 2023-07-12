package com.cogs.CogInTheMachine.models.staff;

import com.cogs.CogInTheMachine.models.enums.AccessEnum;
import com.cogs.CogInTheMachine.models.enums.DepartmentEnum;
import com.cogs.CogInTheMachine.models.enums.EquipmentEnum;
import com.sun.istack.Nullable;

import javax.persistence.Column;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Optional;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
////    @Column(name="manager_id")
//    private Long managerId;
//
//    @OneToMany
////    @Column(name="performance_review_id")
//    private ArrayList<Long> performanceReviewId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="dob")
    private LocalDate dob;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name="permission")
    private AccessEnum permission;

    @Column(name="salary")
    private double salary;

    @Column(name="department")
    private DepartmentEnum department;

    @Column(name="photo")
    private String photo;

    @Column(name="active")
    private boolean active;

    @Column(name="reasonable_adjustments")
    private String reasonableAdjustments;

    @Column(name="company_equipment")
    private ArrayList<EquipmentEnum> companyEquipment;

    @Column(name="contact_number")
    private String contactNumber;

    @Column(name="email")
    private String email;

    @Column(name="medical_info")
    private String medicalInfo;

    @Column(name="nin")
    private String NIN;

//    @OneToOne
////    @Column(name="emergency_contact")
//    private Long emergencyContactId;

    public Employee(String firstName,
                    String lastName,
                    LocalDate dob,
                    LocalDate startDate,
                    AccessEnum permission,
                    double salary,
                    DepartmentEnum department,
                    String photo,
                    boolean active,
                    String contactNumber,
                    String email,
                    String NIN
                    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.startDate = startDate;
        this.endDate = LocalDate.of(2300, 1, 1);
        this.permission = permission;
        this.salary = salary;
        this.department = department;
        this.photo = photo;
        this.active = active;
        this.contactNumber = contactNumber;
        this.email = email;
        this.NIN = NIN;
//        this.managerId = (long)1;
        this.reasonableAdjustments = "";
        this.companyEquipment = new ArrayList<>();
        this.medicalInfo = "";
//        this.emergencyContactId = (long)1;
//        this.performanceReviewId = new ArrayList<>();
    }

    public Employee() {
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public AccessEnum getPermission() {
        return permission;
    }

    public void setPermission(AccessEnum permission) {
        this.permission = permission;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public DepartmentEnum getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEnum department) {
        this.department = department;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getReasonableAdjustments() {
        return reasonableAdjustments;
    }

    public void setReasonableAdjustments(String reasonableAdjustments) {
        this.reasonableAdjustments = reasonableAdjustments;
    }

    public ArrayList<EquipmentEnum> getCompanyEquipment() {
        return companyEquipment;
    }

    public void setCompanyEquipment(ArrayList<EquipmentEnum> companyEquipment) {
        this.companyEquipment = companyEquipment;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(String medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    public String getNIN() {
        return NIN;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }
}
