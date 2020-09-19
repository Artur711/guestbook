package com.guestbook.DAO;

import com.guestbook.Model.GuestBook;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PsqlGuestBookDAO implements GuestBookDAO {


    private static List<GuestBook> guestBookList = Stream.of(new GuestBook(1,"Mikael", "This is teh first entry to my guest book.", "22.11.2018 20:52:47"),
                                                            new GuestBook(2, "Mikael", "This is the second entry in my guest book. Seems to be working well.", "22.11.2018 20:52:52"),
                                                            new GuestBook(3, "Mikael", "Well, that's all for this time", "22.11.2018 22:52:50")).
                                                            collect(Collectors.toList());

    @Override
    public List<GuestBook> getGuestBookList() {
        return guestBookList;
    }

    @Override
    public void addGuestBook(GuestBook guestBook) {
        guestBookList.add(guestBook);
    }
}
