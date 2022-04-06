# Exercícios de POO Resolvidos em Java

Exercitar e treinar o paradigma de Programação Orientada a Objetos.

1 - Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para calcular a idade do jogador e outro para mostrar quanto tempo falta para o jogador se aposentar. Para isso considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.

2 - Considere a classe ContaBancaria apresentada em sala de aula (Não sei que classe foi essa, mas me virei com uma que fiz). Crie uma classe ContaImposto que herda de conta e possui um atributo percentualImposto. Esta classe também deve possuir um método calcularImposto() que subtrai do saldo, o valor do próprio saldo multiplicado pelo percentual do imposto. Crie um programa para criar as instâncias de ContaImposto e utilizar todos os métodos da classe (ex: sacar, depositar, calcularImposto).

3 - Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor(). Crie uma classe IngressoVip, que herda de ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e IngressoVip, mostrando a diferença de preços.

4 - Crie uma classe Elevador para armazenar as informações de um elevador de prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe também deve disponibilizar os seguintes métodos:

- **Inicializar**: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazios);
- **Entrar**: para acrescentar uma pessoa no elevador (só deve acrescentar se houver espaço);
- **Sair**: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
- **Subir**: para subir um andar (não deve subir se já estiver no último andar);
- **Descer**: para descer um andar (não deve descer se já estiver no térreo);
- Obs: Encapsular todos os atributos da classe (criar métodos sets e gets).

5 - Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

6 - Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

- void armazenaPessoa(String nome, int idade, float altura);
- void removePessoa(String nome);
- int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
- void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
- void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

7 - Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:

- aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;

- aumentar e diminuir o número do canal em uma unidade

- trocar para um canal indicado;
- consultar o valor do volume de som e o canal selecionado.

8 - Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:

- media(): calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2);
- final(): calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

9 - Crie uma classe em Java chamada Data que inclui três informações como variáveis
de instância:
mês (int),
dia (int)
e ano (int).
A classe deve ter métodos get e set para cada variável e um construtor que inicializa as variáveis e
assume que os valores fornecidos são corretos. Forneça um método displayData que exibe o dia, o
mês e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste
que demonstra as capacidades da classe Data.

10 - Crie uma classe calculadora. Esta classe deve ser abstrata e implementar as operações básicas (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que implementa os seguintes cálculos: raiz quadrada e a potência. Dica utilize a classe Math do pacote java.lang.

11 - Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:

- **construtor**: define a data que determinado objeto (através de parâmetro), este método verifica se a
  data está correta, caso não esteja a data é configurada como 01/01/0001;
- **compara**: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
  retorne: 
  - 0 se as datas forem iguais;
  - 1 se a data corrente for maior que a do parâmetro;
  - 1 se a data do parâmetro for maior que a corrente.
- **getDia**: retorna o dia da data;
- **getMes**: retorna o mês da data;
- **getMesExtenso**: retorna o mês da data corrente por extenso;
- **getAno**: retorna o ano da data;
- **isBissexto**: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário;
- **clone**: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os mesmos valores de atributos e retorna sua referência pelo método.

12 - Escreva uma classe em que cada objeto representa um vôo que acontece em determinada data e em
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a ocupação das vagas. A classe deve ter os seguintes métodos:

- **construtor**: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para armazenar a data utilize um objeto da classe Data, criada na questão anterior);
- **proximoLivre**: retorna o número da próxima cadeira livre;
- **verifica**: verifica se o número da cadeira recebido como parâmetro está ocupada;
- **ocupa**: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso contrário;
- **vagas**: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo;
- **getVoo**: retorna o número do vôo;
- **getData**: retorna a data do vôo (na forma de objeto);
- **clone**: o objeto clona a si próprio, para isto, ele cria um novo objeto da mesma classe e faz uma cópia dos valores de seus atributos.

13 - Considere a seguinte classe, cujo método respostaQuestao recebe como parâmetro o número de uma
questão e retorna a sua resposta correta, proveniente de um gabarito.

Escreva uma classe classe Prova em que cada objeto representa uma prova feita por um aluno. Esta
prova possui 15 questões de múltipla escolha (letras A a E). As 10 primeiras questões valem 0,5 ponto e as
5 últimas questões valem 1 ponto. Esta classe deverá controlar as questões respondidas pelo aluno. Para
isto, a classe deve implementar os métodos:

- **construtor**: recebe como parâmetro um objeto da classe Gabarito contendo o gabarito da prova;
- **respostaAluno**: recebe como parâmetro a resposta dada pelo aluno a uma questão; este método não recebe entre os parâmetros o número da questão, ele mesmo deve estabelecer um controle interno de modo que as questões sejam inseridas sequencialmente, ou seja, a primeira vez que o método é chamado, insere a primeira questão, a segunda, insere a segunda questão, e assim por diante;
- **acertos**: retorna a quantidade de questões que o aluno acertou;
- **nota**: retorna a nota que o aluno tirou na prova;
- **maior**: recebe como parâmetro um outro objeto da classe Prova e retorna a nota do aluno que acertou mais questões; se houver empate, retorna a maior nota; se houver empate novamente, retorna a nota do aluno representado no objeto corrente.
