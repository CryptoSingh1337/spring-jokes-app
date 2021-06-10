package com.saransh.springjokesapp.controllers;

import com.saransh.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CryptoSingh1337 on 6/10/2021
 */
@Controller
@RequestMapping("/chuck-norris")
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/joke")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomJoke());
        return "chuck-norris/joke";
    }
}
