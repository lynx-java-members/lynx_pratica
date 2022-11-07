package com.example.lynxpratica.repository;

import com.example.lynxpratica.data.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    
}
