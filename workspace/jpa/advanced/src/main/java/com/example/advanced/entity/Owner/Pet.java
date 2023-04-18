package com.example.advanced.entity.Owner;


import com.example.advanced.audit.Period;
import com.example.advanced.type.PetType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter @ToString
@Table(name = "TBL_PET")
public class Pet extends Period {
    @Id @GeneratedValue
    private Long id;
    private String petName;
    private String petGender;
    private PetType petType;
}
