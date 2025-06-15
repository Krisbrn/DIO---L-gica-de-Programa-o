// estrutura de decisão
// switch/case/break/default
let fruta = "banana";

switch (fruta){
  case "laranja": 
    console.log("suco de laranja");
    console.log("segunda mensagem")
    break;

  case "banana":
  case "morango":
    console.log("vitamina de " + fruta);
    break; // se n tivesse e o caso fossse verdadeiro, o case maçã ia ser executado

  case "maçã":
    console.log("suco de maçã");

  default:
    console.log("suco genérico");
}