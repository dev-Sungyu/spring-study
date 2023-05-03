package com.example.advanced.entity.owner;


import com.example.advanced.entity.Owner.Owner;
import com.example.advanced.entity.Owner.Pet;
import com.example.advanced.entity.board.Board;
import com.example.advanced.repository.owner.OwnerDAO;
import com.example.advanced.type.PetType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
@Slf4j
public class OwnerTests {
    @Autowired
    OwnerDAO ownerDAO;

    @Test
    public void saveTest() {
        Owner owner = new Owner();
        Pet pet = new Pet();


        pet.setPetGender("암컷");
        pet.setPetName("하양이");
        pet.setPetType(PetType.ragdoll);

        owner.getPets().add(pet);
        owner.setOwnerName("이순철");
        owner.setOwnerPhone("010-1234-5678");
        ownerDAO.save(owner);
    }

    @Test
    public void findByIdTest() {
        ownerDAO.findById(1L).map(Owner::toString).ifPresent(log::info);
    }

    @Test
    public void findAllTest() {
        ownerDAO.findAll().stream().map(Owner::toString).forEach(log::info);
    }

    @Test
    public void updateTest() {
//        boardDAO.findById(3L).ifPresent(board -> board.setBoardTitle("수정된 제목"));
        ownerDAO.findById(1L).ifPresent(owner -> owner.getPets().get(0).setPetName("부숨이"));
    }

    @Test
    public void deleteTest() {
        ownerDAO.findById(1L).ifPresent(ownerDAO::delete);
    }
}
