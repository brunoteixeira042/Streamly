package br.com.aula.Streamly.principal;

import br.com.aula.Streamly.model.DadosEpsodio;
import br.com.aula.Streamly.model.DadosSeries;
import br.com.aula.Streamly.model.DadosTemporada;
import br.com.aula.Streamly.service.ConsumoApi;
import br.com.aula.Streamly.service.ConverteDados;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados converteDados = new ConverteDados();
    private final String URL_SITE ="https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4bb818e7";

    public void exibirMenu() throws JsonProcessingException {
        System.out.println("Digite o nome da Série: ");
        var nomeSerie = sc.nextLine();
        var json = consumo.obterDados(URL_SITE + nomeSerie.replace(" ","+") + API_KEY);
        DadosSeries dados = converteDados.obeterdados(
                json, DadosSeries.class);
        System.out.println(dados);

        List<DadosTemporada> listaDeTemporadas = new ArrayList<>();
		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumo.obterDados(
					URL_SITE+nomeSerie.replace(" ","+")+"&Season="+i+API_KEY);
			DadosTemporada dadosTemporada = converteDados.obeterdados(json, DadosTemporada.class);
			listaDeTemporadas.add(dadosTemporada);
		}
		listaDeTemporadas.forEach(System.out::println);
    }
}
