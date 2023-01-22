package ru.project.library.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Title should not be empty")
    @Size(min = 2, max = 40, message = "Title should be between 2 and 40 characters")
    private String title;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String nameAuthor;
    @NotEmpty(message = "Year doesn't null")
    private int yearRealise;

    public Book(int id, String title, String nameAuthor, int yearRealise) {
        this.id = id;
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.yearRealise = yearRealise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getYearRealise() {
        return yearRealise;
    }

    public void setYearRealise(int yearRealise) {
        this.yearRealise = yearRealise;
    }
}
