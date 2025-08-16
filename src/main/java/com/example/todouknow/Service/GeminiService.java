package com.example.todouknow.Service;


import com.google.genai.types.GenerateContentResponse;
import com.google.generativeai.GenerativeModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.swing.text.AbstractDocument;

@Service
public class GeminiService {

    private final String apiKey;
    private final GenerativeModel model;

    public GeminiService(@Value("${gemini.api.key}") String apiKey) {
        this.apiKey = apiKey;
        this.model = new GenerativeModel(apiKey);
    }


public String getRecomendacao(String nomeTarefa){

        try{

            // Criar o Prompt com a instrucao da IA
            String prompt = "Dê uma sugestão de como eu posso começar ou  que eu posso fazer em relação à tarefa:" + nomeTarefa +". Responda de forma curta e direta.";

            //Criando o conteudo que sera enviado para a IA
            Content content = new Content.Builder().addText(prompt).build();


            //Envie o pedido para e obtenha a resposta

            GenerateContentResponse response = model.generateContent(content);


            //Retorno a sugestao de IA
            return response.getText();

        } catch (Exception e) {
            return "Desculpe, não consegui obter uma sugestão no momento. Tente novamente mais tarde.";
        }


}





}
