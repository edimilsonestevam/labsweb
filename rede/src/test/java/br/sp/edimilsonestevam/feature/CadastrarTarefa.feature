Feature: CadastrarTarefa

Scenario: Realizar cadastro de uma tarefa com sucesso
Given eu estou logado na aplicacao e quero cadastrar uma tarefa
When eu informo nome da tarefa <nomeTarefa>, descricao da tarefa <descricaoTarefa>, data de criacao da tarefa <dtCriacaoTarefa>, codigo do usuario logado <cdUsuarioLogado> e clico no botao Salvar
Then o sistema salva a minha tarefa e redireciona para a tela Principal <telaPrincipal>

| nomeTarefa | descricaoTarefa | dtCriacaoTarefa | codigoUsuarioLogado |
| Tarefa1    | Descricao1      | 30072018        | cdUsuarioLogado     |