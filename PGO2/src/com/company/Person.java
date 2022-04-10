package com.company;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Period Age = Period.between(dateOfBirth, LocalDate.now());
    private Book borrowingBook;
    private Address address;


    public Period getAge() {
        if (dateOfBirth == null) {
            throw new ValidationException("Creation date is null");
        }
        return Period.between(dateOfBirth, LocalDate.now());
    }

    public void setBorrowedBook(Book book){
        this.borrowingBook = book;
    }

    public Book getBorrowingBook(){
        return this.borrowingBook;
    }

    public Person(String name, String surname, LocalDate dateOfBirth, Address address) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Person person1 = new Person("Jan", "Kowalski", LocalDate.now(), null);

    public Person returnPerson(Person person) {
        return person;
    }

    public void PublishBook(){
        //idk how to do that, need more insight, UML doesn't really cover this method
    }
}

