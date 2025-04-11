package com.vinay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Vinaycontroller {

    @Autowired
    private vinayservice vinayService;

    @GetMapping("/vinay")
    public String vinayForm(Model model) {
        model.addAttribute("vinay", new Vinay());
        return "vinay_add";
    }

    @PostMapping("/vinay")
    public String vinaySubmit(@ModelAttribute Vinay vinay, Model model) {
        vinayService.addVinay(vinay);
        model.addAttribute("vinayList", vinayService.getAllVinay());
        return "vinay_list";
    }
}
