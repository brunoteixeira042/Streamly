package br.com.aula.Streamly;

import br.com.aula.Streamly.model.DadosTemporada;
import br.com.aula.Streamly.principal.Principal;
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
		Principal principal = new Principal();
		principal.exibirMenu();

		}
}
