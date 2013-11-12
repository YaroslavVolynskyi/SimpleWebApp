package org.epam.study.concurrency.web;

import org.epam.study.concurrency.core.BookStoreService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Oleg Tsal-Tsalko
 */
@WebServlet("/books")
public class BooksServlet extends HttpServlet {

    @Inject
    private BookStoreService bookStoreService;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("books", bookStoreService.getBooks());
        req.getRequestDispatcher("/WEB-INF/views/books.jsp").forward(req, resp);
    }

}
