Feature: Pesquisa

Scenario Outline: Realizar pesquisa com dado no campo de busca
 Given eu estou na pagina principal do SOC
 When eu digito <palavraOuFrase> no campo de busca
 And eu confirmo a transacao
 Then sistema exibe o resultado da busca
 And navegador será fechado

 Examples:
 | palavraOuFrase         |
 |                        |
 | red hot chilli peppers |
 | teste automatizado     |