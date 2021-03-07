package com.Hostel;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/employee")
    public String homepage() {
        return "employee";

    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }
}
