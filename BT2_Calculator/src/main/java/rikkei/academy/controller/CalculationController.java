package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Operation;
import rikkei.academy.service.IOperationService;

@Controller
@RequestMapping(value = {"/", "/calculate"})
public class CalculationController {
    @Autowired
    private IOperationService operationService;

    @GetMapping("/")
    public ModelAndView showCalculator(@RequestParam(name = "operation", defaultValue = "") String name,
                                       @RequestParam(name = "result", defaultValue = "0") float result) {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("list", operationService.findAll());
        modelAndView.addObject("operation", name);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @PostMapping("/calculate")
    public String actionCalculate(@RequestParam("firstNum") int num1,
                                  @RequestParam("secondNum") int num2,
                                  @RequestParam("cal") int id,
                                  Model model) {
        float result = 0;
        switch (id) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = (float) num1 / num2;
                }else {
                    result = 0;
                }
                break;
        }
        Operation operation = operationService.findById(id);
        model.addAttribute("result", result);
        model.addAttribute("operation", operation.getName());
        return "redirect:/";
    }
}
