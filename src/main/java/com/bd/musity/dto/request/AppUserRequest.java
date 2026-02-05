package com.bd.musity.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserRequest {

    @Size(min=2, max=50, message = "Name must be beetween 2 and 50 character")
    private String name;

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 character")
    private String password;

    private String oldPassword;

    @Pattern(regexp ="^(USER|ADMIN)$", message = "Role must be either User or ADMIN")
    private String role;

    private String refreshToken;

}
