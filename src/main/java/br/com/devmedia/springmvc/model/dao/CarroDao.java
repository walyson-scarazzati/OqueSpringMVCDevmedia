package br.com.devmedia.springmvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.devmedia.springmvc.model.domain.Carro;

//um bean relacionado a camada de acesso a dados a partir de agora deve gerenciar o ciclo de vida desse bean
@Repository
public class CarroDao {

	private static List<Carro> carros;

	public CarroDao() {
		criarCarros();
	}

	private void criarCarros() {
		if (carros == null) {
			carros = new ArrayList<Carro>();

			carros.add(new Carro("Focus", "Ford", 2016));
			carros.add(new Carro("Linea", "Fiat", 2014));
			carros.add(new Carro("Jetta", "Volkswagen", 2015));
			carros.add(new Carro("Cruze", "Chevrolet", 2017));
		}
	}

	public List<Carro> getCarros() {
		return carros;
	}

}
