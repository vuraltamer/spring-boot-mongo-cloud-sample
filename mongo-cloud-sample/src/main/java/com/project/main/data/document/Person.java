package com.project.main.data.document;

import com.project.main.service.dto.PersonDto;
import com.project.main.data.document.base.BaseDocument;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "person")
public class Person extends BaseDocument<PersonDto> {

    @Field("username")
    private String username;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("phone")
    private String phone;

    @Field("email")
    private String email;
}
