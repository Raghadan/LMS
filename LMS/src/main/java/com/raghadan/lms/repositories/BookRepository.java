package com.raghadan.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raghadan.lms.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Long>{

}
