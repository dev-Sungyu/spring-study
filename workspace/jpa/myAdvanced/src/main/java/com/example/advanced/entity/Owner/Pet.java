package com.example.advanced.entity.Owner;


import com.example.advanced.audit.Period;
import com.example.advanced.type.PetType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "TBL_PET")
public class Pet extends Period {
    @Id
    @GeneratedValue
    private Long id;
    private String petName;
    @NotNull
    private String petGender;
    @Enumerated(EnumType.STRING)
    private PetType petType;
}
