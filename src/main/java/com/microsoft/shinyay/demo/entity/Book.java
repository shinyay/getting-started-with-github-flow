package com.microsoft.shinyay.demo.entity;

import javax.persistence.Entity;
// I will create a entity class for a book
// This class will be used to represent a book in the database
// The database will be created automatically by Spring Data JPA
// The database will be an in-memory database
// The database will be H2
// The database will be created in the file system

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
