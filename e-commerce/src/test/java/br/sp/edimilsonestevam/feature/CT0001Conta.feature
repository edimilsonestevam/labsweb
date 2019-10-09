# language: pt

@Conta
Funcionalidade: Criar uma conta no site Automation Pratice
  Eu quero criar uma conta para fazer compras

  @criarConta
  Esquema do Cenario: Criar uma conta
    Dado eu estou na pagina para criar uma conta no Automation Pratice <url>
    Quando eu informo o meu e-mail <email> 
    E eu informo title <formaTratamento>, first name <primeiroNome>, last name <sobrenome>, password <senha>, date of birth <dataNascimento>, opcao assinar <opcaoAssinatura>, company <empresa>, address <endereco>, city <cidade>, state <estado>, zip code <cep>, country <pais>, mobile phone <celular>, address alias <apelidoEndereco>
    Entao o sistema apresenta a pagina principal do site

    Exemplos: 
      | url                                                                                                | email                      | formaTratamento | primeiroNome | sobrenome | senha    | dataNascimento | opcaoAssinatura             | empresa          | endreco                     | cidade    | estado    | cep      | pais   | celular     | apelidoEndereco |
      | http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation | edimilsonestevam@gmail.com | Mr.             | Edimilson    | Estevam   | teste123 | 01042000       | sign up for our newsletter! | Owl Technologies | Av. Paulista, 171, 4º andar | São Paulo | São Paulo | 01311000 | Brasil | 13988443068 | Corporate       |