/*
 * crie uma variável para armazenar o nome e a quantidade de
 * experiência de um herói, depois utilize uma estrutura
 * de decisão para apresentar alguma das mensagens abaixo:
 * 
 * Se XP for menor do que 1.000 = Ferro  x 0  
 * Se XP for entre 1.0001 e 2.000 = Bronze 1
 * Se XP for entre 2.0001 e 5.000 = Prata x 2
 * Se XP for entre 5.0001 e 7.000 = Ouro  3
 * Se XP for entre 7.0001 e 8.000 = Platina 4
 * Se XP for entre 8.0001 e 9.000 = Ascendente  5
 * Se XP for entre 9.0001 e 10.000 = Imortal  6
 * Se XP for maior ou igual a 10.001 = Radiante 7
 * 
 * Ao final deve se exibir uma mensagem:
 * "O Herói de nome {nome} está no nível de {nível}"
 */

 import java.util.Scanner;
 public class classificadorDeNivelDeHeroi{
    public static void main (String[] args){
      Scanner input = new Scanner(System.in);

      String[] arrayElos = {"Ferro", "Bronze", "Prata", "Ouro", "Platina", "Ascendente", "Imortal", "Radiante"};

      String nomeDeHeroi;
      System.out.printf("Qual o seu nome de herói?");
      nomeDeHeroi = input.next();

      int nivelDeHeroi;
      System.out.printf("Qual o seu nível de herói?");
      nivelDeHeroi = input.nextInt();

      int valor = 6001;
      
      for(int i = 0; i < 8; i++){

        if(nivelDeHeroi <= 1000){
          System.out.printf("O herói %s, está no nível %s", nomeDeHeroi, arrayElos[0]);
          break;
        }

        if(nivelDeHeroi <= 2000){
          System.out.printf("O herói %s, está no nível %s", nomeDeHeroi, arrayElos[1]);
          break;
        }

        if(nivelDeHeroi <= 5000){
          System.out.printf("O herói %s, está no nível %s", nomeDeHeroi, arrayElos[2]);
          break;
        }

          if(nivelDeHeroi <= 7000){
          System.out.printf("O herói %s, está no nível %s", nomeDeHeroi, arrayElos[3]);
          break;
        }

        if(nivelDeHeroi <= valor){
          System.out.printf("O herói %s, está no nível %s", nomeDeHeroi, arrayElos[i+2]);
          break;
        }
        valor+=998;

      }
    }
    }
