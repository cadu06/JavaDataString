﻿# JavaDataString

## Bibliotecas utilizadas:
java.text.SimpleDateFormat: Esta classe é utilizada para formatar e analisar datas em formato de string. Criamos um objeto SimpleDateFormat chamado formato para fazer a conversão da string de data para um objeto Date.

java.util.Date: Esta classe representa uma data e/ou hora específica. Utilizamos o método parse() da classe SimpleDateFormat para converter a string de data para um objeto Date chamado dataFormatada.

Formatação da Data: Criamos um novo objeto SimpleDateFormat chamado formatoData para formatar a data dataFormatada no formato desejado. Utilizamos o método format() para converter o objeto Date em uma string formatada no novo formato.

Imprimindo a Data Formatada: Por fim, imprimimos a data formatada usando System.out.println().
