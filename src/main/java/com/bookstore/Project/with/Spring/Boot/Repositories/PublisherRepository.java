package com.bookstore.Project.with.Spring.Boot.Repositories;

import com.bookstore.Project.with.Spring.Boot.Models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
