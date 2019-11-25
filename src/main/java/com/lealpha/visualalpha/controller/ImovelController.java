package com.lealpha.visualalpha.controller;

import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.ImovelJson;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

	//@Autowired
	//private ImovelService imovelService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody ImovelJson imovel) {
		//if(clienteService.cadastrarCliente(cliente))
			//System.out.println("Foto 1 : " + imovel.getFotos()
		return "Salvo com sucesso!";
		//else
			//throw new SalvarException("Erro ao salvar!" );
	}
	
	//@GetMapping("/listarAtivos")
    //public List<ClienteRespJson> listarAtivos() {
		//return clienteService.listarAtivos();
	//}
	
	//@GetMapping("/listarInativos")
    //public List<ClienteRespJson> listarInativos() {
		//return clienteService.listarInativos();
	//}
}
