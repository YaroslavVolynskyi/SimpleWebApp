package org.epam.study.concurrency.core;

import org.epam.study.concurrency.core.domain.Book;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author: Oleg Tsal-Tsalko
 */
public class BookStoreServiceTest {

    private BookStoreService bookStoreService = new BookStoreService();

    @Test
    public void testServiceMock() throws Exception {
        List<Book> books = bookStoreService.getBooks();
        assertNotNull(books);
        assertThat(books.size(), is(2));
    }

}
