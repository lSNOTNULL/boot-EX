package org.example.bootex.controller;

import lombok.RequiredArgsConstructor;
import org.example.bootex.dto.PromptForm;
import org.example.bootex.service.GeminiService;
import org.example.bootex.service.PromptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class PromptController {
    private final PromptService promptService;
    private final GeminiService geminiService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("promptForm", new PromptForm(""));
        return "index";
    }

    @PostMapping
    public String submit(PromptForm promptForm, Model model) throws IOException, InterruptedException {
        String result = geminiService.generate(promptForm.text());
        model.addAttribute("promptText",result);
        return "index";
    }
}