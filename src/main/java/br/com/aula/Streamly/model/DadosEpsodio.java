package br.com.aula.Streamly.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpsodio(@JsonAlias("Title") String nome,
                           @JsonAlias("Released") String data,
                           @JsonAlias("Episode") Integer numeroEpsodio,
                           @JsonAlias("imdbRating") String nota
) {
}
