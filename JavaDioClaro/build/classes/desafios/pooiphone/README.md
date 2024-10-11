# DESAFIO POO

## Modelagem e Diagramação de um Componente iPhone

Neste desafio, modelamos e diagramos a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Resultado do Desafio

Como sujerido, foi utilizado a ferramenta __*[Mermaid](https://mermaid.js.org/)*__ para gerar
a imagem do diagrama.

```mermaid
classDiagram
    direction TB

    class ReprodutorMusical {
        <<interface>>
        +void selecionarMusica(String musica)
        +void tocar()
        +void pausar()
    }

    class AparelhoTelefonico {
        <<interface>>
        +void ligar()
        +void atender()
        +void iniciarCorreioDeVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Telefone {
        +void ligar()
        +void atender()
        +void iniciarCorreioDeVoz()
    }

    class Safari {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Ipod {
        +void selecionarMusica(String musica)
        +void tocar()
        +void pausar()
    }

    class Iphone {
        +void selecionarMusica(String musica)
        +void tocar()
        +void pausar()
        +void ligar()
        +void atender()
        +void iniciarCorreioDeVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    ReprodutorMusical <|.. Ipod
    ReprodutorMusical <|.. Iphone
    AparelhoTelefonico <|.. Telefone
    AparelhoTelefonico <|.. Iphone
    NavegadorInternet <|.. Safari
    NavegadorInternet <|.. Iphone
```