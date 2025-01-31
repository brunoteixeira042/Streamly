package br.com.aula.Streamly.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    <T> T obeterdados(String json, Class<T> classe) throws JsonProcessingException;
}
