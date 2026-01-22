package com.xworkz.posting.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class FormDto {

    private int id;
    private String name;
    private String username;
    private String email;
    private long phoneNumber;
    private double percentage;
    private boolean passed;

}
