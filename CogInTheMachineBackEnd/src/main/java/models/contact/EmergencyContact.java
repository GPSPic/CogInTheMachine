package models.contact;

import models.staff.Employee;

import javax.persistence.*;

@Entity
@Table(name="emergency_contact")
public class EmergencyContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="contact_number")
    private Long contactNumber;

    @Column(name="relationship")
    private String relationship;

    public EmergencyContact(Long id,
                            String firstName,
                            String lastName,
                            Long contactNumber,
                            String relationship) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.relationship = relationship;
    }
}
