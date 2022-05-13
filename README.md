# GFT DIO bootcamp
### Este repositório contem todos os projetos criados no decorrer do bootcamp GFT.
> Para não criar repositórios diferentes deixei ambos os projetos em pacotes diferentes, 
> dentro desse repositório. Para escolher o projeto de execução basta trocar a função principal.
> Explicarie como fazer isso ainda nesse arquivo README.
 ****
    
## •Criando um Banco Digital com Java e Orientação a Objetos 🏦
    
   De forma simplificada esse projeto visa exercitar os pilares da Programação Orientada a Objetox ( POO ) utilizando JAVA , simulando uma interação com um banco virtual, por meio do console. Os principais aspectos do projeto eram : abstração, encapsulamento, herança e polimorfismo. Na interação o usuário registra sua conta no aplicativo e manipula seus dados básicos como saldo, verificar saldo e verificar dados pessoais, por exemplo.
  
### •Abstração 🤔
####    O conceito de abstração é muito útil para a tradução de entidades, ações ou processos do mundo real ou ideal para o mundo computacional e lógico. Entendendo a **complexidade** e as **características** do objeto de trabalho colabora para menor redundância e construção de projetos orientados a objeto, baseando seu comportamento em suas **ações** e como elas se relacionam com suas **características**.
####    A abstração também é utilizada para esconder detalhes complexos, de implementação por exemplo. Criando um código mais fácil de ser utilizado e atualizado, pois não é exigido dos desenvolvedores conhecimento total da estrutura e comportamento do sistema.

### •Encapsulamento 📦
####    Encapsulamento se trata de **isolar atributos** e métodos de classes que não são nessecários fora da classe que pertencem. O maior isolamento interno de comportamentos e características **evita modificações desnecessárias nos objetos e diminui as relações de dependências de processo**. Com dependecia de processo quero dizer que quando objetos encapsulados interagem entre sí eles não são afetados pela forma que recebem certo resultado, mas sim pelo resultado propriamente dito, portanto a manutenção de um código bem encapsulado é **menos custosa e mais eficiênte**.

### •Herança 👩‍👩‍👦
####    Classes são estruturas de **dados heterogeneos** que além de informações possuem **comportamentos** ( funções ), sendo portanto criadas para a melhor **modularização e organização**, proporcionando estabiliodade em códigos de larga escala. O conceito de herança visa a reutilização de código e aprimoramento de conceitos como abstração e polimorfismo. A partir da herança, **características comuns de uma certa categoria**, que posteriormente viria a se tornar um objeto, podem ser encapsuladas e passadas a diante para inúmeras classes sem a necessidade de reescrita de código, e caso alguma mudança seja necessária na base operacional dessa categoria ( ou seja, na classe que é herdada por todas as demais ) por exemplo, a manutenção e aprimoramento do algoritimo são feitos em apenas um lugar. Dessa forma a herança proporciona grande escalabildiade.

### •Polimorfismo 🦋
####    Polimorfismo consiste na abstração ideal de tipos, métodos e classes. A partir do polimofrismo podemos criar classes genéricas, métodos com mesma assinatura, porém diferentes parametros, que exercem implementações, não necessáriamente, diferentes e podem ou não ter resultados diferentes. Podendo criar em superclasses, por exemplo, métodos que posteriormente venham a ser específicados em subclasses 
> O polimorfismo é um assunto complexo e de grande extenção,
> de forma superficial podemos definilo assim, porém eu
> recomendaria formente uma leitura sobre o assunto!

****

## Explorando Padrões de Projetos na Prática com Java

[[ ...descrição aqui ... ]]

### Singleton 👤
####    Singleton é um termo matemático, que significa conjunto único. Em suma é um design pattern que visa limitar a quantidade de instâncias de um certo objeto á 1, fazendo assim com que mesmo que esse objeto seja requerido em outros, ao invés de uma nova instância ser criada, utiliza-se apenas uma referência, por exemplo. Garantindo que objetos vitais, e exclusivos, existam de maneira singular e comuniquem-se com demais objetos, caso necessário

### Strategy 📚
####    O encapsulamento de métodos em um línguagem orientada a objetos se da por classes e interfaces, mas muitas pode-se desejar criar comportamentos, algorítimos específicos para resolção de certos problemas, de formas diferentes. Utilizar uma interface é de fato muito atraente nesses casos, porém, quando se precisa de maiores especificações e modularização, ou reutilização da interface em grande escala, em um certo padrão, as coisas podem ficar repetitivas e confusas. O design pattern Strategy funciona encapsulando comportamentos, métodos, em classes, e criando instâncias dessas classes no objeto de uso, que agora, ao invés de ter uma interface, tem diversos padrões comportamentais instânciados e pode trocar de acordo com necessário entre cada um. Criando um código mais sustentável e reutilizável.

### Facade 🏬
####    Quando consumimos uma API web, por exemplo, não sabemos toda a complexidade por trás, apenas como acessa-la e seu resultado, que satisfaz idealmente nossa requisição. O design pattern facade é muito similar ao exemplo de funcionamento de uma API, porém existe para abstrair diferentes camadas de um sistema, simplificando classes e a comunicação entre elas, por meio de classes intermediárias, por exemplo, criando assim um nível de abstração maior. Da mesma forma que APIs abstraem sua complexidade, interfaces abstraem sua funcionalidade, designs facade abstraem a comunicação entre diferentes setores de um sistema.
> Padrões de design são um assunto muito mais extenso e discutivel,
> espero ter sido capaz de explicar de forma simples e coerente o conceito básico de cada um,
> caso se interesse, recomendo uma leitura sobre o assunto!

 ****
 ****

###### Matheus Maues Sarto - 13/05/2022
