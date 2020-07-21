package com.arisenbook.arisenbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arisenbook.arisenbookapp.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
