package med.voll.api.doctors;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.address.DataAddress;

public record DataDoctors(
        @NotBlank
        String name,
        @NotBlank @Email
        String email,
        @NotBlank
        String phoneNumber,
        @NotBlank @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Specialties specialties,
        @NotNull @Valid
        DataAddress address) {
}
