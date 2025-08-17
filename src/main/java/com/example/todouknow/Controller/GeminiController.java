package com.example.todouknow.Controller;


import com.example.todouknow.Service.GeminiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gemini")
public class GeminiController {

    private final GeminiService geminiService;

    public GeminiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }


    @GetMapping("/sugestao")
    public String obterSugestao(@RequestParam String tarefa){
        return geminiService.getRecomendacao(tarefa);
    }



}
