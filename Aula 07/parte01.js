// AND ( && ) - 100 moedas coletadas E 1 item estrela
let idade = 18;
let vistoVerificado = false;
let resultado = (idade >= 18) && (vistoVerificado === true)
console.log(resultado )

let moedasColetadas = 100;
let item = "estrela";
resultado = (moedasColetadas === 100) && (item === "estrela");
console.log(resultado);

// OR ( || ) - nosso boneco só pode sair se tiver sem chuva OU com guarda-chuva
let tempo = "chuva";
item = "pá";
let podeSair = (tempo !== "chuva") || (item === "guarda chuva");
console.log("nosso personagem pode sair? " + podeSair);

// NOT ( ! ) - nega uma afirmação
tempo = "chuva";
let horario = 8;
resultado = !
((tempo === "chuva") && (horario > 6));
console.log(resultado);