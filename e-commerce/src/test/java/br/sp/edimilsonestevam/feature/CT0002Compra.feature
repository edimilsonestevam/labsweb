#language: pt

@Compra
Funcionalidade: Realizar compra de um produto
  Eu quero comprar um produto

  @realizarCompraProduto
  Esquema do Cenario: Compra de produto
    Dado eu estou logado no Automation Pratice <url>
    Quando eu acesso Summer Dresses
    E eu adiciono o primeiro produto da lista
 		Entao o sistema apresenta o produto escolhido para checkout

    Exemplos: 
      | url                                                           | 
      | http://automationpractice.com/index.php?controller=my-account | 