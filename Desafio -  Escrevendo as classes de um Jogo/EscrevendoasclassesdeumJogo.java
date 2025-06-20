import java.util.Scanner;
public class EscrevendoasclassesdeumJogo{
  
static class heroi{
  String nome;
  int idade;
  String tipo;
  String sempreAtacar;

  void atacar(){
    System.out.printf("O %s atacou %s", tipo, sempreAtacar);
  }

}

 public static void main(String args[]){
  Scanner input = new Scanner(System.in);


  heroi p = new heroi();


  //características do heroi
  System.out.println("Digite o nome do herói");
  p.nome = input.next();

  System.out.println("Digite a idade do herói");
  p.idade = input.nextInt();

  System.out.println("Qual a classe do herói?");
  p.tipo = input.next();

  if(p.tipo.equals("mago")){
    p.sempreAtacar = "usando magia";
  }

  if(p.tipo.equals("guerreiro")){
  p.sempreAtacar = "usando uma espada";
  }

  if(p.tipo.equals("monge")){
  p.sempreAtacar = "usando artes marciais";
  }

  if(p.tipo.equals("ninja")){
  p.sempreAtacar = "usando uma shuriken";
  }
  else{
    p.sempreAtacar = "usando uma habilidade desconhecida";
  }

  System.out.println("Um monstro apareceu, ataque ele herói");
  p.atacar();
}

}




/*
 * Instruções para entrega
# 3️⃣ Escrevendo as classes de um Jogo

**O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões
- Funções
- Classes e Objetos

## Objetivo:

Crie uma classe generica que represente um herói de uma aventura e que possua as seguintes propriedades:

- nome
- idade
- tipo (ex: guerreiro, mago, monge, ninja )

além disso, deve ter um método chamado atacar que deve atender os seguientes requisitos:

- exibir a mensagem: "o {tipo} atacou usando {ataque}")
- aonde o {tipo} deve ser concatenando o tipo que está na propriedade da classe
- e no {ataque} deve seguir uma descrição diferente conforme o tipo, seguindo a tabela abaixo:

se mago -> no ataque exibir (usou magia)
se guerreiro -> no ataque exibir (usou espada)
se monge -> no ataque exibir (usou artes marciais)
se ninja -> no ataque exibir (usou shuriken)

## Saída

Ao final deve se exibir uma mensagem:

- "o {tipo} atacou usando {ataque}"
  ex: mago atacou usando magia
  guerreiro atacou usando espada
 

 
Bons estudos 😉
 */