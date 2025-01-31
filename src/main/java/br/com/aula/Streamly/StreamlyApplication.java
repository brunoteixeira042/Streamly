package br.com.aula.Streamly;

import br.com.aula.Streamly.model.DadosEpsodio;
import br.com.aula.Streamly.model.DadosSeries;
import br.com.aula.Streamly.model.DadosTemporada;
import br.com.aula.Streamly.service.ConsumoApi;
import br.com.aula.Streamly.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StreamlyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamlyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		String json = consumoApi.obterDados
				("https://www.omdbapi.com/?t=loki&apikey=4bb818e7");
		ConverteDados converteDados = new ConverteDados();
		DadosSeries dados = converteDados.obeterdados(json, DadosSeries.class);
		System.out.println(dados);
		json = consumoApi.obterDados(
				"https://www.omdbapi.com/?t=loki&Season=1&Episode=1&apikey=4bb818e7");
		DadosEpsodio dadosEpsodio = converteDados.obeterdados(
				json,DadosEpsodio.class);
		System.out.println(dadosEpsodio);
		List<DadosTemporada> listaDeTemporadas = new ArrayList<>();
		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumoApi.obterDados(
					"https://www.omdbapi.com/?t=loki&Season="+i+"&apikey=4bb818e7");
			DadosTemporada dadosTemporada = converteDados.obeterdados(json, DadosTemporada.class);
			listaDeTemporadas.add(dadosTemporada);
		}
		listaDeTemporadas.forEach(System.out::println);
	}
}
