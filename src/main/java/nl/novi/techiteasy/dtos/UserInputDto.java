package nl.novi.techiteasy.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInputDto {
    @NotBlank
    public String username;

    @NotBlank
    public String password;

    @Size(min = 1, max = 2)
    public String[] roles;

    @NotBlank
    public String email;

}
