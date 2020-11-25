package com.cybertek.controller;

import com.cybertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList("B7","B8","B9","E1","E2","E3","J7","J17","J27","J47");
        model.addAttribute("batchList",batchList);


        return "mentor/mentor-register";
    }
    @PostMapping("/confirm")
    public String submitForm(){

        return "mentor/mentor-confirmation";
    }

}
