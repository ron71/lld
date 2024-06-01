package com.lld.model;

import com.lld.common.model.user.LldUser;
import com.lld.service.BookService;

public class Librarian extends LldUser implements BookService {

    final Library library = Library.getInstance();

    @Override
    public void addBook(final Book book) {
        this.library.getBooks().add(book);
    }

    @Override
    public void editBook(final Book book) {

    }

    @Override
    public void deleteBook(final Book book) {
        this.library.getBooks().remove(book);

    }
}
