package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

public class ProjetoTest {
	
	@Test
	public void testQueAConexaoComOServidorFunciona(){
		Client client = ClientBuilder.newClient();
		//path
		WebTarget target = client.target("http://www.mocky.io");
		String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
		
		/*
		 * verifica se 
		 * a string abaixo está no path do xml acima
		 * */
		
		Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
		
	}

}
