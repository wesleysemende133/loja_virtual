# Loja Virtual

## Visão geral

Loja Virtual é um pequeno projeto Java que demonstra um sistema de cadastro e persistência de produtos e usuários usando JDBC e um banco de dados relacional.

O código aplica conceitos de modelagem de domínio com value objects para `Nome`, `Email`, `Descricao` e `Preco`, além de uma abordagem de comportamento orientado a objetos em vez de getters/setters genéricos.

## Estrutura do projeto

- `pom.xml` - configuração do Maven e dependências.
- `src/main/java/Main.java` - ponto de entrada da aplicação.
- `src/main/java/model/Produtos.java` - modelo de domínio para produtos.
- `src/main/java/model/Usuarios.java` - modelo de domínio para usuários.
- `src/main/java/atributos/` - value objects do domínio:
  - `Nome.java`
  - `Email.java`
  - `Descricao.java`
  - `Preco.java`
- `src/main/java/dao/` - classes de acesso a dados:
  - `ProdutosDAO.java`
  - `UsuarioDAO.java`
- `src/main/java/db/Conexao.java` - gerenciamento de conexão com o banco de dados.

## Principais conceitos aplicados

- Value objects imutáveis para atributos de domínio.
- Validação de entrada no construtor de objetos do domínio.
- Exposição de comportamento e intenção de domínio através de métodos específicos (`nome()`, `descricao()`, `preco()`, `quantidade()`, `autenticar()`, etc.).
- Persistência via JDBC utilizando classes DAO.

## Como compilar e executar

1. Certifique-se de ter Java 17+ e Maven instalado.
2. No diretório do projeto, execute:

```bash
mvn clean compile
```

3. Para executar a aplicação:

```bash
mvn exec:java -Dexec.mainClass=Main
```

> Ajuste a configuração de banco de dados em `src/main/java/db/Conexao.java` antes de executar.

## Nota sobre o refactor recente

O código foi refatorado para reduzir o uso de getters e setters genéricos e adotar um modelo mais orientado a objetos, seguindo princípios de Object Calisthenics.

## Estrutura de commit

O commit criado inclui apenas:
- `README.md`
- `src/main/java/atributos/*.java`
- `src/main/java/model/*.java`
- `src/main/java/dao/*.java`
- `src/main/java/Main.java`
- `.gitignore` (atualizado para ignorar a pasta `target/`)
