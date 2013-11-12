package org.epam.study.concurrency.web;

import org.epam.study.concurrency.core.BookStoreService;
import org.epam.study.concurrency.core.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author: Oleg Tsal-Tsalko
 */
@RunWith(MockitoJUnitRunner.class)
public class BookServletTest {

    @InjectMocks
    private BooksServlet booksServlet = new BooksServlet();
    @Mock
    private BookStoreService bookStoreService;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher dispatcher;

    @Test
    public void testBooksServletDoGetMethod() throws Exception {
        when(request.getRequestDispatcher("/WEB-INF/views/books.jsp")).thenReturn(dispatcher);
        final List<Book> books = Collections.emptyList();
        when(bookStoreService.getBooks()).thenReturn(books);

        booksServlet.doGet(request, response);

        verify(request).setAttribute("books", books);
        verify(dispatcher).forward(request, response);
    }
}
