package models.staff;

import models.contact.EmergencyContact;
import models.enums.AccessEnum;
import models.enums.DepartmentEnum;
import models.enums.EquipmentEnum;
import models.review.PerformanceReview;

import javax.persistence.Column;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Optional;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
//    @Column(name="manager_id")
    private Long managerId;

    @OneToMany
//    @Column(name="performance_review_id")
    private ArrayList<Long> performanceReviewId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="dob")
    private GregorianCalendar dob;

    @Column(name="start_date")
    private GregorianCalendar startDate;

    @Column(name="end_date")
    private GregorianCalendar endDate;

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
    private long contactNumber;

    @Column(name="email")
    private String email;

    @Column(name="medical_info")
    private String medicalInfo;

    @Column(name="nin")
    private String NIN;

    @OneToOne
//    @Column(name="emergency_contact")
    private Long emergencyContactId;

    public Employee(Long id,
                    String firstName,
                    String lastName,
                    GregorianCalendar dob,
                    GregorianCalendar startDate,
                    GregorianCalendar endDate,
                    AccessEnum permission,
                    double salary,
                    DepartmentEnum department,
                    String photo,
                    boolean active,
                    long contactNumber,
                    String email,
                    String NIN
                    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.startDate = startDate;
        this.endDate = endDate;
        this.permission = permission;
        this.salary = salary;
        this.department = department;
        this.photo = photo;
        this.active = active;
        this.contactNumber = contactNumber;
        this.email = email;
        this.NIN = NIN;
        this.manager = Optional.empty();
        this.reasonableAdjustments = "";
        this.companyEquipment = new ArrayList<>();
        this.medicalInfo = "";
//        this.emergencyContact = new EmergencyContact(1, "TBF", "TBF", 0044_000_000_0000, "TBF");
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<Manager> getManager() {
        return manager;
    }

    public void setManager(Optional<Manager> manager) {
        this.manager = manager;
    }

    public ArrayList<PerformanceReview> getPerformanceReviews() {
        return performanceReviews;
    }

    public void setPerformanceReviews(ArrayList<PerformanceReview> performanceReviews) {
        this.performanceReviews = performanceReviews;
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

    public GregorianCalendar getDob() {
        return dob;
    }

    public void setDob(GregorianCalendar dob) {
        this.dob = dob;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
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

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
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
