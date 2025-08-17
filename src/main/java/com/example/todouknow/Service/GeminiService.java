package com.example.todouknow.Service;




import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.AbstractDocument;

@Service
public class GeminiService {

    private final ChatClient chatClient;

    @Autowired
    public GeminiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String getRecomendacao(String nomeTarefa){
        String prompt = "Dê uma sugestão de como eu posso começar ou o que eu posso fazer em relação à tarefa: " + nomeTarefa+".Responda de forma curta e direta.";
        return this.chatClient.prompt().user(prompt).call().content();

    }





}
