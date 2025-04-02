package com.bookstore.Project.with.Spring.Boot.Service;

import com.bookstore.Project.with.Spring.Boot.Dto.BookRecordDto;
import com.bookstore.Project.with.Spring.Boot.Models.BookModel;
import com.bookstore.Project.with.Spring.Boot.Repositories.AuthorRepository;
import com.bookstore.Project.with.Spring.Boot.Repositories.BookRepository;
import com.bookstore.Project.with.Spring.Boot.Repositories.PublisherRepository;
import com.bookstore.Project.with.Spring.Boot.Repositories.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, PublisherRepository publisherRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public BookModel saveBook(BookRecordDto bookRecordDto){
        BookModel bookModel = new BookModel();
        bookModel.setTitle(bookRecordDto.title());
        bookModel.setPublisher(publisherRepository.findById(bookRecordDto.publisherId()).get());
        bookModel.setAuthors(authorRepository.findAllById(bookRecordDto.authorsId()).stream().collect(Collectors.toSet()));
        return bookModel;
    }
}
