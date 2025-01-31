package br.com.aula.Streamly.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T obeterdados(String json, Class<T> classe) throws JsonProcessingException {
        return mapper.readValue(json,classe);
    }
}