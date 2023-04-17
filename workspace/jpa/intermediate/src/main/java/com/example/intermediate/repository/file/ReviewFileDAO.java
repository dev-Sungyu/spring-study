package com.example.intermediate.repository.file;


import com.example.intermediate.entity.file.ReviewFile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class ReviewFileDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public ReviewFile save(ReviewFile reviewFile){
        entityManager.persist(reviewFile);
        return reviewFile;
    }

    public Optional<ReviewFile> findById(Long id){
        return Optional.ofNullable(entityManager.find(ReviewFile.class, id));
    }

    public List<ReviewFile> findAll(){
        String query = "select r from ReviewFile r";
        return entityManager.createQuery(query, ReviewFile.class).getResultList();
    }

    public void delete(ReviewFile reviewFile){
        entityManager.remove(reviewFile);
    }

}
