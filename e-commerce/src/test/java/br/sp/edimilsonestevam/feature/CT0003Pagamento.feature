#language: pt

@Pagamento
Funcionalidade: Realizar pagamento de um produto
  Eu quero pagar um produto

  @realizarPagamento
  Esquema do Cenario: Pagamento de produto
    Dado eu estou comprando no Automation Pratice <url>
    E eu tenho um produto no carrinho de compras
    Quando eu escolho a forma de pagamento
 		Entao o sistema apresenta uma ordem de pagamento
 		
    Exemplos: 
      | url                                                      | 
      | http://automationpractice.com/index.php?controller=order | 