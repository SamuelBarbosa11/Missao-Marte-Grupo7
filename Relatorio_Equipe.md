# Relatório — Missão Marte Unifor

### Disciplina: Projeto e Arquitetura de Sistemas — UNIFOR
### Grupo 07
### Repositório: https://github.com/SamuelBarbosa11/Missao-Marte-Grupo7

---

## 1. Tabela de Contribuições

| Integrante | Matrícula | Usuário Git | Exercícios e funcionalidades |
| --- | --- | --- | --- |
| Samuel Miguel Barbosa | 2517428 | SamuelBarbosa11 | Nível 1 e Nível 2: ajuste da capacidade da nave, subclasse Astronauta, customização de símbolos do mapa, pontuação polimórfica, sistema de vidas e mapa configurável. |
| João Gabriel Rinaldi | 2510365 | JgRM0 | Nível 3: inimigos dinâmicos, enum Dificuldade, persistência expandida do ranking com data/hora, passageiros resgatados e nível; além de ajustes de limite do mapa e compatibilidade com JDK 17. |
| Rafael Dantas | 2517979 | r-dantas9 | Nível 4: plataforma de pouso em (0,0), menu principal e reset do ranking. |

---

## 2. Objetivos e Implementações do Projeto

A equipe estendeu a base do jogo console “Missão Marte Unifor” para atender aos requisitos dos Níveis 1 a 4 do roteiro da disciplina, aplicando conceitos de herança, polimorfismo, encapsulamento e persistência em JSON.

As principais implementações foram:

- Nível 1: ajuste da capacidade da nave, criação da subclasse Astronauta e customização visual do mapa.
- Nível 2: pontuação polimórfica por tipo de passageiro, sistema de vidas da nave e configuração dinâmica do tamanho do mapa.
- Nível 3: inimigos com movimentação automática, menu de dificuldades com enum, e expansão do ranking para registrar data/hora, passageiros resgatados e nível da partida.
- Nível 4: plataforma de pouso na coordenada (0,0), menu interativo e opção de reset do ranking.

---

## 3. Evidências de Execução

> As imagens abaixo foram obtidas em execução do jogo pela linha de comando, conforme recomendado no projeto, usando run start na raiz do repositório para manter a correta renderização dos símbolos no terminal.

## **Nível 1: Refatoração e Tipos (Exercícios 1 a 3)**

### • Ajuste de Capacidade:

![Menu de dificuldade](prints/nivel_1/ajuste-de-capacidade.png)

### • Nova Subclasse de Passageiro (Astronauta):

![Nova Subclasse de Passageiro (Astronauta)](<prints/nivel_1/nova-subclasse-de-passageiro-(Astronauta).png>)

### • Customização Visual:

![Customização Visual](prints/nivel_1/customização-visual.png)

## **Nível 2: Mecânicas de Jogo e POO (Exercícios 4 a 6)**

### • Pontuação Polimórfica:

Passageiro.java

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-passageiro.png)

Professor.java

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-professor.png)

Engenheiro.java

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-engenheiro.png)

Astronauta.java

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-astronauta.png)

**Antes** de pegar o engenheiro:

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-pre-get-engenheiro.png)

**Depois** de pegar o engenheiro:

![Pontuação Polimórfica](prints/pontuacao_polimorfica/pontuação-polimórfica-get-engenheiro.png)

### • Sistema de Vidas na Nave:

O jogo começa com a nave tendo 3 vidas

**Antes** da colisão:

![Sistema de Vidas na Nave](prints/sistema_de_vidas/sistema-de-vidas-na-nave-pre-colisão.png)

**Depois** da colisão:

![Sistema de Vidas na Nave](prints/sistema_de_vidas/sistema-de-vidas-na-nave-pos-colisão.png)

Exemplo de **Morte**:

![Sistema de Vidas na Nave](prints/sistema_de_vidas/sistema-de-vidas-na-nave-morte.png)

### • Mapa Configurável:

configuração pré-jogo

![Mapa Configurável](prints/mapa_configuravel/mapa-configurável-config.png)

resultado:

![Mapa Configurável](prints/mapa_configuravel/mapa-configurável-result.png)

## **Nível 3: Comportamentos Avançados e Persistência (Exercícios 7 a 9)**

### • Inimigos Dinâmicos com IA Simples:

Inicio:

![Inimigos Dinâmicos com IA Simples](prints/inimigos_dinamicos/inimigos-dinâmicos-com-IA-simples-inicio.png)

Turno 1:

![Inimigos Dinâmicos com IA Simples](prints/inimigos_dinamicos/inimigos-dinâmicos-com-IA-simples-turno-1.png)

Turno 3:

![Inimigos Dinâmicos com IA Simples](prints/inimigos_dinamicos/inimigos-dinâmicos-com-IA-simples-turno-3.png)

### • Menu de Dificuldades (Enum):

Configuração pré jogo:

![Menu de Dificuldades (Enum)](prints/menu_de_dificuldades/menu-de-dificuldades-config.png)

Resultado:

![Menu de Dificuldades (Enum)](prints/menu_de_dificuldades/menu-de-dificuldades-result.png)

### • Persistência Expandida:

Ranking agora salva data/hora, passageiros resgatados e nível de dificuldade:

![Persistência Expandida](prints/ranking-expandido.png)

## **Nível 4: Desafio Final (Exercício 10)**

### • Plataforma de Pouso (0, 0):

![Plataforma de Pouso (0, 0)](prints/plataforma-de-pouso.png)

### • Menu Principal e Reset:

- Opção 1:

![Menu Principal e Reset](prints/menu_interativo/menu-1.png)

- Opção 2:

![Menu Principal e Reset](prints/menu_interativo/menu-2.png)

- Opção 3:

![Menu Principal e Reset](prints/menu_interativo/menu-3.png)

- Opção 4:

![Menu Principal e Reset](prints/menu_interativo/menu-4.png)

---

## 4. Considerações Finais

O projeto foi concluído com a integração dos requisitos avaliativos em um único sistema funcional em Java, mantendo a organização do código em pacote e demonstrando o uso prático de conceitos de POO, manipulação de arquivos JSON e interação em console. A implementação atende ao escopo proposto para a entrega da atividade prática avaliativa.
