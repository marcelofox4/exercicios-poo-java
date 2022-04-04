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
