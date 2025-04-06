package br.Guilherme.acervo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.joaquim.acervo.aplicacao.*;

@SpringBootApplication
public class AcervoApplication implements CommandLineRunner {

	@Autowired
	ConsoleApp consoleApp;

	public static void main(String[] args) {
		SpringApplication.run(AcervoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		consoleApp.iniciar();
	}

}
