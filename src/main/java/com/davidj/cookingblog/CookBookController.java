package com.davidj.cookingblog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CookBookController {
    
    @Autowired
    private CookBookRepository cookBookRepo;

    private static List<CookBook> posts = new ArrayList<>();

    @GetMapping(value = "/")
    public String showAllBakes(CookBook cookbook, Model model){
        posts.removeAll(posts);
        for(CookBook post : cookBookRepo.findAll()){
            posts.add(post);
        }

        model.addAttribute("posts", posts);
        return "index";

    }
}