package com.itheima.Controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("/findById")
    public String findById(Model model){
        Items item = service.findById(2);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
