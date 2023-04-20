package com.example.expert.repository.board;

import com.example.expert.board.Board;
import com.example.expert.board.Like;
import com.example.expert.inquiry.Answer;
import com.example.expert.inquiry.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class BoardDAO {
    @PersistenceContext
    private EntityManager entityManager;

//    추가
    public Board save(Board board){
        entityManager.persist(board);
        return board;
    }

//    조회
    public Optional<Board> findById(Long id){
        return Optional.ofNullable(entityManager.find(Board.class, id));
//        String query = "select b from Board b join fetch b.likes where b.id = :id";
//        return Optional.ofNullable(entityManager.createQuery(query, Board.class).setParameter("id",id).getSingleResult());
    }

//    참조 엔티티 조회
    public Optional<Like> findLikeById(Long id){
        String query = "select l from Like l where l.id = :id";
        return Optional.ofNullable(entityManager.createQuery(query, Like.class).setParameter("id", id).getSingleResult());
    }

//    전체 조회
    public List<Board> findAll(){
        String query = "select b from Board b join fetch b.likes";
        return entityManager.createQuery(query, Board.class).getResultList();
    }

//    삭제
    public void delete(Board board){
    entityManager.remove(board);
}

//    참조 엔티티 삭제
    public void delete(Like like){
        entityManager.remove(like);
    }

}
