@echo off
chcp 65001 >nul
cd /d "%~dp0"

javac -g -encoding UTF-8 -d out src/missao/*.java
if errorlevel 1 (
    echo.
    echo Falha na compilacao do projeto.
    exit /b %errorlevel%
)

java -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -cp out missao.Main
exit /b %errorlevel%
