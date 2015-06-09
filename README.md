# JjQuery

## Authors

**Group name:** G51

**Project:** JjQuery

**Group members:**
- [Henrique Ferrolho](https://github.com/ferrolho)
- [João Pereira](https://github.com/jfpereira)
- [Rafaela Faria](https://github.com/rafikii)


## Build instructions

The project was developed using *Eclipse Luna*, with the *ANTLR v4* plugin.  
In order to install the plugin go to **Help > Eclipse Marketplace...**, search for `antlr` and install the plugin.

![image](readme-res/eclipse-plugin.png)

In order to recompile the project one must first import it by going to **File > Import...**, and then browse and select the **compiler** project folder and/or the **grammar** project folder.

The first folder contains the main project.  
The second contains the *JjQueryLexer.g4* and *JjQueryParser.g4*, which are the source files responsible of generating the project grammar.


## Examples

#### Example 1
para cada exemplo, devem indicar o que o exemplo pretende demonstrar e o resultado esperado

#### Example 2


## How to use

The program can be run through the Terminal using the following command:

`java -jar G51.jar examples/Example1.java Main.java`

The command above will translate the **Example1.java** inside the **examples** folder and output the resultant translation to **Main.java**.

If the program is run without any CLI arguments, the output will be the following:
```
$ java -jar G51.jar
Error: Usage: Main.jar <input file> <output file>
Errors: 1	Warnings: 0
```
 
 
## Lexical analysis
 
indicar em que ficheiro(s) está especificado o analisador lexical; indicar o que acontece quando o ficheiro de entrada contém erros lexicais


## Syntactic analysis

indicar em que ficheiro(s) está especificado o analisador sintático; descrever como lidam com erros sintáticos, qual a estratégia de recuperação (se existir), e como informam o utilizador dos erros detetados


## Semantic analysis

indicar em que ficheiro(s) está especificado o analisador semântico; descrever todas as validações semânticas implementadas (e possíveis construções e consultas de tabelas de símbolos); descrever como lidam com erros semânticos


## Intermediate representation

descrever a(s) representações intermédias utilizadas, e quais as transformações realizadas


## Final code generation

Descrever como é feita a geração de código final; identificar potenciais problemas relacionados com a geração de código


## Tests

descrever a infraestrutura de testes e a bateria de testes utilizados para testar a ferramenta desenvolvida (quantidade de testes, automação dos mesmos, etc.)


## Architecture

descrever a arquitetura geral da plataforma, principais algoritmos utilizados, e outros pontos que considerem relevantes para a avaliação. No caso particular dos trabalhos #1 (JjQuery) e #5 (JTM), devem documentar bem a linguagem de entrada


## The good

descrever os principais aspetos positivos relativos à ferramenta implementada; descrever todas as otimizações realizadas, e os 'extras' implementados


## The bad

descrever os principais aspetos negativos relativos à ferramenta implementada (bugs conhecidos, pontos de implementação incompleta e melhorias identificadas para potencial trabalho futuro)
