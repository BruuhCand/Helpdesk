package com.bruna.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.helpdesk.domain.Chamado;
import com.bruna.helpdesk.domain.Cliente;
import com.bruna.helpdesk.domain.Tecnico;
import com.bruna.helpdesk.domain.enums.Perfil;
import com.bruna.helpdesk.domain.enums.Prioridade;
import com.bruna.helpdesk.domain.enums.Status;
import com.bruna.helpdesk.repositories.ChamadoRepository;
import com.bruna.helpdesk.repositories.ClienteRepository;
import com.bruna.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instanciaDB(){
		
		Tecnico tec1 = new Tecnico(null, "Bruna Candido", "12345678999", "bruna@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Carlinhos Junior", "11111111111", "carlinhos@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
