/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bookstore.dao;
import com.mycompany.bookstore.model.Book;
import java.util.List;
/**
 *
 * @author Pc
 */
public interface BookDAO {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(String bookId);
    Book getBookById(String bookId);
    List<Book> getAllBooks();
}
