Algoritmo "cadastro"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2022
Var
   // Se��o de Declara��es das vari�veis
   cadastro_cliente: vetor [1..4] de caractere
   cadastro_destino: vetor [1..3] de caractere
   menu,i:inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   cadastro_cliente[1]<- ""
   cadastro_cliente[2]<-""
   cadastro_cliente[3]<- ""
   cadastro_cliente[4]<- ""
   cadastro_destino[1]<- ""
   cadastro_destino[2]<- ""


   menu <- 1
   escreval("***********NIJU VIAGENS**********")
   escreval("Digite 1 para Realiazar seu Cadastro")
   leia (menu)
   se (menu<=1) entao
      escreval("Digite seu Nome: ")
      leia (cadastro_cliente[1])
      escreval("Digite seu RG: ")
      leia (cadastro_cliente[2])
      escreval("Digite seu CPF: ")
      leia (cadastro_cliente[3])
      escreval("Digite sua Data de Nascimento: ")
      leia (cadastro_cliente[4])
      escreval((cadastro_cliente[1]) ," Seu cadastro realizado com SUCESSO!!")

      escreval ("*******ESCOLHA SUA VIAGEM*******")
      escreval ("Digite 2 para Comprar Passagens")
      leia (menu)
      escreval("Digite seu destino ida e volta: ")
      leia (cadastro_destino[1])
      escreval("Digite a data da sua viagem: ")
      leia (cadastro_destino[2])
      fimse
      escreval(cadastro_cliente[1] ," Sua viagem com destino � " , cadastro_destino[1] , " com a data de embarque para o dia " , cadastro_destino[2] , " foi efetuado com SUCESSO!!!")




Fimalgoritmo