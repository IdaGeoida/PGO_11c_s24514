package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book {
    private final Long ID = UUID.randomUUID().node();
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvailable;
    private Person borrower;
    private ArrayList<Person> authors;

    public void BorrowBook(Person person){
        if(this.isAvailable==false || person.getBorrowingBook()==null){}
        else{
            this.isAvailable = false;
            this.borrowCount++;
            person.setBorrowedBook(this);
            this.borrower = person;
        }
    }

    public void PlaceBack(){
        if(this.isAvailable==true || borrower.getBorrowingBook()!=this){
            throw new ValidationException("Book is available or this is not the borrower");
        }
        else {
            this.isAvailable = true;
            borrower.setBorrowedBook(null);
        }
    }

    private Book(BookBuilder builder){
        this.name = builder.name;
        this.genre = builder.genre;
        this.language = builder.language;
        this.publishDate = builder.publishDate;
        this.borrowCount = builder.borrowCount;
        this.isAvailable = builder.isAvailable;
        this.borrower = builder.borrower;
        this.authors = builder.authors;
    }


    public static class BookBuilder{
        private final Long ID = UUID.randomUUID().node();
        private final String name;
        private final Genre genre;
        private final Lang language;
        private LocalDate publishDate;
        private int borrowCount;
        private boolean isAvailable;
        private Person borrower;
        private ArrayList<Person> authors;

        public BookBuilder(String name, Genre genre, Lang language, ArrayList<Person> authors) {
            this.name = name;
            this.genre = genre;
            this.language = language;
            this.borrowCount = 0;
            this.isAvailable = true;
            this.borrower = null;
            this.authors = authors;
        }

        public BookBuilder publishDate(LocalDate date) {
            this.publishDate = date;
            return this;
        }

        public Book build() {
            Book book =  new Book(this);
            return book;
        }
    }

    Book book1 = new BookBuilder("Kajko i Kokosz", Genre.Comics, Lang.Polish, null)
            .publishDate(LocalDate.now())
            .build();
}