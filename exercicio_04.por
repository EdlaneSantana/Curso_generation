programa {
  funcao inicio() {

// PRIMEIRA QUESTÃO
  inteiro vetor[10] = {2,5,1,3,4,9,7,8,10,6}, i=0, soma = 0

  enquanto(i<10){
    para(inteiro j=0; j< 9-i; j++){
      se(vetor[j]<vetor[j+1]){
        soma = vetor[j]
        vetor[j] = vetor[j+1]
        vetor[j+1] = soma
        }
    }
  i++}
    para(inteiro t=0;t<10;t++1){
    escreva(vetor[t],"| ")
    }

// SEGUNDA QUESTÃO
  inteiro caixa[10], i=0, y=0, soma =0, tamanho=10
  real media = 0

  enquanto(i<tamanho){
    escreva("Digite o ",i+1,"° número: ")
    leia(caixa[i])
    soma+=caixa[i]
    media = soma/tamanho
    i++
  }
  escreva("\nElementos nos índices ímpares: ")
    para(y; y<tamanho; y++){
       se(y%2!=0){escreva(caixa[y], " ")}
        }

  escreva("\nElementos pares: ")
    para(inteiro a = 0;a<tamanho; a++){
       se(caixa[a]%2 == 0){escreva(caixa[a], " ")}
    }
    escreva("\nSoma: ",soma, "\nMedia: ", media, "\n")

// TERCEIRA QUESTÃO   
    inteiro matriz[3][3],l=0, c=0, k=2, t=0, somaP = 0, somaS = 0

    para(inteiro l=0; l<3; l++){
      para(inteiro c=0; c<3; c++){
        escreva("Digite um valor para a posição [", l, "][", c, "]: ")
				leia(matriz[l][c]) 
        }
        }

    escreva("\nElementos da Diagnonal Principal: ")
			enquanto(t<3){
        para(inteiro i=0;i<3;i++){
        escreva(matriz[t][i]," " )
        somaP+=matriz[t][i]
        t++
        }
			}

    escreva("\nElementos da Diagnonal Secundária: ")
    para(inteiro contador = 0; contador<3; contador++){
      escreva(matriz[contador][k-contador], " ")
      somaS+=matriz[contador][k-contador]
    }  

    escreva("\nSoma dos Elementos da Diagonal Principal: ", somaP, "\nSoma dos Elementos da Diagonal Secundária: ", somaS, "\n")



//QUARTA QUESTÃO




  }
}
