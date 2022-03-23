# POO - Lista de exercícios IFPB

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
