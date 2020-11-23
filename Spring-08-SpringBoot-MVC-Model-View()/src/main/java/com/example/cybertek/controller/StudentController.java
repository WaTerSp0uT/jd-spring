package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cybertek" );
        model.addAttribute("course", "MVC" );
        String subject = "Collections";

        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt(1000);
        model.addAttribute("id", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(13);
        numbers.add(17);
        numbers.add(69);
        model.addAttribute("numbers", numbers);

        LocalDate birthday = LocalDate.now().minusYears(27);
        model.addAttribute("birthday",birthday);

        return "student/welcome";
    }
}
