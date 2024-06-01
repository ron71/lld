package com.lld.service;

import com.lld.model.Book;

public interface BookService {
    void addBook(final Book book);
    void editBook(final Book book);
    void deleteBook(final Book book);
}
