Feature: Create User

Scenario: Cadastrar um usuário no app ToDo
 Given eu quero cadastrar um usuario no app ToDo
 When eu clico em Register, informo nome, email, senha, confirmo a senha
 And eu clico no botao Sign up
 Then o sistema apresenta a pagina de principal do app ToDo