package com.codeblocks.popstats.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class WelcomeController {

	@RequestMapping("/welcome")

    public String welcome() {
        return "welcome";
    }


}

