package com.carpooling.library.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminDto {
    @Size(max = 10, min = 3, message = "invalid last Name (3-10) characters")
    private String lastName;

    @Size(max = 10, min = 3, message = "invalid First Name (3-10) characters")
    private String firstName;

    @Size(max = 10, min = 3, message = "invalid user Name (3-10) characters")
    private String userName;

    @Size(max = 10, min = 3, message = "invalid password (3-10) characters")
    private String password;
    private String repeatPassword;

}
