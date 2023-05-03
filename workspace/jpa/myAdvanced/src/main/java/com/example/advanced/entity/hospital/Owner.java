package com.example.advanced.entity.hospital;


import com.example.advanced.audit.Period;
import com.example.advanced.entity.board.Reply;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "TBL_OWNER")
public class Owner extends Period {
    @Id
    @GeneratedValue
    private Long id;
    private String ownerName;
    @Column(unique = true)
    private String ownerPhone;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "OWNER_ID")
    List<Pet> pets = new ArrayList<>();
}
