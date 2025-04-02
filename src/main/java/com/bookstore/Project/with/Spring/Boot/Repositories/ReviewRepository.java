package com.bookstore.Project.with.Spring.Boot.Repositories;

import com.bookstore.Project.with.Spring.Boot.Models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
