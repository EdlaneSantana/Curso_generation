programa {
  funcao inicio() {

//PRIMEIRA QUESTÃO
    inteiro multiplicando
    inteiro contador=1
 
        escreva("Digite um nÚmero (1 - 10): ")
        leia(multiplicando)

        se (multiplicando<1 ou multiplicando>10){escreva("Digite um número inteiro entre 1 e 10")}
        se(multiplicando>=1 e multiplicando<=10){
            enquanto(contador<=10)
            {
			      escreva("\n", multiplicando, " x ", contador, " = ", multiplicando * contador)
            contador ++
            }
        }  

//SEGUNDA QUESTÃO

   inteiro num1 = 0
    inteiro num2 = 1
     escreva("### Bem-vindo! Vamos verificar se os número são múltiplos de 3 ou 5 ###\n\n")

       escreva("\nDigite o primeiro número do intervalo:\n")
        leia(num1)
        escreva("\nDigite o último número do intervalo:\n")
        leia(num2)

    se(num2>num1){
      para(inteiro contador=num1; contador<=num2;contador++)
      {
        se (contador%5 ==0 e contador%3==0){escreva(contador," é múltiplo de 5 e 3\n")
      }
      }senao{escreva("Intervalo inválido!")}}

//TERCEIRA QUESTÃO
    inteiro numeros
    inteiro par = 0
    inteiro impar = 0

    para(inteiro contador = 1; contador<=10; contador++){

      escreva("Digite o ", contador, "º número: ")
      leia(numeros)

          se(numeros%2==0 e numeros!=0){
          par++}
          se(numeros%2 !=0){
          impar++
          }
    } 
    escreva("\nTotal de número de pares: ", par)
    escreva("\nTotal de número de ímpares: ", impar)

//QUARTA QUESTÃO
    inteiro idade = 0
    inteiro idoso = 0
    inteiro adolescente = 0

enquanto(idade >=0){
      escreva("Digite uma idade: ")
      leia(idade)

          se(idade>50){
          idoso++}
          se(idade<21 e idade>=0){
          adolescente++}
    } 
    escreva("\nTotal de pessoas menores de 21 anos: ", adolescente)
    escreva("\nTTotal de pessoas maiores de 50 anos: ", idoso)


//QUINTA QUESTÃO
    inteiro idade, sexo
    inteiro backend = 0
    inteiro mulherFrontend = 0
    inteiro homemMobile = 0
    inteiro mulherFull = 0
    inteiro categoria = 0
    caracter resp = 's' 

    enquanto(resp == 's' ou resp =='S')
    {
    escreva("Informe a idade do colaborador: ")
    leia(idade)
    escreva("Informe o sexo digitando - \n 1 - MASCULINO \n 2 - FEMININO \n 3 - OUTROS\n")
    leia(sexo)
    escreva("Informe a categoria digitando - \n 1 - BACKEND \n 2 - FRONTEND \n 3 - MOBILE \n 4 - FULLSTACK\n")
    leia(categoria)
      se(categoria == 1){backend++}
      se(categoria == 2 e sexo == 2){mulherFrontend++}
      se(categoria == 3 e sexo == 1 e idade>40){homemMobile++}
      se(categoria == 4 e sexo == 2 e idade<30 e idade>=0){mulherFull++}

    escreva("Deseja continuar a leitura dos dados? Digite S para sim ou N para não:\n")
    leia(resp)

    }
    escreva("\nO número de pessoas desenvolvedoras Backend é ", backend)
    escreva("\nO número de mulheres desenvolvedoras Frontend é ", mulherFrontend)
    escreva("\nO número de homens desenvolvedores Mobile maiores de 40 anos é ", homemMobile)
    escreva("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos é ", mulherFull)


//SEXTA QUESTÃO
    inteiro number = 0
    inteiro auxiliar = 0

faca{
			escreva("Digite um número: ")
			leia(number)
      se(number>0){
        auxiliar = auxiliar + number}
		}enquanto(number!=0)
escreva("\nA soma dos números positivos é: ", auxiliar)

//SÉTIMA QUESTÃO
    inteiro numInt
    inteiro suporte = 0
    inteiro multiplo = 0
    real media

faca{
			escreva("Digite um número: ")
			leia(numInt)

        se(numInt % 3 == 0 e numInt!=0){
          multiplo++
          suporte = suporte + numInt}
		}enquanto(numInt!=0)

    media = suporte / multiplo
    escreva("\nA media de todos os números múltiplos de 3 é: ", media)


  }
}
