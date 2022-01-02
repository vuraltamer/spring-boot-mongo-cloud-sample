package com.project.main.service.dto;

import com.project.main.service.dto.base.BaseDto;
import com.project.main.data.document.Person;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto extends BaseDto<Person> {

    private String username;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;
}
