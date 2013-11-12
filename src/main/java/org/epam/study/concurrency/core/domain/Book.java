package org.epam.study.concurrency.core.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author: Oleg Tsal-Tsalko
 */
public class Book {

    public final String title;
    public final String author;
    public final LocalDate publishDate;
    public final BigDecimal price;
    public final int salesNumber;

    public static Book aBook(String name, String author, LocalDate publishDate, BigDecimal price, int salesNumber) {
        return new Book(name, author, publishDate, price, salesNumber);
    }

    public Book(String title, String author, LocalDate publishDate, BigDecimal price, int salesNumber) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.salesNumber = salesNumber;
    }

    //-----------------------------------------------------------------------------
    // These getters are added to be able to use this domain object in .jsp pages
    //-----------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getSalesNumber() {
        return salesNumber;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
