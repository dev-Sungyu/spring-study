package com.example.advanced.repository.owner;


import com.example.advanced.entity.Owner.Owner;
import com.example.advanced.entity.Owner.Pet;
import com.example.advanced.entity.board.Board;
import com.example.advanced.entity.board.Reply;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class OwnerDAO {
    @PersistenceContext
    EntityManager entityManager;

    public Owner save(Owner owner){
        entityManager.persist(owner);
        return owner;
    }

//    public Pet save(Pet pet){
//        entityManager.persist(pet);
//        return pet;
//    }

public Optional<Owner> findById(Long id){
    String query = "select o from Owner o join fetch o.pets where o.id = :id";
    return Optional.ofNullable(
            entityManager
                    .createQuery(query, Owner.class)
                    .setParameter("id", id)
                    .getSingleResult());
}

    public Optional<Pet> findReplyById(Long id) {
        return Optional.ofNullable(entityManager.find(Pet.class, id));
    }

    public List<Owner> findAll(){
        String query = "select o from Owner o";
        return entityManager.createQuery(query, Owner.class).getResultList();
    }

    public void delete(Owner owner){
        entityManager.remove(owner);
    }
}
