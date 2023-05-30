package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = {"/","/save"})
public class SandwichController {
    @GetMapping
    public ModelAndView showIndex(){
        ModelAndView modelAndView = new ModelAndView("/sandwich");
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView actionSave(@RequestParam(required = false, name = "condiment") String[] condiment){
        List<String> condimentList = new ArrayList<>(Arrays.asList(condiment));
        ModelAndView modelAndView = new ModelAndView("/result");
        modelAndView.addObject("condiment", condimentList);
        return modelAndView;
    }
}
