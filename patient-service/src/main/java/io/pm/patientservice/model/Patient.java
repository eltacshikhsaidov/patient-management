package io.pm.patientservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "patient", uniqueConstraints = {
        @UniqueConstraint(name = "uk_patient_email", columnNames = "email")
})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Patient {
    @Id
    @GeneratedValue
    UUID id;

    @NotNull
    String name;

    @NotNull
    @Email
    @Column(unique = true)
    String email;

    @NotNull
    String address;

    @NotNull
    LocalDate dateOfBirth;

    @NotNull
    LocalDate registeredDate;

}
