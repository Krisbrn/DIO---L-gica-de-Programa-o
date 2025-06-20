let invoice = {
  name: "felipe",
  age : 26,
  products: {
    0: ["mouse 2xwm", 29.90],
    1: ["Teclado mecânico", 129.99],
    2: ["Monitor", 899.99],

  }
}

let name = "Felipe";
let products = ["mouse 2xw", "Teclado mecânico", "Monitor"];
let productsValues = [29.90, 129.99, 899.99];

generate(name, products, productsValues, age)

function generateInvoice(name, products, productsValues, age){
  console.log("O comprador é " + name);
  console.log("A idade é " + age);
  console.log("---------");
  console.log("O produto é " + age[0]);
  console.log("O valor é " + productsValues[0]);
}