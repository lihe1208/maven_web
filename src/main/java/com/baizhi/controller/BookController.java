package com.baizhi.controller;

import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("selectAll")
    public String selectAll(ModelMap modelMap){
        List list =bookService.selectAll();
        modelMap.addAttribute("list",list);
        return "forward:/bookList.jsp";
    }
}