(Due to technical issues, the search service is temporarily unavailable.)

Aqui está um exemplo de documentação `README.md` para o projeto **Streamly**, que é uma aplicação Java usando Spring Boot para consumir a API do OMDB (https://www.omdbapi.com/) e exibir informações sobre séries.

---

# Streamly

Streamly é uma aplicação Java desenvolvida com Spring Boot que consome a API do OMDB para buscar e exibir informações sobre séries de TV. O projeto foi criado para demonstrar o consumo de APIs RESTful e o uso do Spring Boot para construir aplicações web eficientes.

## Funcionalidades

- **Busca de séries**: Pesquise séries de TV pelo título.
- **Detalhes da série**: Exibe informações detalhadas sobre a série, como título, ano, gênero, elenco, avaliações e muito mais.
- **Integração com OMDB**: Consome a API do OMDB para obter dados em tempo real.
- **Interface simples**: Interface de linha de comando (CLI) ou web para interação com o usuário.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Framework**: Spring Boot
- **Bibliotecas**: Spring Web, Jackson (para manipulação de JSON)
- **Ferramentas**: Maven (gerenciamento de dependências), Git (controle de versão)
- **API Externa**: [OMDB API](https://www.omdbapi.com/)

## Pré-requisitos

- Java JDK 17 ou superior
- Maven instalado
- Chave de API do OMDB (obtenha uma chave gratuita em [OMDB API](https://www.omdbapi.com/apikey.aspx))

## Como Executar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

### 1. Clone o repositório

```bash
git clone https://github.com/brunoteixeira042/Streamly.git
cd Streamly
```

### 2. Configure a chave da API OMDB

Crie um arquivo `application.properties` na pasta `src/main/resources` e adicione a seguinte linha:

```properties
omdb.api.key=sua_chave_aqui
```

Substitua `sua_chave_aqui` pela sua chave de API do OMDB.

### 3. Compile e execute o projeto

Use o Maven para compilar e executar o projeto:

```bash
mvn clean install
mvn spring-boot:run
```

### 4. Acesse a aplicação

Se a aplicação estiver configurada como uma API REST, você pode acessar os endpoints via `http://localhost:8080`. Caso seja uma aplicação CLI, interaja diretamente no terminal.

---

## Estrutura do Projeto

```
Streamly/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── streamly/
│   │   │               ├── controller/      # Controladores da API
│   │   │               ├── service/         # Lógica de negócio e consumo da API OMDB
│   │   │               ├── model/           # Modelos de dados (DTOs)
│   │   │               └── StreamlyApplication.java # Classe principal
│   │   └── resources/
│   │       └── application.properties       # Configurações do projeto
│   └── test/                                # Testes unitários
├── pom.xml                                  # Configuração do Maven
└── README.md                                # Documentação do projeto
```

---

## Exemplo de Uso

### Buscar uma série por título

Faça uma requisição GET para o endpoint `/series` passando o título da série como parâmetro:

```bash
GET /series?title=Breaking+Bad
```

**Resposta:**

```json
{
  "title": "Breaking Bad",
  "year": "2008–2013",
  "genre": "Crime, Drama, Thriller",
  "actors": "Bryan Cranston, Aaron Paul, Anna Gunn",
  "plot": "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.",
  "imdbRating": "9.5",
  "poster": "https://m.media-amazon.com/images/M/MV5BZDNhNzhkNDctOTlmOS00NWNmLWEyODQtNWMxM2UzYmJiNGMyXkEyXkFqcGdeQXVyNTMxMjgxMzA@._V1_SX300.jpg"
}
```

---

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

---

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## Contato

- **Autor**: Bruno Teixeira
- **GitHub**: [brunoteixeira042](https://github.com/brunoteixeira042)
- **Email**: brunoteixeira042@example.com (substitua pelo email real, se disponível)

---

Este `README.md` é um modelo básico e pode ser expandido conforme necessário. Adicione screenshots, exemplos de código ou detalhes específicos do projeto para torná-lo mais completo.
