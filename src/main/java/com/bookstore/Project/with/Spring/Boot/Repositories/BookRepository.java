package com.bookstore.Project.with.Spring.Boot.Repositories;

import com.bookstore.Project.with.Spring.Boot.Models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    BookModel findBookModelByTitle(String title);
    //@Query(value = "SELECT * FROM TB_BOOK  WHERE publisher_id = :id",nativeQuery = true)
    //List<BookModel> findBookModelByPublisherId(@Param("id")UUID id);
}
