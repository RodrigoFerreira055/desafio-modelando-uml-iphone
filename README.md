#Desafio Diagramação de Classes UML iPhone

##Desafio do bootcamp Claro Java com Spring Boot da DIO

##Consiste em desenvolver o diagrama de classes do iphone e posteriormente implementar em código utilizando Programação Orientada a Objetos em Java

###abaixo a UML proposta


classDiagram
    
    
    class Music{
      
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class Phone{
      
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()

    }
    class Internet{
      
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

     class iPhone {
    }

    iPhone --> Music
    iPhone --> Phone
    iPhone --> Internet
