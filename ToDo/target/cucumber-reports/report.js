$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US#0CreateUser_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Create User",
  "description": "",
  "id": "create-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Cadastrar um usuário no app ToDo",
  "description": "",
  "id": "create-user;cadastrar-um-usuário-no-app-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "eu quero cadastrar um usuario no app ToDo",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "eu clico em Register, informo nome, email, senha, confirmo a senha",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "eu clico no botao Sign up",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "o sistema apresenta a pagina de principal do app ToDo",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.eu_quero_cadastrar_um_usuario_no_app_ToDo()"
});
formatter.result({
  "duration": 12129946231,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_clico_em_Register_informo_nome_email_senha_confirmo_a_senha()"
});
formatter.result({
  "duration": 2738829493,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_clico_no_botao_Sign_up()"
});
formatter.result({
  "duration": 4434232203,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.o_sistema_apresenta_a_pagina_de_principal_do_app_ToDo()"
});
formatter.result({
  "duration": 41174858,
  "status": "passed"
});
formatter.uri("US#1CreateTask_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Create Task",
  "description": "",
  "id": "create-task",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Cadastrar uma tarefa no app ToDo",
  "description": "",
  "id": "create-task;cadastrar-uma-tarefa-no-app-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "eu sou um usuario do app ToDo",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "eu cadastro uma tarefa",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "eu vejo a minha tarefa na lista de tarefas",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.eu_sou_um_usuario_do_app_ToDo()"
});
formatter.result({
  "duration": 45624158,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_cadastro_uma_tarefa()"
});
formatter.result({
  "duration": 12863243100,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_vejo_a_minha_tarefa_na_lista_de_tarefas()"
});
formatter.result({
  "duration": 35280576,
  "status": "passed"
});
formatter.uri("US#2CreateSubTask_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Create Subtask",
  "description": "",
  "id": "create-subtask",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Cadastrar uma subtarefa no app ToDo",
  "description": "",
  "id": "create-subtask;cadastrar-uma-subtarefa-no-app-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "eu sou um usuario do app ToDo",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "eu cadastro uma subtarefa",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "eu vejo a subtarefa na lista de subtarefas",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.eu_sou_um_usuario_do_app_ToDo()"
});
formatter.result({
  "duration": 52355630,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_cadastro_uma_subtarefa()"
});
formatter.result({
  "duration": 1074491641,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_vejo_a_subtarefa_na_lista_de_subtarefas()"
});
formatter.result({
  "duration": 3151952736,
  "status": "passed"
});
});