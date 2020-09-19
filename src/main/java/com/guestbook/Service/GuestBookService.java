package com.guestbook.Service;

import com.guestbook.DAO.GuestBookDAO;
import com.guestbook.Model.GuestBook;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GuestBookService {

    private GuestBookDAO guestBookDAO   ;

    public GuestBookService(GuestBookDAO guestBookDAO) {
        this.guestBookDAO = guestBookDAO;
    }

    public List<GuestBook> getAllGuestBook() {
        return guestBookDAO.getGuestBookList();
    }

    public Optional<GuestBook> getGuestBook(int id) {
        return guestBookDAO.getGuestBookList().stream().filter(client -> client.getId() == id).findFirst();
    }

    public void addGuestBook(GuestBook guestBook) {
        guestBookDAO.addGuestBook(guestBook);
    }
}
