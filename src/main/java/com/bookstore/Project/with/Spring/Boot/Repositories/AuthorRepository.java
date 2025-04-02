package com.bookstore.Project.with.Spring.Boot.Repositories;

import com.bookstore.Project.with.Spring.Boot.Models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {}
