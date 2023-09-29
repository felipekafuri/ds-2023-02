# Descrição do Software para Processamento de Arquivo CSV

## Resumo

O software é projetado para ler um arquivo no formato CSV, calcular a soma das duas primeiras colunas para cada linha, e gerar um novo arquivo CSV que inclui uma coluna adicional contendo a soma calculada para cada linha.

## Funcionalidades

1. **Leitura de Arquivo CSV**:
   - O software deve ser capaz de ler um arquivo no formato CSV.
   - Cada linha do arquivo CSV é lida sequencialmente.

2. **Cálculo da Soma**:
   - Para cada linha lida, o software calcula a soma dos valores nas duas primeiras colunas.
   
3. **Geração de Novo Arquivo CSV**:
   - Um novo arquivo CSV é gerado.
   - Cada linha do novo arquivo contém a mesma informação da linha correspondente no arquivo original, com uma coluna adicional que contém a soma calculada.
   - O novo arquivo é salvo no sistema de arquivos.

## Fluxo de Trabalho

1. O usuário fornece o arquivo CSV como entrada.
2. O software lê o arquivo linha por linha.
3. Para cada linha, o software calcula a soma dos valores nas duas primeiras colunas.
4. O software gera um novo arquivo CSV, onde cada linha contém os dados originais mais a soma calculada como uma nova coluna.
5. O novo arquivo CSV é salvo no sistema de arquivos.

## Requisitos

- Linguagem de Programação: Qualquer linguagem moderna que suporte o processamento de arquivos CSV.
- Bibliotecas: Bibliotecas padrão para leitura e escrita de arquivos CSV.
