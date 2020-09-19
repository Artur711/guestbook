package com.guestbook.Controller;

import com.guestbook.Model.GuestBook;
import com.guestbook.Service.GuestBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {

    private GuestBookService guestBookService;

    public GuestBookController(GuestBookService guestBookService) {
        this.guestBookService = guestBookService;
    }

    @GetMapping
    public String getAllPosts(Model model) {
        GuestBook guestBook = new GuestBook();
        model.addAttribute("guestbook", guestBookService.getAllGuestBook());
        model.addAttribute("form", guestBook);
        return "guestbook";
    }

    @PostMapping
    public String addPost(@ModelAttribute GuestBook form, Model model) {
        GuestBook guestBook = form;
        guestBookService.addGuestBook(guestBook);
        model.addAttribute("form", form);
        return "redirect:/guestbook";
    }

}
