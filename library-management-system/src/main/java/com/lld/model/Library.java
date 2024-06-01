package com.lld.model;

import com.lld.common.model.LldBeanId;
import com.lld.common.util.LldBeanFactory;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public final class Library extends LldBeanId implements LldBeanFactory<Library>,Cloneable {

    private static Library INSTANCE;


    private String entityName;
    private Librarian librarian;
    private final List<Member> members = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();

    private Library() {
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public static Library getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Library();
        }
        return INSTANCE;
    }
}
