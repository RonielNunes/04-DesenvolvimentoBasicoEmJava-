# **_Desenvolvimento básico em Java_**
# **_Preparando o ambiente para programar em Java_**

### Leia as sentenças e assinale a alternativa correta. I – Gradle é um sistema da linguagem Java para automação de builds. II – Maven é uma ferramenta de integração de projetos. III – Além de ser responsável por gerenciar dependências, a Maven não gera relatórios de produtividade mas mantém da qualidade do código.

I e II estão corretas.


### Em relação a ferramenta IntelliJ para desenvolvimento em Java, assinale a alternativa errada.

Nenhuma está errada.


### Pode ser necessário relacionar a instalação do Java no Path do do sistema operacional, qual das seguintes opções abaixo relacionam-se com essa funcionalidade?

JAVA_HOME

### ______ é uma forma de estabelecer controle de versões das ferramentas entre todos os membros da equipe.

Wrapper

### Observe as seguintes opções que foram usadas para instalação do pacote Java 10:

I - sudo apt update
II - unzip -d /opt/maven apache-maven-3-5.3-bin.zip
III - sudo apt install oracle-java10-installer
IV - sudo add-apt-repositoty ppa:linuxprising/java
V - java -version

A ordem correta ensinada durante a aula foi:

IV, I, III, V.

### Em qual dessas versões não é possível instalar o Java 10?

O Java 10 pode ser instalado em todas essas versões.

### Durante a aula, para instalação das ferramentas Gradle e Maven, foi necessário, antes de iniciar a instalação, criar a pasta na qual alocaria os arquivos de cada ferramenta. O comando utilizado durante a aula foi:

mkdir

### Durante a aula o professor executou diversos comandos para instalação inicial do Java. Tais comandos, no Linux, foram executados no aplicativo chamado:

Terminal

### Qual dessas ferramentas é padrão para o desenvolvimento em Java?

Gradle Build Tool.

### Qual a principal diferença entre Gradle e Maven?

Sintaxe.

# **O que precisamos saber sobre Java**

### O que é Java EE?
Enterprise Edition, distribuição Enterprise da plataforma com um conjunto de especificações e referências da plataforma.


### O que é Java SE?
Standard Edition, distribuição mínima da plataforma Java.


### O que é a JRE?
Um ambiente de execução.


### O que é Jakarta EE?
Nova fase e evolução das especificações Java.


### Quem foi um dos principais criadores do Java na Sun Microsystems?
James Gosling.


### O que é uma JVM?
Uma máquina virtual para programas em Java.


### O que é um bytecode?
Um código que é interpretado pela JVM.

### Em que ano o Java foi criado?
1995.


### Qual é o compilador do Java?
javac.


### Quais componentes compõe a JDK?
JRE, compilador e Java .

# **_Características da linguagem_**

### O modificador de acesso Public significa:
Que o acesso é feito por qualquer um.

### O que significa ter uma Tipagem Forte e Estática?

Tipagem forte pois não pode ter o tipo alterado e Estático pois o tipo é verificado em tempo de compilação.

### Quais dos tipos abaixo são wrappers de primitivos?
Integer, Character, Long e Boolean.

### Quais estruturas compõem uma Classe?
Classe, Atributos, Construtores e Métodos.

### Qual o principal método que é executado por programas Java?

public static void main(String[] args)


### Quais das afirmações é verdadeira em relação do modificador Abstract?

Pode ser utilizado apenas em classes e métodos.


### A palavra reservada Var significa:

Que o tipo será inferido automaticamente de forma implícita.

### Sobre Enums, qual é a verdadeira afirmação?

Por convenção, por serem objetos constantes e imutáveis (static final), os nomes são em MAIÚSCULO;


### Quais das afirmações é verdadeira em relação a Interfaces?

Funcionam como contratos de métodos abstratos.

### Quais dos tipos abaixo são primitivos?
int, long, double e float.

# **_Características da linguagem II_**

## **Qual a importância do uso de ferramentas para automatizar a validação de código?
**

Ajuda a prevenir erros comuns no código.

### Qual das expressões abaixo representam um IF Ternário, dado uma variável condicao?

condicao ? “é verdade” : “é mentira”


### Qual a forma padrão concatenar strings no java?
Usando o operador +

### Quais dos métodos abaixo da classe String NÃO foram apresentados na aula?

.set()

### Para fazer formatação, usamos qual método estático?

String.format()

### Qual das operações abaixo é uma operação de diferença?
if (variavel != 10) { …}

### São ferramentas de análise de qualidade de código:
PMD e Checkstyle.


### Qual é a principal diferença entre While e Do/While?
O While sempre verifica a condição antes de iniciar um ciclo.

### Operadores lógicos Non Short Circuit ( & e | ) tem a característica de:

verificar todas as condições.

### O FOR  é usado para?

Construir laçoes de repetição nos programas.

# **_Debug de código_**

### Qual das seguintes afirmações é a verdadeira?
É possível avançar a execução da depuração linha a linha.

### Para avaliar os valores de variáveis e objetos durante o Debug, eu preciso:
Adicionar um breakpoint e navegar na aba Debug e procurar na sessão Variables.

### Para interromper o Debug e fazer com que a execução prossiga até o final ou próximo breakpoint.
Deve usar a opção “Resume program” com o ícone verde de “Play”.

### Para fazer Debug no IntelliJ, é preciso:
Vem por padrão em todas as versões.

### Para validar e inspecionar um determinado trecho de código e seu retorno:
Selecionar o trecho e clicar no ícone “Evaluate Expression” na aba de Debug.

### Para indicar que o programa deve parar durante o Debug, usamos?
Breakpoints.

### Para executar o programa em modo de Debug.
Rodar o programa com a opção “Debug as”.

### O nome Debug significa:
Depurar
### Qual a principal funcionalidade das ferramentas de Debug?
Depurar a execução linha a linha do programa.

### O uso de Debug é altamente recomendado para:
Entender o comportamento durante a execução do programa.

# **_Orientação a Objetos com Java_**

### **Qual o nome do processo de construir coisas com base em uma Classe?**

Instanciar um objeto.


### Em um cenário onde eu tenho duas classes: Motocicleta e Carro; e ambas herdam da Classe Veículo, mas o atributo Quantidade de portas está definido apenas em Carro, podemos afirmar que…

O atributo Quantidade de Portas está acessível apenas no escopo de Carro.


### Para que serve um Construtor em uma Classe?
Definir um contrato para instanciar um objeto.


### Dentro de uma classe podemos definir características e comportamentos que essa Classe pode ter. Nesse caso estamos falando, respectivamente, de quais conceitos?

Atributos e Métodos.


### Por que algumas pessoas defendem que o uso de composição é melhor que o uso de herança?

Porque a subclasse necessita conhecer, em muitos casos, a implementação da superclasse, o que cria um acoplamento e a quebra da premissa básica do encapsulamento.


### Quando começamos a falar sobre Orientação a Objetos, fizemos a analogia da planta e da casa. Quando falamos da planta, entendemos que esse é um modelo que utilizaremos para construir coisas concretas.  Nessa analogia, a Planta seria?
Classe.

### Digamos que temos uma Classe Casa e nela temos um atributo privado chamado endereco. Não temos construtores definidos e nem métodos. O que acontece se tentarmos atribuir um valor a esse atributo de um objeto instanciado dessa classe?

Não será possível atribuir, pois ele está com escopo privado e só seria possível por meio de um construtor com parâmetros ou por meio de um método de acesso.

### O que acontece em um Classe Java quando não definimos construtor algum?

Você terá de forma implícita um construtor padrão, ou seja, sem parâmetros.


### Qual dessas maneiras é a maneira correta de instanciar um objeto?
Casa casa = new Casa();


### Para que serve o método equals()?

Para comparar dois objetos e dizer se eles são iguais.

# **_Aprenda sobre S.O.L.I.D. com Java_**


### Que autor promoveu o SOLID?
Robert Martins.


### Uma classe com diversos métodos e processos, provavelmente está violando qual dos princípios SOLID?

Single Responsibility Principle.

### É melhor criar interfaces mais específicas ao invés de termos uma única interface genérica. Esta frase sintetiza qual princípio?
Interface Segregation Principle.


### Classes derivadas devem ser substituíveis por suas classes base. Esta frase sintetiza qual princípio?
Liskov Substitution Principle.

### Dependa de abstrações e não de implementações.Esta frase sintetiza qual princípio?

Dependency Inversion Principle.
### Uma classe deve ter um, e somente um, motivo para mudar.
Esta frase sintetiza qual princípio?
Single Responsibility Principle.

### SOLID é um acrônimo para:

Princípios da Programação Orientada a Objetos.

### Você deve poder estender um comportamento de classe, sem modificá-lo. Esta frase sintetiza qual princípio?
Open Closed Principle.

### Os princípios do SOLID visam código:
Alta coesão.

### Qual das seguintes opções não faz parte do SOLID?
Dependency Interface Principle.

# **_Trabalhando com Datas_**

### O que acontece quando se trabalha com o método add() da classe Calendar da maneira a seguir: agora.add(Calendar.MONTH, -1)
Diminuo 1 mês da minha data corrente.


### Qual dessas classes vai retornar apenas informações referentes ao dia e não a hora?
LocalDate.

### Em que versão da JDK as classes LocalDate, LocalDateTime e LocalTime foram incorporadas?
1.8

### Como se obtém a data atual com a classe Calendar?
Calendar.getInstance()

### O que é o epoch?
É uma padrão utilizado para data com referência ao dia 1/1/1970 ao 0h.

### Qual desses construtores da classe Date não está como @Deprecated desde a versão 1.1 da JDK?
Date()

### Quais as classes me auxiliam a converter o padrão de data a ser exibido?
DateFormat e SimpleDateFormat

### Para que serve o construtor Date(long d)?
Para instanciar o momento de acordo com parâmetro passado.


### Quando eu utilizo um construtor da classe Date sem parâmetros, o que acontece?
Ele retorna a data atual com o milissegundo mais próximo do momento em que foi executado.

### Qual o formato padrão de retorno da LocalDate?
yyyy-MM-dd

# **_Trabalhando com Arrays_**

### Para que serve a propriedade length?
Descobrir quantos elementos um array possui.


### Qual declaração de array, não é uma declaração de um array multidimensional?
int[] meuArray = {12,32,54};

### O que utilizamos para percorrer um array?
Um laço de repetição.

### Utilizando o "for" para percorrer um array, qual exemplo irá estourar erro?
int[] meuArray = {12,32,54,6,8,89,64}; for (int i=0; i<meuArray.length; j++){ System.out.println(novoArray[i]); }

### O que é um array?
Uma estrutura de dados que nos permite organizar valores na memória.

### Por padrão, o índice de um array inicia-se em:
0.

### Qual dos operadores abaixo pode ser utilizado na declaração de um array?
new.

### O que são arrays multidimensionais?
São estruturas de dados que possuem duas ou mais dimensões.

### Qual declaração de array está incorreta?
inteiro numeroArray;

### Como são chamados os itens de um array?
Elementos.

# **_Tratamento de Exceções_**
 
### O que são checked Exceptions?
São erros esperados em um fluxo da aplicação.
### Por que o try catch pode ser chamado de bloco "protegido"?
Porque é comumente utilizado para capturar erros.

### O bloco finally sempre é executado dentro do fluxo de um método?
Sim.

### Throw pode lançar uma exceção de negocio?
Sim.

### Erros de memoria são capturadas por exceptions?
Sim, sempre.

### Por que exceptions são exceções explicitas?
Porque necessitam de tratamento para que não afete o fluxo de um sistema.

### O bloco finally sempre deve ser usado ao se usar um try/catch?
Sim, como boa prática de programação recomenda-se incluir finally sempre.

### Dentre os usos do bloco finally, ele é mais comumente utilizado para:
Liberar recursos.

### O que são exceções?
Uma ocorrência anormal gerada no fluxo encadeado em um sistema.

### Para uma exceção inesperada é correto afirmar:
Podem ocorrer, mas sua aplicação tem que estar preparada pra isso.

