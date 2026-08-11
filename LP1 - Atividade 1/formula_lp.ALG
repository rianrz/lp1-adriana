Algoritmo "CalculoMediaFatec"
Var
   P1, E1, E2, X, SUB, API, EXF : real
   M1, mediaParcial, mediaFinal : real
   fezSUB, fezEXF : caractere

Inicio
   escreva("Digite a nota da Prova 1 (P1): ")
   leia(P1)
   escreva("Digite a nota da Entrega 1 (E1): ")
   leia(E1)
   escreva("Digite a nota da Entrega 2 (E2): ")
   leia(E2)
   escreva("Digite a nota de Atividades Extras (X): ")
   leia(X)
   escreva("Digite a nota do Projeto API: ")
   leia(API)

   escreva("Realizou a Prova Substitutiva (SUB)? (S/N): ")
   leia(fezSUB)

   se (fezSUB = "S") ou (fezSUB = "s") entao
      escreva("Digite a nota da Prova Substitutiva (SUB): ")
      leia(SUB)
   senao
      SUB <- 0
   fimse

   M1 <- (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15)

   se M1 > 5.9 entao
      mediaParcial <- (M1 * 0.5) + (API * 0.5)
   senao
      mediaParcial <- M1 * 0.5
   fimse

   escreva("Realizou o Exame Final (EXF)? (S/N): ")
   leia(fezEXF)

   se (fezEXF = "S") ou (fezEXF = "s") entao
      escreva("Digite a nota do Exame Final (EXF): ")
      leia(EXF)

      se mediaParcial > EXF entao
         mediaFinal <- mediaParcial
      senao
         mediaFinal <- EXF
      fimse
   senao
      mediaFinal <- mediaParcial
   fimse

   escreval("")
   escreval("==========================")
   escreval("Média Final: ", mediaFinal:2:2)
   escreval("==========================")

Fimalgoritmo
