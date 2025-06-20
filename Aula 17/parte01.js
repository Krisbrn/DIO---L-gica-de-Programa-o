class formaDeBolo{
  constructor(saborDaMassa, saborRecheio){
    this.saborDaMassa = saborDaMassa;
    this.saborRecheio = saborRecheio;
  }

  escrever(){
    console.log("um delicioso bolo de this.saborDamassa, com recheio de this.saborRecheio")
  } // precisa de ${yhis.saborDamassa}
}

let boloFesta = new formaDeBolo("massa de chocolate", "recheio de nutella");

