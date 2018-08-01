#language: pt

Funcionalidade: RealizarLogin
 
Cenario: Login com credenciais validas - Sucesso
	Dado Usuario esta na Pagina Principal <site>
	Quando Usuario navega até a Pagina de Login
	E Usuario informar e-mail <email> e clicar no botao Proximo
	E Usuario informar senha <senha> e clicar no botao Login	  
	Entao Usuario visualiza a Caixa de entrada de e-mail
	
	  | site                          | email                | senha       | 
      | https://outlook.live.com/owa/ | testeEEC@outlook.com | Teste123456 |