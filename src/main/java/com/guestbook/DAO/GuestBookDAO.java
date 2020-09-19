package com.guestbook.DAO;

import com.guestbook.Model.GuestBook;

import java.util.List;

public interface GuestBookDAO {

    public List<GuestBook> getGuestBookList();

    public void addGuestBook(GuestBook guestBook);
}
