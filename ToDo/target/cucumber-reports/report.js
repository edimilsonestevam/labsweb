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
  "duration": 14292942297,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_clico_em_Register_informo_nome_email_senha_confirmo_a_senha()"
});
formatter.result({
  "duration": 4831548659,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_clico_no_botao_Sign_up()"
});
formatter.result({
  "duration": 3860817827,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.o_sistema_apresenta_a_pagina_de_principal_do_app_ToDo()"
});
formatter.result({
  "duration": 121411255,
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
  "duration": 154942522,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_cadastro_uma_tarefa()"
});
formatter.result({
  "duration": 4185412062,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_vejo_a_minha_tarefa_na_lista_de_tarefas()"
});
formatter.result({
  "duration": 145214025,
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
  "duration": 116090628,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.eu_cadastro_uma_subtarefa()"
});
formatter.result({
  "duration": 3282019848,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton class\u003d\"btn btn-primary\" href\u003d\"#\" id\u003d\"add-subtask\" ng-click\u003d\"saveSubTask()\"\u003e...\u003c/button\u003e is not clickable at point (406, 426). Other element would receive the click: \u003cbutton class\u003d\"btn btn-primary\" href\u003d\"#\" id\u003d\"add-subtask\" ng-click\u003d\"saveSubTask()\"\u003e...\u003c/button\u003e\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615355 (d5698f682d8b2742017df6c81e0bd8e6a3063189),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EEC.local\u0027, ip: \u0027192.168.15.3\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_172\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615355 (d5698f682d8b27..., userDataDir: /var/folders/cl/2d2zf6mx4ll...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50954}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 1b0b7a37fce7d0a07328a6358be15a2c\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat br.sp.edimilsonestevam.page.Subtarefa.clicarAddNoModalDaSubtarefa(Subtarefa.java:67)\n\tat br.sp.edimilsonestevam.stepDefinition.Test_Steps.eu_cadastro_uma_subtarefa(Test_Steps.java:77)\n\tat ✽.When eu cadastro uma subtarefa(US#2CreateSubTask_Test.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Test_Steps.eu_vejo_a_subtarefa_na_lista_de_subtarefas()"
});
formatter.result({
  "status": "skipped"
});
});