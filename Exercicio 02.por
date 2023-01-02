programa {
inclua biblioteca Matematica -->Mat

  funcao inicio() {

  real nota1, nota2, nota3, nota4, media

  escreva("\nDigite a primeira nota: ")
  leia(nota1)

  escreva("\nDigite a segunda nota: ")
  leia(nota2)

  escreva("\nDigite a terceira nota: ")
  leia(nota3)

  escreva("\nDigite a quarta nota: ")
  leia(nota4)

  media = (nota1 + nota2 + nota3+ nota4)/4
  escreva("\nA média final é: ", (Mat.arredondar(media,1))

  }
}

