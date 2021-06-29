package ru.schepin.examples.annotation;


public class Person {
    private String author;
    private String date;


    public Person() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
