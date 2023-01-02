programa {

  funcao inicio() {
    real salarioBruto, adicionalNoturno, horasExtras, desconto, salarioLiquido

    escreva("\nDigite o Salário: $")
    leia(salarioBruto)

    escreva("\nDigite o valor do Adicional Noturno: $")
    leia(adicionalNoturno)

    escreva("\nDigite a quantidade de Horas Extras: ")
    leia(horasExtras)

    escreva("\nDigite o valor do Desconto: $")
    leia(desconto)

    salarioLiquido = (salarioBruto + adicionalNoturno +(horasExtras * 5) - desconto)
    escreva("\nO Salário Líquido é: $",salarioLiquido)
  }
}

