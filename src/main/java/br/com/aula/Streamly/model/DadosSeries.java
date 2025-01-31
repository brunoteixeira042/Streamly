package br.com.aula.Streamly.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.parsing.AliasDefinition;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias ("Title") String nome,
                          @JsonAlias("totalSeasons") Integer totalTemporadas,
                          @JsonAlias("imdbRating") String avalicao)
{
}
