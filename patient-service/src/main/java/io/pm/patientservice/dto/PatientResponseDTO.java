package io.pm.patientservice.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PatientResponseDTO {
    String id;
    String name;
    String email;
    String address;
    String dateOfBirth;
}
