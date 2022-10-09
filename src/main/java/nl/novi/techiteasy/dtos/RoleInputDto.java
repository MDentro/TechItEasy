package nl.novi.techiteasy.dtos;

import javax.validation.constraints.NotBlank;

public class RoleInputDto {
    @NotBlank
    public String rolename;
}
