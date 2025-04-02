package com.bookstore.Project.with.Spring.Boot.Repositories;

import com.bookstore.Project.with.Spring.Boot.Models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    BookModel findBookModelByTitle(String title);

}
