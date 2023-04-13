package com.example.basic.repository;


import com.example.basic.domain.entity.Member;
import com.example.basic.domain.entity.SuperCar;
import com.example.basic.type.MemberType;
import com.example.basic.type.SuperCarType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class SuperCarDAOTests {
    @Autowired
    private SuperCarDAO superCarDAO;

    @Test
    public void saveTest(){
        SuperCar superCar = new SuperCar();

        superCar.setColor("black");
        superCar.setName("붕붕이");
        superCar.setPrice((long)200000000);
        superCar.setType(SuperCarType.valueOf("FERRARI"));
        superCar.setReleaseDate(LocalDateTime.now());

        superCarDAO.save(superCar);
    }

    @Test
    public void setSuperCarColorTest(){
        SuperCar superCar = new SuperCar();

        superCar.setColor("black");
        superCar.setName("붕붕이");
        superCar.setPrice((long)200000000);
        superCar.setType(SuperCarType.valueOf("FERRARI"));
        superCar.setReleaseDate(LocalDateTime.now());

        superCarDAO.save(superCar);

        superCar.setColor("yellow");
    }

    @Test
    public void findByIdTest() {
        Optional<SuperCar> optionalSuperCar = superCarDAO.findById(1L);
    }

    @Test
    public void deleteTest(){
        SuperCar superCar = new SuperCar();

        superCar.setColor("black");
        superCar.setName("붕붕이");
        superCar.setPrice((long)200000000);
        superCar.setType(SuperCarType.valueOf("FERRARI"));
        superCar.setReleaseDate(LocalDateTime.now());

        superCarDAO.save(superCar);
        superCarDAO.delete(superCar);
    }


}
