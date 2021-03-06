package org.generation.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		usuarioRepository.deleteAll(); //Apaga todos os registros do banco de dados antes de iniciar os testes
	}
	
	@Test
	@Order(1)
	@DisplayName("Cadastrar Um Usuário")
	public void deveCriarUmUsuario() {
		
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(0L, 
				"David Lucas", "david123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg"));
		
		ResponseEntity<Usuario> corpoResposta = testRestTemplate
				.exchange("/usuarios/cadastrar", HttpMethod.POST, corpoRequisicao, Usuario.class);

		assertEquals(HttpStatus.CREATED, corpoResposta.getStatusCode());
		
		assertEquals(corpoRequisicao.getBody().getNome(), corpoResposta.getBody().getNome());
		
		assertEquals(corpoRequisicao.getBody().getUsuario(), corpoResposta.getBody().getUsuario());
		
	}
	
	@Test
	@Order(2)
	@DisplayName("Não deve permitir duplicação do Usuário")
	public void naoDeveDuplicaUsuario() {
		
		usuarioService.cadastrarUsuario(new Usuario(0L, 
				"João Lucas", "joãolukinhas123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg"));
		
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(0L, 
				"João Lucas", "joãolukinhas123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg"));
		
		ResponseEntity<Usuario> corpoResposta = testRestTemplate
				.exchange("/usuarios/cadastrar", HttpMethod.POST, corpoRequisicao, Usuario.class);
		
		assertEquals(HttpStatus.BAD_REQUEST, corpoResposta.getStatusCode());
		
	}
	
	@Test
	@Order(3)
	@DisplayName("Atualizar um usuário")
	public void deveAtualizarUmUsuario() {
		
		Optional<Usuario> usuarioCadastrado = usuarioService.cadastrarUsuario(new Usuario(0L,
				"David Mendes", "lucas123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg"));
		
		Usuario usuarioUpdate = new Usuario(usuarioCadastrado.get().getId(),
				"David Mendes", "lucas123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg");
		
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(usuarioUpdate);
		
		ResponseEntity<Usuario> corpoResposta = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, corpoRequisicao, Usuario.class);
		
		assertEquals(HttpStatus.OK, corpoResposta.getStatusCode());
		
		assertEquals(corpoRequisicao.getBody().getNome(), corpoResposta.getBody().getNome());
		
		assertEquals(corpoRequisicao.getBody().getUsuario(), corpoResposta.getBody().getUsuario());
	}
	
	@Test
	@Order(4)
	@DisplayName("Listar todos os Usuários")
	public void deveMostrarTodosUsuarios() {
		
		usuarioService.cadastrarUsuario(new Usuario(0L,
				"David Cerqueira", "cerqueira123@email.com", "123456789", "https://i.imgur.com/JR7kUFU.jpg"));
		
		usuarioService.cadastrarUsuario(new Usuario(0L,
				"Ricardo Marques", "ricardo_marques@email.com.br", "ricardo123", "https://i.imgur.com/JR7kUFU.jpg"));
		
		ResponseEntity<String> resposta = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/usuarios/all", HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@Order(5)
	@DisplayName("Listar um Usuário Específico")
	public void deveListarApenasUmUsuario() {
		
		Optional<Usuario> usuarioBusca = usuarioService.cadastrarUsuario(new Usuario( 0L,
				"Laura Santolia", "laura_santolia@email.com.br", "laura12345", "https://i.imgur.com/EcJG8kB.jpg"));
		
		ResponseEntity<String> resposta = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/usuarios/" + usuarioBusca.get().getId(), HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@Order(6)
	@DisplayName("Login do Usuário")
	public void deveAutenticarUsuario() {
		
		usuarioService.cadastrarUsuario(new Usuario(0L,
				"Marisa Souza", "marisa_souza@email.com.br", "13465278", "https://i.imgur.com/T12NIp9.jpg"));
		
		HttpEntity<UserLogin> corpoRequisicao = new HttpEntity<UserLogin>(new UserLogin(0L,
				"", "marisa_souza@email.com.br", "13465278", "", ""));
		
		ResponseEntity<UserLogin> corpoResposta = testRestTemplate
				.exchange("/usuarios/logar", HttpMethod.POST, corpoRequisicao, UserLogin.class);
		
		assertEquals(HttpStatus.OK, corpoResposta.getStatusCode());

	}
}
