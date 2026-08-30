Grupo 07:
- Samuel Miguel Barbosa - 2517428
- João Gabriel Rinaldi - 2510365
- Rafael - 2517979

repositório git: https://github.com/SamuelBarbosa11/Missao-Marte-Grupo7.git

<br>

Missão Marte — Exemplo OO (console)
=====================================

Este é um exemplo minimalista para aplicar conceitos de Orientação a Objetos no projeto "Missão Marte Unifor".

Conteúdo:

- `src/missao` — código fonte Java (classes: `Nave`, `Passageiro`, `Professor`, `Engenheiro`, `Asteroide`, `Missao`, `Main`).

Forma mais fácil de rodar (recomendada):

No Windows, na raiz do projeto, execute:

```cmd
run start
```

Esses arquivos fazem automaticamente:

- `chcp 65001` para configurar UTF-8 no terminal
- `javac -g -encoding UTF-8 -d out src/missao/*.java`
- `java -cp out missao.Main`

Comandos tradicionais (manual):

```bash
javac -g -encoding UTF-8 -d out src/missao/*.java
java -cp out missao.Main
```

Geração de documentação (Javadoc):

```bash
"C:\Program Files\Java\jdk-21\bin\javadoc.exe" -d docs -encoding UTF-8 -charset UTF-8 -sourcepath src missao
```

- Os arquivos HTML serão gerados em `docs/` (abra `docs/index.html`).

Depuração (opções):

- Console com `jdb` (depurador CLI):

```powershell
& 'C:\Program Files\Java\jdk-21\bin\jdb.exe' -classpath out missao.Main
# ou execute com caminho completo para jdb.exe se não estiver no PATH
```

- VS Code: instale o `Extension Pack for Java`, abra o projeto e use Run and Debug. Um `launch.json` de exemplo está descrito em `VSCODE-JAVA-DEBUG.md`.

Descrição rápida do jogo em console:

- Comandos: `w` (up), `s` (down), `a` (left), `d` (right), `c` (embarcar se houver passageiro na mesma posição), `q` (sair).
- Objetivo: embarcar todos os passageiros sem colidir com asteroides.

Observações e recomendações:

- Compile sempre com `-g` para obter informações de depuração (linhas/variáveis).
- Compile sempre com `-encoding UTF-8`. Os símbolos do mapa são emojis, e sem essa flag o `javac` assume o code page do Windows (`windows-1252` em português) e falha com `unmappable character`. No JDK 18 ou superior o padrão já é UTF-8 e o erro não aparece, mas a flag garante que o projeto também compile no JDK 17.
- O ranking é salvo em `ranking.json` no diretório de trabalho. Se quiser ignorar esse arquivo no Git, adicione-o ao `.gitignore` e remova do índice com:

```bash
git rm --cached ranking.json
git commit -m "Remove runtime ranking from tracking"
```

Para detalhes sobre como debugar com VS Code e configurações recomendadas, veja `VSCODE-JAVA-DEBUG.md`.

Para documentação do código e recursos úteis, veja os links abaixo:

- Javadoc (HTML gerado): [docs/index.html](docs/index.html)
- Documentação explicativa: [DOCUMENTACAO-CODIGO.md](DOCUMENTACAO-CODIGO.md)
- Guia de depuração no VS Code: [VSCODE-JAVA-DEBUG.md](VSCODE-JAVA-DEBUG.md)
- Código-fonte: [src/missao](src/missao)

Use este projeto como ponto de partida para exercícios de refatoração (SOLID), testes e aplicação de padrões.
