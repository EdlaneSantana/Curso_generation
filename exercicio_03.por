programa {
  funcao inicio() {

//PRIMEIRA QUEST�O
    inteiro multiplicando
    inteiro contador=1
 
        escreva("Digite um n�mero (1 - 10): ")
        leia(multiplicando)

        se (multiplicando<1 ou multiplicando>10){escreva("Digite um n�mero inteiro entre 1 e 10")}
        se(multiplicando>=1 e multiplicando<=10){
            enquanto(contador<=10)
            {
			      escreva("\n", multiplicando, " x ", contador, " = ", multiplicando * contador)
            contador ++
            }
        }  

//SEGUNDA QUEST�O

   inteiro num1 = 0
    inteiro num2 = 1

     escreva("### Bem-vindo! Vamos verificar se os n�mero s�o m�ltiplos de 3 ou 5 ###\n\n")

      para(inteiro contador=1; num2>num1;contador++)
      {
        escreva("\nDigite o primeiro n�mero do intervalo:\n")
        leia(num1)
        escreva("\nDigite o �ltimo n�mero do intervalo:\n")
        leia(num2)

      se(num2>num1){
        se (num1%5 ==0 e num1%3==0){escreva(num1," � m�ltiplo de 5 e 3\n")
          }senao{escreva(num1," n�o � m�ltiplo de 5 e 3\n")} 
        se (num2%5 ==0 e num2%3==0){escreva(num2," � m�ltiplo de 5 e 3\n")
          }senao{escreva(num2," n�o � m�ltiplo de 5 e 3\n")} 
      }
      }senao{escreva("Intervalo inv�lido!")}}


//TERCEIRA QUEST�O
    inteiro numeros
    inteiro par = 0
    inteiro impar = 0

    para(inteiro contador = 1; contador<=10; contador++){

      escreva("Digite o ", contador, "� n�mero: ")
      leia(numeros)

          se(numeros%2==0 e numeros!=0){
          par++}
          se(numeros%2 !=0){
          impar++
          }
    } 
    escreva("\nTotal de n�mero de pares: ", par)
    escreva("\nTotal de n�mero de �mpares: ", impar)

//QUARTA QUEST�O
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


//QUINTA QUEST�O
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

    escreva("Deseja continuar a leitura dos dados? Digite S para sim ou N para n�o:\n")
    leia(resp)

    }
    escreva("\nO n�mero de pessoas desenvolvedoras Backend � ", backend)
    escreva("\nO n�mero de mulheres desenvolvedoras Frontend � ", mulherFrontend)
    escreva("\nO n�mero de homens desenvolvedores Mobile maiores de 40 anos � ", homemMobile)
    escreva("\nO n�mero de mulheres desenvolvedoras FullStack menores de 30 anos � ", mulherFull)


//SEXTA QUEST�O
    inteiro number = 0
    inteiro auxiliar = 0

faca{
			escreva("Digite um n�mero: ")
			leia(number)
      se(number>0){
        auxiliar = auxiliar + number}
		}enquanto(number!=0)
escreva("\nA soma dos n�meros positivos �: ", auxiliar)

//S�TIMA QUEST�O
    inteiro numInt
    inteiro suporte = 0
    inteiro multiplo = 0
    real media

faca{
			escreva("Digite um n�mero: ")
			leia(numInt)

        se(numInt % 3 == 0 e numInt!=0){
          multiplo++
          suporte = suporte + numInt}
		}enquanto(numInt!=0)

    media = suporte / multiplo
    escreva("\nA media de todos os n�meros m�ltiplos de 3 �: ", media)


  }
}
