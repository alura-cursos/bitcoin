package br.com.alura.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alura.model.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class OrdemRepositoryTest {

	@InjectMock
	OrdemRepository ordemRepository;

	@Test
	public void testarSeListAllRetornaTodasAsOrdensCorretas() {
		Ordem ordem = new Ordem();
		List<Ordem> ordens = new ArrayList<>();
		ordens.add(ordem);

		Mockito.when(ordemRepository.listAll()).thenReturn(ordens);

		Assertions.assertSame(ordem, ordemRepository.listAll().get(0));
	}

}
