programa {

inclua biblioteca Matematica --> Mat

  funcao inicio() {
    
//Primeira Quest�o
    inteiro numero

    escreva("Digite um n�mero inteiro para sabermos se � PAR ou �MPAR e POSITIVO ou NEGATIVO: \n")
    leia(numero)

    se(numero%2 == 0 e numero>0){
      escreva("O N�mero ", numero," � par e positivo!")
    } senao se(numero%2 ==0 e numero<0){
      escreva("O N�mero ", numero," � par e negativo!")
    } senao se(numero%2 <> 0 e numero>0){
      escreva("O N�mero ", numero," � �mpar e positivo!")
    } senao se(numero%2 <> 0 e numero<0){
      escreva("O N�mero ", numero," � �mpar e negativo!")
    } senao{
      escreva("O N�mero ", numero," � neutro")
    }

//Segunda Quest�o
  inteiro opcao, quantidade 

  escreva("Digite a op��o desejada: ")
  escreva("\n 1 - Cachorro-quente,\n 2 - X-Salada,\n 3 - X-Bacon,\n 4 - Bauru,\n 5 - Refrigerante,\n 6 - Suco de laranja\n ** ")
  leia(opcao)
  escreva("\n Compreendi. Informe agora a quantidade desejada:\n ** ")
  leia(quantidade)

  		escolha(opcao)
		{
			caso 1:
				escreva("\nProduto: Cachorro quente\n")
        escreva("Valor total: R$ ",quantidade * 10.00)
				pare
			caso 2:
				escreva("\nProduto: X-Salada\n")
        escreva("Valor total: R$ ",quantidade * 15.00)
				pare
			caso 3:
				escreva("\nProduto: X-Bacon\n")
        escreva("Valor total: R$ ",quantidade * 18.00)
				pare
			caso 4:
				escreva("\nProduto: Bauru\n")
        escreva("Valor total: R$ ",quantidade * 12.00)
				pare
			caso 5:
				escreva("\nProduto: Refrigerante\n")
        escreva("Valor total: R$ ",quantidade * 8)
				pare
			caso 6:
				escreva("\nProduto: Suco de laranja\n")
        escreva("Valor total: R$ ",quantidade * 13.00)
				pare
			caso contrario:
				escreva("Op��o inv�lida!")

//Terceira Quest�o
  inteiro idade

  escreva("Digite a sua idade: ")
  leia(idade)

  se(idade>=16 e idade<18){
    escreva("A pessoa est� apta a votar e o voto � facultativo. ")
    } senao se (idade>=18 e idade<65){
    escreva("A pessoa est� apta a votar e o voto � obrigat�rio. ")
    }senao se(idade>=65){
      escreva("A pessoa est� apta a votar e o voto � facultativo. ")
    }senao{
      escreva("A pessoa n�o est� apta a votar.")
    }
  }

//Quarta Quest�o

   real salario
    escreva("Informe o sal�rio: R$ ")
    leia(salario)

    se(salario<=2000.00){
      escreva("Imposto de renda: R$ ", Mat.arredondar(salario,2))
    } senao se(salario>2000.00 e salario<=3000.00){
      escreva("Imposto de renda: R$ ", Mat.arredondar(((8/ 100) * salario),2))
    } senao se(salario>3000.00 e salario<=4500.00){
      escreva("Imposto de renda: R$ ", Mat.arredondar(((18/ 100) * salario),2))
    } senao {
      escreva("Imposto de renda: R$ ", Mat.arredondar(((28/ 100) * salario),2))
    }


//Quinta Quest�o
    cadeia palavra1, palavra2, palavra3

    escreva("Digite a primeira palavra\n")
    leia(palavra1)

    escreva("\nDigite a segunda palavra\n")
    leia(palavra2)

    escreva("\nDigite a terceira palavra\n")
    leia(palavra3)

      se(palavra1 == "vertebrado"){
      se(palavra2 == "ave"){
        se(palavra3=="carnivoro"){escreva("�guia")}
        se(palavra3=="onivoro"){escreva("Pomba")
        }senao{escreva("N�o identificado")} 
      }

      se(palavra2 == "mamifero"){
        se(palavra3=="onivoro"){escreva("Homem")}
        se(palavra3=="herbivoro"){escreva("Vaca")}
      }senao{escreva("N�o identificado")}
    }
    se(palavra1 == "invertebrado"){
      se(palavra2 =="inseto"){
        se(palavra3=="hematofago"){escreva("Pulga")}
        se(palavra3=="herbivoro"){escreva("Lagarta")}
      }senao{escreva("N�o identificado")}

      se(palavra2=="anelideo"){
        se(palavra3=="hematofago"){escreva("Sanguessuga")}
        se(palavra3=="onivoro"){escreva("Minhoca")}
      senao{escreva("N�o identificado")}
      }

  }
}
