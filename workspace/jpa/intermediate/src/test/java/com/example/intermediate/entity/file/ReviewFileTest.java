package com.example.intermediate.entity.file;


import com.example.intermediate.repository.file.ReviewFileDAO;
import com.example.intermediate.type.FileType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@SpringBootTest
@Transactional
@Rollback(false)
@Slf4j
public class ReviewFileTest {
    @Autowired
    ReviewFileDAO reviewFileDAO;

    @Test
    public void saveTest(){
        ReviewFile reviewFile = new ReviewFile();
        reviewFile.setFileType(FileType.APPLICATION);
        reviewFile.setName("첫번째");
        reviewFile.setFileSize(1024L);
        reviewFile.setUuid(UUID.randomUUID().toString());
        reviewFile.setFilePath("2023/04/17");

        reviewFileDAO.save(reviewFile);

    }

    @Test
    public void findByIdTest(){
        reviewFileDAO.findById(1L).map(File::toString).ifPresent(log::info);
    }

    @Test
    public void findAllTest(){
        reviewFileDAO.findAll().stream().map(ReviewFile::toString).forEach(log::info);
    }

    @Test
    public void updateTest(){
        reviewFileDAO.findById(4L).ifPresent(reviewFile -> reviewFile.setName("수정.txt"));
    }
    @Test
    public void deleteTest(){
        reviewFileDAO.findById(4L).ifPresent(reviewFileDAO::delete);
    }

}
