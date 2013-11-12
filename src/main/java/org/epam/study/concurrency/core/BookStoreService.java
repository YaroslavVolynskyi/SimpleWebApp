package org.epam.study.concurrency.core;

import org.epam.study.concurrency.core.domain.Book;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.epam.study.concurrency.core.domain.Book.aBook;

/**
 * @author: Oleg Tsal-Tsalko
 */
public class BookStoreService {
    public List<Book> getBooks() {
        return new ArrayList<>(Arrays.asList(
                aBook("Java Concurrency in Practice", "Brian Goetz", LocalDate.of(2006, Month.MAY, 19), BigDecimal.valueOf(37.98), 100000),
                aBook("MongoDB: The Definitive Guide", "Kristina Chodorow", LocalDate.of(2013, Month.MAY, 23), BigDecimal.valueOf(34.44), 10000)));
    }
}
