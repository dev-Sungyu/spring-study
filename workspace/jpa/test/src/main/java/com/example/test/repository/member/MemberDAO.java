package com.example.test.repository.member;

import com.example.test.entity.member.Member;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class MemberDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Member save(Member member) {
        entityManager.persist(member);
        return member;
    }

    public Optional<Member> findById(Long id) {
        String query = "select m from Member m join fetch m.challenge where m.id = :id";
        return Optional.ofNullable(entityManager.
                createQuery(query, Member.class).
                setParameter("id", id).
                getSingleResult());
    }

    public List<Member> findAll() {
        String query = "select m from Member m join fetch m.challenge";
        return entityManager.createQuery(query, Member.class).getResultList();
    }

    public void delete(Member member) {
        entityManager.remove(member);
    }

}
