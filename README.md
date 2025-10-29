Resolução de Problemas Estruturados - TDE3
Este repositório contém implementações em Java de ordenação de dados, como Comb sort, Gnome sort e Buckt sort.

Segue o comando da atividade:
Estude e Implemente :

Comb sort:  comb_sort.pdfLinks para um site externo.

Gnome sort: Gnome Sort - The Simplest Sort AlgorithmLinks para um site externo.

Bucket Sort: http://www.dcc.uchile.cl/~rbaeza/handbook/algs/4/423.sort.c.htmlLinks para um site externo.

 

Compare seus desempenho dos 3 algoritmos acima, com o bubble sort com flag de parada, selection sort e cocktail sort,  com os seguintes vetores:

int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

 



Lembrando que a regra sobre utilização de funções prontas se mantem para esta implementação.

Poste o link do seu git hub publico, com os algoritmos e os resultados em tabelas descrevendo quem foi melhor e para qual situação.

Faça tabelas ranqueando quem foi melhor(fez menos trocas entre elementos), quem fez menos interações(rodou laço). 


SEGUE OS RESULTADOS DA ATIVIDADE

<img width="673" height="254" alt="image" src="https://github.com/user-attachments/assets/98f1b242-76b1-4d2f-a558-acda44ee03b3" />

O Comb Sort teve o melhor equilíbrio geral. Ele realiza menos trocas que o Gnome Sort graças ao uso de gaps, o que reduz comparações diretas entre elementos distantes. Em vetores invertidos, também se destaca por evitar trocas desnecessárias.
O Bucket Sort foi o mais eficiente em número de iterações, especialmente com vetores já ordenados ou com valores bem distribuídos. Como ele divide os dados em “baldes”, percorre menos vezes o conjunto, exigindo poucas comparações e trocas.
O Gnome Sort, embora simples e fácil de implementar, é o menos eficiente. Ele realiza muitas trocas e iterações, pois precisa voltar várias posições sempre que encontra um elemento fora de ordem — o que o torna inadequado para listas grandes.
