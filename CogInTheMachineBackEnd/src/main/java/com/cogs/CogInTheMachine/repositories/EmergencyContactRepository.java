package com.cogs.CogInTheMachine.repositories;

import com.cogs.CogInTheMachine.models.contact.EmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyContactRepository extends JpaRepository<EmergencyContact, Long> {
}
